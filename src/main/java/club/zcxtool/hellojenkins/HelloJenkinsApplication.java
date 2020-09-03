package club.zcxtool.hellojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class HelloJenkinsApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloJenkinsApplication.class, args);
    }
    @GetMapping
    public String test(){
        return "构建大成功！";
    }


}
