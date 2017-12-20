package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        PoemBeautifier poemBeautifier = new PoemBeautifier();


        System.out.println(poemBeautifier.beautify("koala", s -> s.toUpperCase()));
        System.out.println(poemBeautifier.beautify( "pSzCzołA", p ->p.toLowerCase()));
        System.out.println(poemBeautifier.beautify("kilo gwoździ", i ->i.replaceFirst("kilo", "dwa")));
        System.out.println(poemBeautifier.beautify("1226", o ->o.concat("weto")));

        Map<Integer, ForumUser> theResultMapForum = theForum.getList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'm')
                .filter(forumUser -> forumUser.getBirthDate().getYear() > 1997)
                .filter(forumUser -> forumUser.getPostCount() > 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapForum.size());
        theResultMapForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}