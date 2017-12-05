package com.kodilla.stream.portfolio;

import java.time.LocalDate;
import java.util.List;

public final class Task {
    private final String title;
    private final String description;
    private final User assigneUser;
    private final User creator;
    private final LocalDate created;
    private final LocalDate deadline;

    public Task(String title, String description, User assigneUser, User creator, LocalDate created, LocalDate deadline) {
        this.title = title;
        this.description = description;
        this.assigneUser = assigneUser;
        this.creator = creator;
        this.created = created;
        this.deadline = deadline;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public User getAssigneUser() {
        return assigneUser;
    }

    public User getCreator() {
        return creator;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", assigneUser=" + assigneUser +
                ", creator=" + creator +
                ", created=" + created +
                ", deadline=" + deadline +
                '}';
    }
}
