package duantn.backend.service;

import duantn.backend.model.dto.input.AdvertisementInsertDTO;
import duantn.backend.model.dto.input.AdvertisementUpdateDTO;
import duantn.backend.model.dto.output.AdvertisementOutputDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AdvertisementService {
    //danh sách bài viêt
    List<AdvertisementOutputDTO> listAdvertisement(Integer page, Integer limit);

    //thêm bài viết
    ResponseEntity<?> insertAdvertisement(AdvertisementInsertDTO advertisementInsertDTO);

    //cập nhật bài viết
    ResponseEntity<?> updateAdvertisement(AdvertisementUpdateDTO advertisementUpdateDTO);

    //xóa bài viết
    ResponseEntity<String> deleteAdvertisement(Integer id);
}
