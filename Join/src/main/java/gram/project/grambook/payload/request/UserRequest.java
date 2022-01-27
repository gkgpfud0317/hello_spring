package gram.project.grambook.payload.request;

import lombok.*;

import javax.validation.constraints.Size;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @Size(min = 2, message = "이름을 입력하시오")
    private String name;

    @Size(min = 5, max = 10, message = "아이디를 입력하시오")
    private String userId;

    @Size(min = 8, max = 15, message = "비밀번호를 입력하시오")
    private String password;

}
