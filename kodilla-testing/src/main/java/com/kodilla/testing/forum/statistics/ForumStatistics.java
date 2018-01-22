package com.kodilla.testing.forum.statistics;


public class ForumStatistics{
    int userCount;
    int postCount;
    int commentCount;
    double avePostsPerUser;
    double aveCommentsPerUser;
    double aveCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
    }

}
