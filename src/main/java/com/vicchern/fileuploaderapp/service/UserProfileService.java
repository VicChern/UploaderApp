package com.vicchern.fileuploaderapp.service;

import com.vicchern.fileuploaderapp.model.profile.UserProfile;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

public interface UserProfileService {

     List<UserProfile> getAllUserProfiles();

     void uploadUserProfileImage(UUID userProfileId, MultipartFile file);
}
