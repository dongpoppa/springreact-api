package com.vn.springreact.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name",columnDefinition = "nvarchar(255)")
    private String name;

    @Column(name = "description",columnDefinition = "nvarchar(255)")
    private String description;



    @ManyToMany(mappedBy = "categories",fetch = FetchType.LAZY)
    private Set<Game> games;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", games=" + games +
                '}';
    }
}
