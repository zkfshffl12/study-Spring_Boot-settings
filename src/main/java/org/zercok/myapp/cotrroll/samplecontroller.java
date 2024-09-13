package org.zercok.myapp.cotrroll;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@NoArgsConstructor

@Controller
public class samplecontroller {

    @PostMapping(path = "longin", params = {"userid","userpw"})
    String authenticate(String userid, String userpw, Model model){
        log.trace("authenticate({},{} invoked",userid , userpw);

        model.addAttribute("userid", userid);
        model.addAttribute("userpw", userid);

        return "authok";
    }



    @PostMapping(path = "longin", params = {"userid","userpw"})
    String authenticate(String userid, String userpw, Model model){
        log.trace("authenticate({},{} invoked",userid , userpw);

       this.mockMVC.perform(
               post("/login")
                       .param("userid","trinity")
                       .param("userpw", 1234)
       )

    }


    @GetMapping("/redirect")
    String redirect(RedirectAttributes rttrs){
        log.trace("redirect() invoked");

        rttrs.addAttribute("KEY1","VALUE1");
        rttrs.addAttribute("KEY2","VALUE2");

        return "redirect:/XXX";
    }
}
