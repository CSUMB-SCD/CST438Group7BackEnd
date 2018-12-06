package cst438team17.userdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import cst438team17.userdb.entities.Users;

@CrossOrigin(origins = "https://frontendprctc.herokuapp.com/")
@RestController
public class UserdbController{

    @Autowired
    UserRepository UsersRepository;

    @GetMapping ("/allUsers")
    public List<Users> getAll () {
        List<Users> result = UsersRepository.findAll();
        return result;
    }
    	
    @GetMapping("/id/{id}")
    public Users getUserById (@PathVariable String id) {
        Users result = UsersRepository.findByRepoId(id);
        return result;
    }

    @GetMapping("/signin/{username}")
    public List<Users> getByUsername (@PathVariable String username) {
        List<Users> result = UsersRepository.findByUsername(username);
        return result;
    }

}

