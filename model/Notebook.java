package model;

import java.util.ArrayList;


public class Notebook implements Service {
    ArrayList<String> notebook;

    public Notebook() {
        this.notebook = new ArrayList<>();
    }

    @Override
    public void addNote(String text) {
        notebook.add(text);
    }

    @Override
    public void deleteNote(String text) {
        notebook.remove(text);
    }

    @Override
    public void changeNote(String num, String text) {
       for (String note : notebook) {
            if(note.contains(num)){
                note = text;
            }
       }
    }

    @Override
    public void saveNote() {
        System.out.println("Your last note is saved");
    }
    
    public Object[] notebookToArray() {         
        return notebook.toArray();
    }

    @Override
    public ArrayList<String> showAllNotes() {
        return notebook;
    }
 
}
