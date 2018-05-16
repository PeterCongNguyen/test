package peter.cong.demo.Repository;

import org.springframework.stereotype.Repository;
import peter.cong.demo.Entity.MentorEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.TypedQuery;

/**
 * Created by CongN on 1/16/2018.
 */
@Repository
public class MentorRepositoryImpl implements MentorRepository{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public MentorEntity saveMentorDB(MentorEntity mentorEntity) {
        this.entityManager.persist(mentorEntity);
        return mentorEntity;
    }

    @Override
    public Iterable<MentorEntity> findAll() {
        String sql = "select a from " + MentorEntity.class.getName() + " as a";
        TypedQuery<MentorEntity> query = this.entityManager.createQuery(sql, MentorEntity.class);
        return query.getResultList();
    }


    @Override
    public MentorEntity findByOne(Long id) {
        return this.entityManager.find(MentorEntity.class, id);
    }

    @Override
    public boolean deleteMentorDB(MentorEntity mentorEntity) {
        this.entityManager.remove(mentorEntity);
        return this.entityManager.contains(mentorEntity);
    }

    @Override
    public void updateMentorDB(MentorEntity mentorEntity, Long id) {
        if (mentorEntity.equals(findByOne(id))){
            String sql = "update a form" + mentorEntity.getName() ;
        }
    }
}
