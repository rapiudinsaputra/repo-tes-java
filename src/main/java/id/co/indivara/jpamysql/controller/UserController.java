package id.co.indivara.jpamysql.controller;
import id.co.indivara.jpamysql.entity.ResponseMessage;
import id.co.indivara.jpamysql.entity.User;
import id.co.indivara.jpamysql.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class UserController {

    @Autowired
    @Qualifier("userRepository")

    private UserRepository userRepository;

    @PostMapping("/create")
    public ResponseMessage createUser(@RequestBody User user){
        ResponseMessage responseMessage=new ResponseMessage();
        try{
            userRepository.save(user);
            responseMessage.setCode(200);
            responseMessage.setMessage("INSERT BERHASIL");
        }catch (Exception ex){
            responseMessage.setCode(201);
            responseMessage.setMessage("INSERT GAGAL "+ex.getMessage());
        }
        return responseMessage;
    }

    @PostMapping("/update")
    public ResponseMessage updateUser(@RequestBody User user){
        ResponseMessage responseMessage=new ResponseMessage();
        try{
            User c=(User)userRepository.findById(user.getId()).get();
            c.setName(user.getName());
            c.setEmail(user.getEmail());
            userRepository.save(c);
            responseMessage.setCode(200);
            responseMessage.setMessage("Yah update Berhasil");
        }catch (Exception ex){
            responseMessage.setCode(201);
            responseMessage.setMessage("update GAGAL "+ex.getMessage());
        }
        return responseMessage;

    }

    @DeleteMapping("/delete/{id}")
    public ResponseMessage deleteUser(@PathVariable Integer id){
        ResponseMessage responseMessage=new ResponseMessage();
        try{
            userRepository.deleteById(id);
            responseMessage.setCode(200);
            responseMessage.setMessage("DELETE BERHASIL");
        }catch (Exception ex){
            responseMessage.setCode(201);
            responseMessage.setMessage("DELETE GAGAL "+ex.getMessage());
        }
        return responseMessage;
    }

    @GetMapping("/find/{id}")
    public User findUser(@PathVariable Integer id){
        User user=userRepository.findById(id).get();
        return user;
    }

    @GetMapping("/all")
    public ArrayList<User> findAllUser(){
        ArrayList<User> users=(ArrayList<User>) userRepository.findAll();
        return users;
    }

    @GetMapping("/findname/{name}")
    public ArrayList<User> findUserByName(@RequestParam ("name")String name){
        ArrayList<User> users=(ArrayList<User>) userRepository.findByName(name);
        return users;
    }

    @GetMapping("/deleteemail/{email}")
    public ResponseMessage deleteUserByEmail(@PathVariable("email") String email){
        ResponseMessage responseMessage=new ResponseMessage();
        try{
            userRepository.deleteByEmail(email);
            responseMessage.setCode(200);
            responseMessage.setMessage("DELETE EMAIL BERHASIL");
        }catch (Exception ex){
            responseMessage.setCode(201);
            responseMessage.setMessage("INSERT GAGAL "+ex.getMessage());
        }
        return responseMessage;
    }
}