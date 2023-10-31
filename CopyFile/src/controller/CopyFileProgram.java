/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Admin
 */
import model.CopyFileManager;
import view.Menu;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;


public class CopyFileProgram extends Menu<String>{
    private CopyFileManager list= new CopyFileManager();
    public CopyFileProgram (String title, String[] s){
        super(title, s);
    }
    File propertiesFile;
    String file;
    String folder;
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                CopyFileManager.readFileConfig();
                break;
            case 2:
                CopyFileManager.checkFileConfig(propertiesFile);
                break;
            case 3: 
                CopyFileManager.copyFolder(folder, file);
            case 4:
                System.exit(0);        
        }
    }
}
