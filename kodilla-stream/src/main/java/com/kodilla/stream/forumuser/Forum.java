package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theUsersList = new ArrayList<>();
    public  Forum() {
        theUsersList.add(new ForumUser(544254, "MArk", 'm', LocalDate.of(1988,3,12), 54));
        theUsersList.add(new ForumUser(123456, "Tom", 'm', LocalDate.of(1956,12,12), 0));
        theUsersList.add(new ForumUser(654789, "Monika", 'f', LocalDate.of(2001,6,26), 3));
        theUsersList.add(new ForumUser(963852, "Victor", 'm', LocalDate.of(1944,11,4), 28));
        theUsersList.add(new ForumUser(741258, "Kate", 'f', LocalDate.of(1986,7,30), 22));
        theUsersList.add(new ForumUser(753215, "Suzan", 'f', LocalDate.of(1968,9,18), 46));
        theUsersList.add(new ForumUser(321478, "Bob", 'm', LocalDate.of(1999,1,1), 73));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theUsersList);
    }

}
