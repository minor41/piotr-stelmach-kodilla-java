package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    final List<ForumUser> userList = new ArrayList<>();


    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
