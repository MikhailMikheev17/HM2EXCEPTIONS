package org.example.model;

import org.example.Exceptions.EmptyStoreException;
import org.example.Exceptions.ProductNotFoundException;
import org.example.Exceptions.WrongNameException;
import org.example.Exceptions.ZeroPriceException;

public class Model {

    private final OnlineShop shop;

    public Model() {
        this.shop = new OnlineShop("Товары 24\7");
    }

    public void addProduct(String name, double price) throws WrongNameException, ZeroPriceException {
        shop.addProduct(name, price);
    }

    public void deleteProduct(String name) throws ProductNotFoundException, WrongNameException, EmptyStoreException {
        shop.deleteProduct(name);

    }

    public String getProduct(String name) throws WrongNameException, ProductNotFoundException, EmptyStoreException {
        return shop.getProduct(name);
    }

    public void getAllProducts() throws EmptyStoreException {
        shop.getAllProducts();
    }
}