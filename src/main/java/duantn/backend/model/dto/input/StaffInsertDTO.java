package duantn.backend.model.dto.input;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class StaffInsertDTO {

    private String email;

    private String pass;

    private String name;

    private String cardId;

    private String birthday;

    private boolean gender;

    private boolean role;

    private String address;

    private String phone;

    private String image;
}
