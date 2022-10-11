package Wku.OSS.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class TestController {

    @PostMapping("/")
    public String index(){

        return "index";
    }
}
