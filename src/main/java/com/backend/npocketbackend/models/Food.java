package com.backend.npocketbackend.models;

public class Food {
    protected int id;

    protected String name;

    protected FoodComposition composition;

    public Food(int id, String name, String url, FoodComposition composition) {
        this.id = id;
        this.name = name;
        this.composition = composition;
    }

    public Food() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FoodComposition getComposition() {
        return composition;
    }

    public void setComposition(FoodComposition composition) {
        this.composition = composition;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", composition=" + composition +
                '}';
    }
}
