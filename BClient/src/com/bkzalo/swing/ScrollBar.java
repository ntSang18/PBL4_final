package com.bkzalo.swing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

import com.bkzalo.swing.ModernScrollBarUI;

public class ScrollBar extends JScrollBar {

    public ScrollBar() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setBackground(new Color(242, 242, 242));
        setUnitIncrement(20);
    }
}
