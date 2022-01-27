package gram.project.grambook.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@NoArgsConstructor
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue
    private Long userId;
    private String name;
    private String password;

    public Member toEntity() {
        return Member.builder()
                .userId(userId)
                .name(name)
                .password(password)
                .build();
    }

    @Builder
    public Member(Long userId, String name, String password) {
        this.userId = userId;
        this.name = name;
        this.password = password;
    }
}
