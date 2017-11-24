package com.kodilla.testing.forum.statistics;

public class CountStatistics   {
    private Statistics statistics;
    private double postsPerUser;
    private double commentPerUser;
    private double commentPerPost;
    private int namesCount;
    private int postCount;
    private int commentCount;

    public CountStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics() {
        namesCount = statistics.getUserNames().size();
        postCount = statistics.postCount();
        commentCount = statistics.commentCount();
        if (namesCount == 0) {
            postsPerUser = 0;
            commentPerUser = 0;
        } else {
            postsPerUser = postCount /(double) namesCount;
            commentPerUser = commentCount / (double) namesCount;
        }

        if (postCount == 0) {
            commentPerPost = 0;
        } else {
            commentPerPost = commentCount /(double) postCount;
        }
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentPerUser() {
        return commentPerUser;
    }

    public double getCommentPerPost() {
        return commentPerPost;
    }

    public int getNamesCount() {
        return namesCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }
}

