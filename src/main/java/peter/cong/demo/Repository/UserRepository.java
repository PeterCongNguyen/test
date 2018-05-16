package peter.cong.demo.Repository;

import peter.cong.demo.Entity.UserEntity;

/**
 * Created by CongN on 3/16/2018.
 */
public interface UserRepository {
    UserEntity saveUser(UserEntity userEntity);

}
