package gram.project.grambook.controller;

import gram.project.grambook.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService service;

    @PostMapping("/join")
    public void generateToken(@Valid @RequestBody ) {

    }

}

