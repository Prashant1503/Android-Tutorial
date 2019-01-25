package com.example.pintu.notepad.model;

public class Note {

    private String notetext;
    private long noteDate;


    public String getNotetext() {
        return notetext;
    }

    public void setNotetext(String notetext) {
        this.notetext = notetext;
    }

    public long getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(long noteDate) {
        this.noteDate = noteDate;
    }

    public Note(String notetext, long noteDate) {
        this.notetext = notetext;
        this.noteDate = noteDate;
    }
}
