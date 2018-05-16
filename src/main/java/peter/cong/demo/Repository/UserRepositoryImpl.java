package peter.cong.demo.Repository;

import org.springframework.stereotype.Repository;
import peter.cong.demo.Entity.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by CongN on 3/16/2018.
 */
@Repository
public class UserRepositoryImpl implements UserRepository{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        this.entityManager.persist(userEntity);
        return userEntity;
    }

}
