package org.example;

import org.example.Exceptions.EmptyStoreException;
import org.example.Exceptions.ProductNotFoundException;
import org.example.viewer.UserGUI;

public class Main {

    public static void main(String[] args) throws ProductNotFoundException, EmptyStoreException {
        UserGUI gui = new UserGUI();
        gui.show();
    }


}