package peter.cong.demo.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import peter.cong.demo.Entity.MentorEntity;
import peter.cong.demo.Service.MentorService;

/**
 * Created by CongN on 1/16/2018.
 */
@RestController
@RequestMapping("/api/mentor")
public class MentorRestController implements MentorPath {

    @Autowired
    MentorService mentorService;

    @Override
    @PostMapping(value = "")
    public ResponseEntity saveMentorDB(@RequestBody MentorEntity mentorEntity) {
        mentorService.saveMentor(mentorEntity);
        return ResponseEntity.ok(mentorEntity);
    }

    @GetMapping(value = "")
    @ResponseBody
    public Iterable findByAll(){
        Iterable iterableMentor  = mentorService.findByAll();
        return iterableMentor;
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity deleteMentor(@PathVariable("id")Long id){
        return ResponseEntity.ok(mentorService.deleteMentor(id));
    }

    @Override
    public ResponseEntity findOne(@PathVariable(name = "id") Long id) {
        return null;
    }


    @Override
    @GetMapping(value = "/update/{id}")
    public void updateMentor(@PathVariable(name = "id") Long id, MentorEntity mentorEntity) {
            try{
                mentorEntity = mentorService.findByOne(id);
                mentorEntity.setName(mentorEntity.getName());
                mentorEntity.setAge(mentorEntity.getAge());
                mentorEntity.setPhone(mentorEntity.getPhone());
            }catch(Exception ex){
                ex.toString();
            }

        return ;
    }
}
