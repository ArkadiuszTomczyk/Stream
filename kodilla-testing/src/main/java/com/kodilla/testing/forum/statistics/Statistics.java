package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {

    List<String> getUserNames();
    int postCount();
    int commentCount();
}
