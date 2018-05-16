package peter.cong.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import peter.cong.demo.Entity.MentorEntity;
import peter.cong.demo.Repository.MentorRepository;

/**
 * Created by CongN on 1/16/2018.
 */
@Service
@Transactional
public class MentorImp implements MentorService  {

    MentorRepository mentorRepository;

    @Autowired
    public MentorImp(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    @Override
    public void saveMentor(MentorEntity mentorEntity) {
        this.mentorRepository.saveMentorDB(mentorEntity);
    }

    @Override
    public Iterable<MentorEntity> findByAll() {
        return mentorRepository.findAll();
    }

    @Override
    public boolean deleteMentor(Long id) {
        MentorEntity mentorEntity = this.mentorRepository.findByOne(id);
        return mentorRepository.deleteMentorDB(mentorEntity);
    }

    @Override
    public MentorEntity findByOne(Long id) {
        return mentorRepository.findByOne(id);
    }

    @Override
    public void updateMentor(Long id, MentorEntity mentorEntity) {

    }
}
