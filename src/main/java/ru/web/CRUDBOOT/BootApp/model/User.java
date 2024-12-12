package ru.web.CRUDBOOT.BootApp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@Data
@Table(name="users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

}
