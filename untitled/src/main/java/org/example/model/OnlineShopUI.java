package org.example.model;

import org.example.Exceptions.EmptyStoreException;
import org.example.Exceptions.ProductNotFoundException;
import org.example.Exceptions.WrongNameException;
import org.example.Exceptions.ZeroPriceException;

public interface OnlineShopUI {

    void addProduct(String product, double price) throws WrongNameException, ZeroPriceException;

    void deleteProduct(String name) throws ProductNotFoundException, WrongNameException, EmptyStoreException;

    String getProduct(String name) throws ProductNotFoundException, WrongNameException, EmptyStoreException;

    void getAllProducts() throws EmptyStoreException;

}