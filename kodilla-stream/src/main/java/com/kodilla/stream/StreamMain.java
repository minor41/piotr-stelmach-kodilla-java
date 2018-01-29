package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        // zadanie 7,1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Hello", (abc) -> abc);
        poemBeautifier.beautify("Hello", (abc) -> abc.replaceFirst("Hello", "Bye"));
        poemBeautifier.beautify("HI ", (abc -> abc.toLowerCase()));
        poemBeautifier.beautify(" Hmmm ", (abc) -> abc.replace('m', 'H'));

        // zadanie 7,3

        final Forum forum = new Forum();
        final List<ForumUser> userList = new ArrayList<>();
        ForumUser user1 = new ForumUser(001, "Rob Dirk", 'M', 1983, 12, 24,
                10);
        userList.add(user1);

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

        Map<Integer, ForumUser> mapOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter (ForumUser->ForumUser.getBirthDate().isBefore(LocalDate.of(1998,12,31)))
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + mapOfUsers.size());
        mapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
