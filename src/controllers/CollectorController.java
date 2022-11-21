/*
* File: CollectorController.java
* Created Date: 2022-11-21 08:28:46
* Author: Lukács Eszter
* Github: https://github.com/lukacseszter
* Last Modified: 2022-11-21
* Modified By: Lukács Eszter
* Copyright (c) 2022 Lukács Eszter
* GNU GPL v2
*/

package controllers;
import java.util.ArrayList;
import models.Page;
import views.MainWindow;

public class CollectorController extends MainController {
    //A CollectorController osztály konstruktora    
    public CollectorController(MainWindow mainWindow) {
        super(mainWindow);

        mainWindow.pasteButton.addActionListener(event -> {
            System.out.println("beillesztés");
            mainWindow.urlField.paste();
        });

        mainWindow.startButton.addActionListener(event -> {
            String utvonal = mainWindow.urlField.getText();
            if (utvonal.isEmpty()) {
                utvonal = "https://index.hu";
            }

            Page Collectorpage = new Page();
            Collectorpage.setUrl(utvonal);
            ArrayList<String> w = Collectorpage.getContent();

            for(String word : w) {
                if (mainWindow.wordsModel.indexOf(word)<0) {
                    mainWindow.wordsModel.addElement(word);
                }                
            }
            Integer wordCount = mainWindow.wordsModel.getSize();
            mainWindow.statusBar.SetStatBarCont("Szavak: " + wordCount.toString());
        });
    }   
}
