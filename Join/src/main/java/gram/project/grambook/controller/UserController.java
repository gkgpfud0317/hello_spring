package gram.project.grambook.controller;

import gram.project.grambook.payload.request.UserRequest;
import gram.project.grambook.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    @PostMapping("/join")
    public void join(@RequestBody UserRequest request) {
        service.join(request);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<String> checkNameDuplicate(@PathVariable String name) {
        return service.checkNameDuplicate(name);
    }

    @GetMapping("/userId/{userId}")
    public ResponseEntity<String> checkUserIdDuplicate(@PathVariable String userId) {
        return service.checkUserIdDuplicate(userId);
    }

}

