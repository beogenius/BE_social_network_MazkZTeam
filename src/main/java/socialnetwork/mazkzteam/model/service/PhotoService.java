package socialnetwork.mazkzteam.model.service;

import socialnetwork.mazkzteam.model.entities.Photo;

import java.util.List;

public interface PhotoService extends CommonService<Photo>{
    List<Photo> saveAllPhoto(List<Photo> photoList);

    boolean deleteAllPhotoByHai(int id);
    boolean deleteAllPhoto(int id);
}
