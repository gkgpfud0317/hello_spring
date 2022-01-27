package gram.project.grambook.payload.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AuthRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String userId;

    @NotBlank
    @Size(min = 8, max = 15, message = "비밀번호는 최소 8자 이상 최대 15자 이하입니다")
    private String password;
}
