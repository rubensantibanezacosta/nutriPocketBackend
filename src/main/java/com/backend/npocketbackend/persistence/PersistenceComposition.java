package com.backend.npocketbackend.persistence;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "composition", schema = "nutripocket", catalog = "")
public class PersistenceComposition {

    @Id
    @Column(name = "foodid", nullable = false)
    private int foodid;
    @Basic
    @Column(name = "calories", nullable = false, precision = 0)
    private double calories;
    @Basic
    @Column(name = "fat", nullable = false, precision = 0)
    private double fat;
    @Basic
    @Column(name = "carbs", nullable = false, precision = 0)
    private double carbs;
    @Basic
    @Column(name = "protein", nullable = false, precision = 0)
    private double protein;
    // @OneToOne
    // @JoinColumn(name = "foodid", referencedColumnName = "id", nullable = false)
    //  private PersistenceFoods foodsByFoodid;


    public PersistenceComposition(int foodid, double calories, double fat, double carbs, double protein) {
        this.foodid = foodid;
        this.calories = calories;
        this.fat = fat;
        this.carbs = carbs;
        this.protein = protein;
    }

    public PersistenceComposition() {
    }

    public int getFoodid() {
        return foodid;
    }

    public void setFoodid(int foodid) {
        this.foodid = foodid;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersistenceComposition that = (PersistenceComposition) o;
        return foodid == that.foodid && Double.compare(that.calories, calories) == 0 && Double.compare(that.fat, fat) == 0 && Double.compare(that.carbs, carbs) == 0 && Double.compare(that.protein, protein) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodid, calories, fat, carbs, protein);
    }

    // public PersistenceFoods getFoodsByFoodid() {
    //     return foodsByFoodid;
    // }

    // public void setFoodsByFoodid(PersistenceFoods foodsByFoodid) {
    //   this.foodsByFoodid = foodsByFoodid;
    // }
}
