package model;

import java.util.ArrayList;

public interface Service {
    void addNote(String text);
    void deleteNote(String text);
    void changeNote(String number, String text);
    void saveNote();
    ArrayList<String> showAllNotes();
}
