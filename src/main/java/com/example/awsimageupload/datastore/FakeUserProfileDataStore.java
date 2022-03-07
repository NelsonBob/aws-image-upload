package com.example.awsimageupload.datastore;

import com.example.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();
    /*static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"Nelson",null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"Alysson",null));
    }*/
    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("5b409e35-d77a-4742-9271-5a8eca95c628"),"Nelson",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("16209d16-291f-417e-b006-1d7856ace109"),"Alysson",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("5b409e35-d77a-4742-9271-5a8eca95c620"),"Hang",null));

    }
    public  List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
