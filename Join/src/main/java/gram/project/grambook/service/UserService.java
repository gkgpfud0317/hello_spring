package gram.project.grambook.service;

import gram.project.grambook.payload.request.UserRequest;
import gram.project.grambook.entity.User;
import gram.project.grambook.entity.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public void join(UserRequest request) {
        User user = repository.save(User.builder()
                .name(request.getName())
                .userId(request.getUserId())
                .password(passwordEncoder.encode(request.getPassword()))
                .build());

    }

   public ResponseEntity<String> checkNameDuplicate(String name) {
        if (repository.existsByName(name)) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("User Already Exists");
        }
        return ResponseEntity.status(HttpStatus.OK).body("SUCCESS");
    }

    public ResponseEntity<String> checkUserIdDuplicate(String userId) {
        if (repository.existsByUserId(userId)) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("User Already Exists");
        }
        return ResponseEntity.status(HttpStatus.OK).body("SUCCESS");
    }

}
