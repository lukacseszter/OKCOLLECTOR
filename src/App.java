/*
* File: App.java
* Created Date: 2022-11-21 08:28:46
* Author: Lukács Eszter
* Github: https://github.com/lukacseszter
* Last Modified: 2022-11-21
* Modified By: Lukács Eszter
* Copyright (c) 2022 Lukács Eszter
* GNU GPL v2
*/

import controllers.CollectorController;
import controllers.MainController;
import controllers.WordsController;
import views.MainWindow;

public class App {
public static void main(String[] args) throws Exception {
MainWindow mainWindow = new MainWindow();
new MainController(mainWindow);
new CollectorController(mainWindow);
new WordsController(mainWindow);
mainWindow.setVisible(true);
}
}
