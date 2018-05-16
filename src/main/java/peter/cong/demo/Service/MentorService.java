package peter.cong.demo.Service;

import peter.cong.demo.Entity.MentorEntity;

/**
 * Created by CongN on 1/16/2018.
 */
public interface MentorService {
    void saveMentor(MentorEntity mentorEntity);
    Iterable<MentorEntity> findByAll();
    boolean deleteMentor(Long id);
    MentorEntity findByOne(Long id);
    void updateMentor(Long id, MentorEntity mentorEntity);
}
