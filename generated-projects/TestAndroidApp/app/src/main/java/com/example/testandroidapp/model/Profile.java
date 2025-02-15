package com.example.testandroidapp.model;

import android.net.Uri;

public class Profile {
    private long id;
    private String bio;
    private Uri avatar;

    public Profile(long id) {
        this.id = id;
    }

    // Getters and Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }

    public Uri getAvatar() { return avatar; }
    public void setAvatar(Uri avatar) { this.avatar = avatar; }
}
