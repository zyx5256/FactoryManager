package model;

import java.util.UUID;

public abstract class User {
    private String name;
    private UUID uuid;

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public abstract String toString();
}
