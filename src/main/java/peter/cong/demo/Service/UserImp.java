package peter.cong.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import peter.cong.demo.Entity.UserEntity;
import peter.cong.demo.Repository.UserRepository;

/**
 * Created by CongN on 3/16/2018.
 */
@Service
@Transactional
public class UserImp implements UserService{


    UserRepository userRepository;
    @Autowired
    public UserImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(UserEntity userEntity) {
        this.userRepository.saveUser(userEntity);
    }
}
