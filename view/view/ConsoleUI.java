package view;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import presenter.Presenter;


public class ConsoleUI implements View {
    private Presenter presenter;
   
  
    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        System.out.println("Make a note!");
        System.out.println("Choose what to do: ");
        System.out.println("1.Add new note");
        System.out.println("2.Save note");
        System.out.println("3.Show all notes");
        System.out.println("4.Change note");
        System.out.println("5.Delete note");
        Scanner toDo = new Scanner(System.in);
        String act = toDo.next();
        presenter.start(act);
    }

    
    public  void addNote(){
        System.out.println("\nВведите заметку: ");
        Scanner scan = new Scanner(System.in);
        String newNote = scan.nextLine();
        presenter.addNote(newNote);
        System.out.println("\nЗаметка добавлена!\n");
    }

    public void changeNote(){
        System.out.println("\nИзмените заметку под введенным номером: ");
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        System.out.println("\nВведите текст: ");
        String text = scan.next();
        presenter.changeNote(num, text);
        System.out.println("\nЗаметка изменена!\n");
    }

    public void deleteNote(){
        System.out.println("\nУдалите введенный текст: ")
        Scanner scan = new Scanner(System.in);
        String text= scan.next();
        presenter.delNote(text);
        System.out.println("\nЗаметка удалена!\n");
    }
    
    public void SaveNote(){
        System.out.println("\nЗаметка сохранена!\n");
    }

    public void ShowAll (){
        System.out.println("Все записи:\n");
        presenter.showAll();
    }    
    
}
