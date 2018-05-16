package peter.cong.demo.RestController;

import org.hibernate.engine.spi.ManagedEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import peter.cong.demo.Entity.MentorEntity;

/**
 * Created by CongN on 1/24/2018.
 */
public interface MentorPath {
    @GetMapping("")
    Iterable<ManagedEntity> findByAll();
    @PostMapping("")
    ResponseEntity saveMentorDB(@RequestBody MentorEntity mentorEntity);
    @GetMapping("/{id}")
    ResponseEntity findOne(@PathVariable(name = "id") Long id);
    @DeleteMapping("/{id}")
    ResponseEntity deleteMentor(@PathVariable(name = "id") Long id);
    @GetMapping("/update/{id}")
    void updateMentor(@PathVariable(name = "id") Long id, MentorEntity mentorEntity);
}
