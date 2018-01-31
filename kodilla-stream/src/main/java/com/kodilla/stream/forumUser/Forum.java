package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }

    public void addUsers(ForumUser user){
        this.userList.add(user);
    }

}
