/*
* File: Page.java
* Created Date: 2022-11-21 08:28:46
* Author: Lukács Eszter
* Github: https://github.com/lukacseszter
* Last Modified: 2022-11-21
* Modified By: Lukács Eszter
* Copyright (c) 2022 Lukács Eszter
* GNU GPL v2
*/

package models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Page {
    public String url;
    public ArrayList<String> getContent() {
        String result = "alma";
        ArrayList<String> wordList = new ArrayList<>();
        if (!url.isEmpty()) {
            try {
                Connection conn = Jsoup.connect(this.url);
                Document doc = conn.get();
                result = doc.body().text();
                
                } catch (IOException e) {
                    System.err.println("Hiba! A weblap nem olvasható");
                }
                result = result.replaceAll("\\p{Punct}", "");
                result = result.replaceAll("[©0-9]", "");
                result = result.trim().replaceAll(" +", "\n");
        
        }else {
            System.err.println("Hiba! Az url nincs beállítva!");
        }

        Scanner scanner = new Scanner(result);
        while(scanner.hasNextLine()) {
            wordList.add(scanner.nextLine());
        }
        scanner.close();
        Collections.sort(wordList);
        return wordList;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
