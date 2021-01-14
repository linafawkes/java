package ru.bstu.iitus.povtas.vt41.pets.models;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class PetService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String label;
    private String text;
    private String image;
    private String cost;
    @OneToMany
    private List<Comment> comments;
    @OneToMany
    private List<Tag> tags;
    public PetService() {

    }
}
