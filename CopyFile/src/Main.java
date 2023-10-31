/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import controller.CopyFileProgram;
import view.Menu;

public class Main {
    public static void main(String[] args) {
        String title = "----------Copy FILE Program---------";
        String[] s = new String[]{" Read file config.proprties","Coppy Folder" ,"Check Configure file" 
            ,"Exit"};
    
        Menu<String> menu = new CopyFileProgram(title, s);
        menu.run();
        // 1:D:\PRO192\CountCopyFile\text.txt
    }
}

