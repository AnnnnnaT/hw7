package view.commands;

import view.ConsoleUI;

public class AddNote {
    public static void description(){
        System.out.println("Input your note: ");
    }

    public void add(){
        ConsoleUI i = new ConsoleUI();
        i.addNote();
    }
}
