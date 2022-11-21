/*
* File: WordsController.java
* Created Date: 2022-11-21 08:28:46
* Author: Lukács Eszter
* Github: https://github.com/lukacseszter
* Last Modified: 2022-11-21
* Modified By: Lukács Eszter
* Copyright (c) 2022 Lukács Eszter
* GNU GPL v2
*/

package controllers;
import views.MainWindow;

public class WordsController {
    MainWindow mainWindow;
    public WordsController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.mainWindow.exitButton.addActionListener(event ->{
            System.exit(0);
        });
    } 
}