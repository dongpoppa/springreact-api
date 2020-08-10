package com.vn.springreact.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "games")
public class Game implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "name",columnDefinition = "nvarchar(255)")
    private String name;

    @Column(name = "min_player")
    private int minPlayer;

    @Column(name = "max_player")
    private int maxPlayer;

    @Column(name = "best_player_quantity")
    private int bestPlayerQuantity;

    @Column(name = "time_play_from")
    private int timeToPlayFrom;

    @Column(name = "time_play_to")
    private int timeToPlayTo;

    @Column(name = "age_limited")
    private int ageLimited;

    @Column(name = "publisher",columnDefinition = "nvarchar(255)")
    private String publisher;

    @Column(name = "rules",columnDefinition = "nvarchar(max)")
    private String rules;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private double price;

    @Column(name = "image",columnDefinition = "nvarchar(255)")
    private String image;

    @Column(name = "is_del")
    private String status;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "category_game",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories;

    @OneToMany(mappedBy = "game")
    private Set<OrderDetail> orderDetails;

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
