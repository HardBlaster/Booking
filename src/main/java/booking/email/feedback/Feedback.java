package booking.email.feedback;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class Feedback {

    @NotNull
    private String name;
    @NotNull
    @Email
    private String email;
    @NotNull
    private String message;

}
