package web.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    /**
     * api 호출 test
     */
    @GetMapping("/test")
    public String selectTest() {
        return "test";
    }
}
