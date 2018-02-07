package com.gutNorbert.flashchatnewfirebase;

import android.content.SharedPreferences;

/**
 * Created by Norbi on 2018. 02. 07..
 */

public class InstantMessage {
    private String message;
    private String author;

    public InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public InstantMessage() {
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
}
