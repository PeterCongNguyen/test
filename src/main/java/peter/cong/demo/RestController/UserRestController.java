package peter.cong.demo.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import peter.cong.demo.Entity.UserEntity;
import peter.cong.demo.Service.UserService;

/**
 * Created by CongN on 3/16/2018.
 */
@RestController
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    UserService userService;

    @PostMapping(value = "")
    public ResponseEntity saveUser(@RequestBody UserEntity userEntity){
        userService.saveUser(userEntity);
        return  ResponseEntity.ok(userEntity);
    }


}
