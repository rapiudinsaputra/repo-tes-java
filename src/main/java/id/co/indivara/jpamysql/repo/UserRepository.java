package id.co.indivara.jpamysql.repo;

import id.co.indivara.jpamysql.entity.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;
//jika ada method tambahan wajib di tambahkan anotation transactional
@Transactional
public interface UserRepository extends CrudRepository<User,Integer> {

    List<User> findByName (String name);


     void deleteByEmail(String email);
}
