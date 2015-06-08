package com.tw.pathashala.models;

import com.tw.pathashala.menu.BooksList;
import com.tw.pathashala.menu.MenuAction;
import com.tw.pathashala.menu.Quit;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<String, MenuAction> menuList = new HashMap<String, MenuAction>();

    public Menu() {
        menuList.put("List Books", new BooksList());
        menuList.put("Quit", new Quit());
    }

    public void addOption(String menuOption, MenuAction action) {
        menuList.put(menuOption, action);
    }

    public Map<String, MenuAction> menuList() {
        return menuList;
    }

    public MenuAction chooseOption(String menuOption) {
        return menuList.get(menuOption);
    }

    @Override
    public String toString() {
        String output = "";
        int serial = 1;
        for(String menu:menuList.keySet()){
            output = output + "\n" + serial + ") " + menu;
            serial++;
        }
        return output;
    }
}