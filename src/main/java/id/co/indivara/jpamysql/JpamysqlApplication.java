package id.co.indivara.jpamysql;

import com.sun.corba.se.impl.activation.CommandHandler;
import id.co.indivara.jpamysql.entity.User;
import id.co.indivara.jpamysql.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JpamysqlApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpamysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Scanner sc=new Scanner(System.in);
//		while (true){
//			System.out.println("::::[Menu Data]:::::");
//			System.out.println("1. entri data");
//			System.out.println("2. Update Data");
//			System.out.println("3. Find Data");
//			System.out.println("4. Delete Data");
//			System.out.println("5. Display All data");
//			System.out.println("6. FInd By Name");
//			System.out.println("7. Delete By Email");
//
//			System.out.println("Pilihan anda 1/2/3/4/5/6/7 ? :]");
//			String pilihan=sc.nextLine();
//			if (pilihan.equalsIgnoreCase("1")){
//				System.out.println("::::[Entry Data]:::::");
//				System.out.println("Nama : ");
//				String nama=sc.nextLine();
//				System.out.println("Email : ");
//				String email=sc.nextLine();
//				User c=new User(nama,email);
//				userRepository.save(c);
//				System.out.println("sukses....");
//
//			}else if (pilihan.equalsIgnoreCase("2")){
//				System.out.println("::::[Update Data]:::::");
//				System.out.println("ID");
//				String id=sc.nextLine();
//				User c=userRepository.findById(Integer.parseInt(id)).get();
//
//				System.out.println("Nama ["+c.getName()+"]: ");
//				String nama=sc.nextLine();
////
//				if(!nama.isEmpty()){
//					c.setName(nama);
//				}
//				System.out.println("Email ["+c.getEmail()+"]: ");
//				String email=sc.nextLine();
//				if(!email.isEmpty()){
//					c.setEmail(email);
//				}
//				userRepository.save(c);
//				System.out.println("sukses....");
//
//
//				//cari by ID
//			}else if (pilihan.equalsIgnoreCase("3")){
//				System.out.println("::::[Find ID Data]:::::");
//				System.out.println("ID:");
//				String id=sc.nextLine();
//				User c=(User) userRepository.findById(Integer.parseInt(id)).get();
//
//				System.out.println("Nama ["+c.getName()+"]: ");
//				System.out.println("Nama ["+c.getEmail()+"]: ");
//
//
//			}else if (pilihan.equalsIgnoreCase("4")){
//				System.out.println("::::[DELETE Data]:::::");
//				System.out.println("ID:");
//				String id=sc.nextLine();
//				userRepository.deleteById(Integer.parseInt(id));
//
//
//			}else if (pilihan.equalsIgnoreCase("5")){
//				System.out.println("::::[Display All Data]:::::");
//				for (User user: userRepository.findAll()){
//
//					System.out.println("Nama ["+user.getName()+"]: ");
//					System.out.println("Nama ["+user.getEmail()+"]: ");
//					System.out.println("sukses...");
//				}
//
//			}else if (pilihan.equalsIgnoreCase("6")){
//				System.out.println("::::[Find Data By Name]:::::");
//				System.out.println("Nama : ");
//				String nama=sc.nextLine();
//
//				for (User user: userRepository.findByName(nama)){
//					System.out.println("Nama ["+user.getName()+"]: ");
//					System.out.println("Nama ["+user.getEmail()+"]: ");
//					System.out.println("sukses...");
//				}
//
//			}else if (pilihan.equalsIgnoreCase("7")){
//				System.out.println("::::[Delete  Data By Email]:::::");
//				System.out.println("email : ");
//				String email=sc.nextLine();
//				userRepository.deleteByEmail(email);
//
////			}
//
//		}
	}
}
