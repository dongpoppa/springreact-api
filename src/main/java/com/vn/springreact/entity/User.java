package com.vn.springreact.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_name",columnDefinition = "nvarchar(100)")
    private String userName;

    @Column(name = "email",unique = true)
    private String email;

    @Column(name = "pass")
    private String password;

    @Column(name = "phone")
    private String phone;

    @Column(name = "avatar",columnDefinition = "nvarchar(50)")
    private String avatar;

    @Column(name = "address",columnDefinition = "nvarchar(255)")
    private String address;

    @Column(name = "is_del")
    private String status;

//
//    @ManyToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
//    @JoinTable(
//            name = "user_role",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id")
//    )
//    private Set<Role> roles;
//
    @OneToMany(mappedBy = "user")
    private Set<Order> orders;

//    @OneToMany(mappedBy = "user")
//    private Set<CartDetail> cartDetails;


}
