package com.vicchern.fileuploaderapp.model.profile;

import java.util.Optional;
import java.util.UUID;

public class UserProfile {

    private UUID userProfile;
    private String userName;
    private String userProfileImageLink;

    public UserProfile(UUID userProfile, String userName, String userProfileImageLink) {
        this.userProfile = userProfile;
        this.userName = userName;
        this.userProfileImageLink = userProfileImageLink;
    }

    public UserProfile() {
    }

    public UUID getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UUID userProfile) {
        this.userProfile = userProfile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Optional <String> getUserProfileImageLink() {
        return Optional.ofNullable(userProfileImageLink);
    }

    public void setUserProfileImageLink(String userProfileImageLink) {
        this.userProfileImageLink = userProfileImageLink;
    }

}
