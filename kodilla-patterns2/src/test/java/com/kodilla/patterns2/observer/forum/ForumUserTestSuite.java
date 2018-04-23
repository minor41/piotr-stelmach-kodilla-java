package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpGroup = new JavaHelpForumTopic();
        ForumTopic javaToolsGroup = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");

        javaHelpGroup.registerObserver(johnSmith);
        javaToolsGroup.registerObserver(ivoneEscobar);
        javaHelpGroup.registerObserver(jessiePinkman);
        javaToolsGroup.registerObserver(jessiePinkman);
        //When
        javaHelpGroup.addPost("Hi everyone! Could you help me with this loop?");
        javaHelpGroup.addPost("Better try to use while loop in this case.");
        javaHelpGroup.addPost("Why while? Is it better?");
        javaToolsGroup.addPost("Help pls, my SQL db doesn't want to work :(");
        javaToolsGroup.addPost("When I try to log in I got 'bad credentials' message");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }

}