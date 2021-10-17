package com.vicchern.fileuploaderapp.repository;

import com.vicchern.fileuploaderapp.model.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserProfileRepository {

    private final static List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"john_snow",null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"sam_samson",null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
