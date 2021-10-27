package com.backend.npocketbackend.persistence;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "foods", schema = "nutripocket", catalog = "")
public class PersistenceFoods {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = false, length = 2000)
    private String name;
    //  @OneToOne(mappedBy = "foodsByFoodid")
    //  private PersistenceComposition compositionById;


    public PersistenceFoods() {

    }

    public PersistenceFoods(String name) {
        this.id = 0;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersistenceFoods that = (PersistenceFoods) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    //  public PersistenceComposition getCompositionById() {
    //       return compositionById;
    // }

    // public void setCompositionById(PersistenceComposition compositionById) {
    //    this.compositionById = compositionById;
    //  }
}
