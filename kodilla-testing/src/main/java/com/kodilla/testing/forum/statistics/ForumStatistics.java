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
        if(userCount == 0) {
            aveCommentsPerPost = 0;
            aveCommentsPerUser = 0;
            avePostsPerUser = 0;
        } else {
            if(postCount == 0){
                avePostsPerUser = 0;
            } else {
                avePostsPerUser = postCount / userCount;
            }
            if( commentCount == 0){
                aveCommentsPerUser = 0;
                aveCommentsPerPost = 0;
            } else {
                aveCommentsPerUser = commentCount / userCount;
                aveCommentsPerPost = commentCount / postCount;
            }
        }
    }
}
