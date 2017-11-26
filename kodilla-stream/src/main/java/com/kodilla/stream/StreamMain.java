//package com.kodilla.stream;
//
//import com.kodilla.stream.forumuser.Forum;
//import com.kodilla.stream.forumuser.ForumUser;
//
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class StreamMain {
//    public static void main(String[] args) {
//        Forum theForum = new Forum();
//
//        Map<String, ForumUser> theResultMapForum = theForum.getList().stream()
//                .filter(forumUser -> forumUser.getUserSex(''))
//                .filter(forumUser -> forumUser.getBirthDate() > 1997)
//                .filter(forumUser -> forumUser.getPostCount() > 1)
//                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));
//
//        System.out.println("# elements: " + theResultMapForum.size());
//        theResultMapForum.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);
//
//    }
//}