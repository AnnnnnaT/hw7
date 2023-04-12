package presenter;

import model.Notebook;
import view.View;

public class Presenter {

    private Notebook book;

    public Presenter (View view, Notebook book){
        this.book = book;
        view.setPresenter(this);
    }
    
    public void addNote(String text) {
        book.addNote(text);     

    }

    public void changeNote(String num, String text){
        book.changeNote(num, text);
    }

    public void delNote(String text){
        book.deleteNote(text);
    }
    
    public void showAll(){
        book.showAllNotes();
    }

    public void start(String act){
        
    }
    
}
