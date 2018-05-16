package peter.cong.demo.Repository;

import peter.cong.demo.Entity.MentorEntity;

/**
 * Created by CongN on 1/16/2018.
 */
public interface MentorRepository{
    MentorEntity saveMentorDB(MentorEntity mentorEntity);
    Iterable<MentorEntity> findAll();
    MentorEntity findByOne(Long id);
    boolean deleteMentorDB(MentorEntity mentorEntity);
    void updateMentorDB(MentorEntity mentorEntity, Long id);
}
