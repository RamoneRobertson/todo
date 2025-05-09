package me.ramone.todo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<Task> tasks = new HashSet<>();

    // Methods
    public void addTask(Task task){
        tasks.add(task);
        task.setUser(this);
    }

    public void removeAddress(Task task){
        tasks.remove(task);
        task.setUser(null);
    }
}
