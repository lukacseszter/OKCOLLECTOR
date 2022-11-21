/*
* File: StatConstBar.java
* Created Date: 2022-11-21 08:28:46
* Author: Lukács Eszter
* Github: https://github.com/lukacseszter
* Last Modified: 2022-11-21
* Modified By: Lukács Eszter
* Copyright (c) 2022 Lukács Eszter
* GNU GPL v2
*/

package views;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class StatConstBar extends JPanel {

    JLabel statusLabel;

    public StatConstBar(int width) {        
        setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        StatBarSize(width, 25);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        statusLabel = new JLabel("Kész");
        this.SetStatBarCont("Kész");
        this.add(statusLabel);
    }
    
    public void StatBarSize(int x, int y) {
        setMaximumSize(new Dimension(x, y));
        setMinimumSize(new Dimension(x, y));
        setPreferredSize(new Dimension(x, y));
    }

    public void SetStatBarCont(String message) {
        this.statusLabel.setText(message);
    }
}
