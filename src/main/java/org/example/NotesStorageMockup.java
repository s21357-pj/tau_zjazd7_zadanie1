package org.example;

import java.util.ArrayList;
import java.util.List;

public class NotesStorageMockup implements NotesStorage {
    List<Note> NotesLists = new ArrayList<>();

    public void add(Note note) {
        NotesLists.add(note);
    }
    public List<Note> getAllNotesOf(String name) {
        return NotesLists;
    }
    public void clear() {
        NotesLists.clear();
    }
}
