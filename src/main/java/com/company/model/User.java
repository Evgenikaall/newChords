package com.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;


import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "user_form")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String username;

    private String password;

    private String role;

    private boolean enabled;
}
