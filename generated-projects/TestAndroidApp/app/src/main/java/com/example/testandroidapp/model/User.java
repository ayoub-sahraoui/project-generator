package com.example.testandroidapp.model;

import androidx.annotation.NonNull;
import java.util.Date;

public class User {
    private long id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    private Date createdAt;

    public User(long id, @NonNull String name, @NonNull String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.createdAt = new Date();
    }

    // Getters and Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    @NonNull
    public String getName() { return name; }
    public void setName(@NonNull String name) { this.name = name; }

    @NonNull
    public String getEmail() { return email; }
    public void setEmail(@NonNull String email) { this.email = email; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }
}
