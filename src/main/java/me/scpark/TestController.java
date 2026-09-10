package me.scpark;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/hi")
    public String hi(){
        return "안녕하세요?'http://localhost:8080/hi' 에 대한 응답입니다.";
    }

    @PostMapping("/test")
    public String PostTest(){
        return "안녕하세요?/test Post 에 대한 응답입니다.";
    }
    @PutMapping("/test")
    public String PutTest(){
        return "안녕하세요?/test Put 에 대한 응답입니다.";
    }
    @DeleteMapping("/test")
    public String DeleteTest(){
        return "안녕하세요?/test Delete 에 대한 응답입니다.";
    }

    @GetMapping("/test")
    public String Test(){
        return "안녕하세요?/test 에 대한 응답입니다.";
    }
    @GetMapping("/member")
    public String getAllMember(){
        return "";
    }
}
