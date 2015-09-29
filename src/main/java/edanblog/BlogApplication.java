package edanblog;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by michaeljone on 15. 9. 29..
 */
@Controller
@EnableAutoConfiguration
public class BlogApplication {
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }
}
