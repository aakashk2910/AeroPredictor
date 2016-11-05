package com.aerotron.aeropredictor.ui;

import android.view.View;

import java.util.ArrayList;

/**
 * Created by Aakash Kamble on 05-11-2016.
 */

public class Item {

    private String price;
    private String pledgePrice;
    private String fromAddress;
    private String toAddress;
    private String requestsCount;
    private String date;
    private String time;


    private String name;
    private String contact;
    private String email;

    private View.OnClickListener requestBtnClickListener;

    public Item() {
    }

    public Item(String price, String pledgePrice, String fromAddress, String toAddress, String requestsCount, String date, String time, String name, String contact, String email) {
        this.price = price;
        this.pledgePrice = pledgePrice;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.requestsCount = requestsCount;
        this.date = date;


        this.time = time;
        this.name = name;
        this.contact = contact;
        this.email = email;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPledgePrice() {
        return pledgePrice;
    }

    public void setPledgePrice(String pledgePrice) {
        this.pledgePrice = pledgePrice;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getRequestsCount() {
        return requestsCount;
    }

    public void setRequestsCount(String requestsCount) {
        this.requestsCount = requestsCount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (requestsCount != item.requestsCount) return false;
        if (price != null ? !price.equals(item.price) : item.price != null) return false;
        if (pledgePrice != null ? !pledgePrice.equals(item.pledgePrice) : item.pledgePrice != null)
            return false;
        if (fromAddress != null ? !fromAddress.equals(item.fromAddress) : item.fromAddress != null)
            return false;
        if (toAddress != null ? !toAddress.equals(item.toAddress) : item.toAddress != null)
            return false;
        if (name != null ? !name.equals(item.name) : item.name != null) return false;
        if (contact != null ? !contact.equals(item.contact) : item.contact != null) return false;
        if (email != null ? !email.equals(item.email) : item.email != null) return false;
        if (date != null ? !date.equals(item.date) : item.date != null) return false;
        return !(time != null ? !time.equals(item.time) : item.time != null);


    }

    @Override
    public int hashCode() {
        int result = price != null ? price.hashCode() : 0;
        result = 31 * result + (pledgePrice != null ? pledgePrice.hashCode() : 0);
        result = 31 * result + (fromAddress != null ? fromAddress.hashCode() : 0);
        result = 31 * result + (toAddress != null ? toAddress.hashCode() : 0);
        result = 31 * result + (requestsCount != null ? date.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }

    /**
     * @return List of elements prepared for tests
     */
    public static ArrayList<Item> getTestingList() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Aakash Kamble", "64", "Mumbai University", "Thakur College Of Engineering & Technology", "Information Technology", "", "", "Aakash Kamble", "+91 9619511353", "aakashk2910@gmail.com"));
        items.add(new Item("Darshan Vakharia", "65", "Mumbai University", "Thakur College Of Engineering & Technology", "Information Technology", "", "","Darshan Vakharia", "+91 9619992232", "dvakharia24@gmail.com"));
        items.add(new Item("Rachit   Verma", "78", "Mumbai University", "Thakur College Of Engineering & Technology", "Information Technology", "", "", "Rachit Verma", "+91 9967147969", "rachitverma94@gmail.com"));
/*        items.add(new Item("$19", "$150", "12th Ave, NY, 10012", "W 57th St, NY, 10048", 8, "TODAY", "4:15 AM"));
        items.add(new Item("$5", "$300", "56th Ave, NY, 10041", "W 36th St, NY, 10029", 0, "TODAY", "06:15 PM"));*/
        return items;

    }

}

