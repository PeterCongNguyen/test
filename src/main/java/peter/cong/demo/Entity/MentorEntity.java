package peter.cong.demo.Entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by CongN on 1/16/2018.
 */
@Entity
@Table(name="MENTOR")
@Data
@ToString
public class MentorEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Mentor_Id", nullable =false)
    private long id;

    @Column(name = "Mentor_Name")
    private String name;

    @Column(name = "Mentor_Phone")
    private int phone;

    @Column(name = "Mentor_Age")
    private int age;

}
