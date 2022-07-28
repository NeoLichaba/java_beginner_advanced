package com.example.domain;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart implements Serializable {

    private static final long serialVersionUID = 23L;
    private int cartID;
    private ArrayList<Item> items;
    private int itemCount;
    private transient double cartTotal;

    public ShoppingCart(int custID) {
        this.cartID = custID;
        items = new ArrayList<>();
        itemCount = 0;
        cartTotal = 0;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(new Date());
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        if (cartTotal == 0 && (items.size() > 0)) {
            for (Item item : items) {
                cartTotal += item.getCost();
            }
        }
        Date date = (Date) ois.readObject();
        System.out.println("Restored Shopping Cart from: " + DateFormat.getDateInstance().format(date));
    }

    public double getCartTotal() {
        return cartTotal;
    }

    public int getCartID() {
        return cartID;
    }

    public void addItem(Item i) {
        if (items.add(i)) {
            cartTotal += i.getCost();
        }
    }

    public int getCartSize() {
        return items.size();
    }

    public List<Item> getItems() {
        return items;
    }
}

