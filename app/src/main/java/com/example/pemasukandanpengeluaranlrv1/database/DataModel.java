package com.example.pemasukandanpengeluaranlrv1.database;

public class DataModel {

    private int id;
    private String amount;
    private String category;
    private String description;
    private String date;
    private String image;
    private String spiner;

    public DataModel(int id, String s1, String s2, String s3, String s4, String s5) {
    }

    //set metode
    public void setId(int id){
        this.id = id;
    }

    public void setAmount(String amount){
        this.amount = amount;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setImage(String image){
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSpiner(String spiner) {
        this.spiner = spiner;
    }

    public String getSpiner() {
        return spiner;
    }

    public DataModel (int id, String amount, String category, String description, String date, String image, String spiner){
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
        this.image = image;
        this.spiner = spiner;







    }

    public int getId() {
        return id;
    }

    public String getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }
}
