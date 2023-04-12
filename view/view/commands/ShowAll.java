package view.commands;

import java.util.Arrays;

import model.Notebook;

public class ShowAll {

     public static void show(Notebook notebook){
        System.out.println("All notes: ");
        System.out.println(Arrays.toString(notebook.notebookToArray()));
    }
}
