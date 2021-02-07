package duantn.backend.model.dto.output;

import duantn.backend.model.entity.Staff;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdvertisementOutputDTO {
    private Integer advertisementId;
    private String title;
    private String content;
    private String image;
    private Staff staffId;

}
