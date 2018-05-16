package peter.cong.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import peter.cong.demo.Entity.MentorEntity;
import peter.cong.demo.Entity.UserEntity;
import peter.cong.demo.Service.MentorService;
import peter.cong.demo.Service.UserService;
/**
 * Created by CongN on 2/1/2018.
 */
@Controller
public class MentorController {

    @Autowired
    MentorService mentorService;

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    	
    @GetMapping("/register")
    public String newUser(Model model){
        model.addAttribute("userEntity", new UserEntity());
        return "register";
    }

    @GetMapping( "/addMentor")
    public String mentor(Model model){
        model.addAttribute("mentorEntity", new MentorEntity());
        return "addMentor";
    }

    @PostMapping("/addMentor")
    public String saveMentor(MentorEntity mentorEntity){
        mentorService.saveMentor(mentorEntity);
        return "mentor";
    }

    @GetMapping( "/mentor")
    public String listMentor(Model model){
     model.addAttribute("listMentor", mentorService.findByAll());
     return "redirect:/mentor";
    }
    
    @GetMapping("/delete/{id}")
    public String editMentor(@PathVariable("id") Long id) {
        mentorService.deleteMentor(id);
    	return "redirect:/mentor";
    }



}
