package com.vicchern.fileuploaderapp.controller;

import com.vicchern.fileuploaderapp.model.profile.UserProfile;
import com.vicchern.fileuploaderapp.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/user-profile")
public class UserProfileController {

    private final UserProfileService userProfileService;

    @Autowired
    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @GetMapping(path = "/list-of-profiles")
    public List <UserProfile> getUserProfiles(){
        return userProfileService.getAllUserProfiles();
    }

    @PostMapping(path = "{userProfileId}/image/download" )
    public void uploadUserProfileImage(@PathVariable("userProfileId") UUID userProfileId, @RequestParam("file") MultipartFile file){
        userProfileService.uploadUserProfileImage(userProfileId,file);
    }
}
