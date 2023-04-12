import model.Notebook;
import presenter.Presenter;
import view.ConsoleUI;
import view.View;

public class main {
    public static void main(String[] args){
        View view = new ConsoleUI();
        Notebook notebook = new Notebook();
        new Presenter(view, notebook);

        view.start();
    }
}
