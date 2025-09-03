package org.example.task.Deadline;

public final class ImmutableUser {

    private final int id;
    private final String name;

    public ImmutableUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("ImmutableUser{id=%d, name='%s'}", id, name);
    }
}
