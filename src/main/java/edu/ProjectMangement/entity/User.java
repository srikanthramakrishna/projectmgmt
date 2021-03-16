package edu.ProjectMangement.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String  loginid;
    private String  password;

    @OneToMany(mappedBy = "admin_id", fetch = FetchType.EAGER)
    private List<Project> projects;

    @OneToMany(mappedBy = "assignee", fetch = FetchType.LAZY)
    private List<Story> stories;

    @OneToMany(mappedBy = "assignee", fetch = FetchType.LAZY)
    private List<Task> tasks;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }






}
