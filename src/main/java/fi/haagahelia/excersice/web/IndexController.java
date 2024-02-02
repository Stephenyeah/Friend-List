package fi.haagahelia.excersice.web;

import fi.haagahelia.excersice.domain.Friend;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    List<Friend> friends = new ArrayList<>();

    @GetMapping("/index")
    public String friendFrom(String friendName, Model model) {

        // friends.add(new Friend("John West"));
        // friends.add(new Friend("Kate Bower"));

        model.addAttribute("friends", friends);
        model.addAttribute("friend", new Friend());

        if (friendName != null && !friendName.isEmpty()) {
            Friend newfriend = new Friend(friendName);
            friends.add(newfriend);

        }

        return "index";
    }

}
