package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(001, "Rob Dirk", 'M', 1983, 12, 24,
                10));
        userList.add(new ForumUser(002, "Anna Dur", 'F', 1982,5,29,
                11));
        userList.add(new ForumUser(003, "Robert Gin", 'M', 1999, 1,1,
                1));
        userList.add(new ForumUser(004, "Matylda Ottoman", 'F', 1999, 9,11,
                7));
        userList.add(new ForumUser(005, "Tom Hanks", 'M', 1968, 4, 23,
                100));
        userList.add(new ForumUser(006, "Emma Potus", 'F', 1995, 7,29,
                68));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
