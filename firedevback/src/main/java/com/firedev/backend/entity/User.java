package com.firedev.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "user")
@Table(name = "app_user")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Integer id;


    @Column(name = "name", nullable = false)
    @NotNull
    private String name;



}
