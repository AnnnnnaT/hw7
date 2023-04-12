package view.commands;

import view.ConsoleUI;

public class DelNote {
    public static void description(){
        System.out.println("Delete note: ");
    }

    public void delete(){
        ConsoleUI i = new ConsoleUI();
        i.deleteNote();
    }
}
