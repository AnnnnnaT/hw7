package view.commands;

import view.ConsoleUI;

public class ChangeNote {
    public static void description(){
        System.out.println("Change your note: ");
    }

    public void change(){
        ConsoleUI i = new ConsoleUI();
        i.changeNote();
    }
}
