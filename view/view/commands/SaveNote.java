package view.commands;

import view.ConsoleUI;

public class SaveNote {
    public static void description(){
        System.out.println("Save your note");
    }
    public void save(){
        ConsoleUI i = new ConsoleUI();
        i.SaveNote();
    }
}
