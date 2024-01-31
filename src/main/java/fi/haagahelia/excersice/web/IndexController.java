package fi.haagahelia.excersice.web;

import fi.haagahelia.excersice.domain.Friend;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class IndexController {



    @GetMapping("/index")
    public String friendFrom(Model model) {

        List<Friend> friends = new ArrayList<>();
        friends.add(new Friend("John West"));
        friends.add(new Friend("Kate Bower"));

        model.addAttribute("friends", friends);
        return "index";
    }

    @GetMapping("newFriend")
    public String newFriend(Model model){
        model.addAttribute("friend", new Friend());
        return "index";
    }
    @PostMapping("addFriend")
    public String addFriend(@ModelAttribute("friend") Friend friend){
        return "redirect:/index";
    }
}
