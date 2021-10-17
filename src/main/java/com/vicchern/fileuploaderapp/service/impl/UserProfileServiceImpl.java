package com.vicchern.fileuploaderapp.service.impl;

import com.vicchern.fileuploaderapp.model.profile.UserProfile;
import com.vicchern.fileuploaderapp.repository.UserProfileRepository;
import com.vicchern.fileuploaderapp.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileRepository userProfileRepository;

    @Autowired
    public UserProfileServiceImpl(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    @Override
    public List<UserProfile> getAllUserProfiles() {
        return userProfileRepository.getUserProfiles();
    }

    @Override
    public void uploadUserProfileImage(UUID userProfileId, MultipartFile file) {

    }
}
