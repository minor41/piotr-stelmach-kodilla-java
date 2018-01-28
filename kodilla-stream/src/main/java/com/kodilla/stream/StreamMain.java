package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
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
        Forum forum = new Forum();
        Map<Integer, ForumUser> MapOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter (ForumUser->ForumUser.getBirthDate().isBefore(LocalDate.of(1998,12,31)))
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + MapOfUsers.size());
        MapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
