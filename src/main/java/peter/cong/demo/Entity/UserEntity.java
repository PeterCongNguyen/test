package peter.cong.demo.Entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by CongN on 3/17/2018.
 */
@Data
@ToString
@Table(name = "USER")
@Entity
public class UserEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "User_id")
    private Long idUser;

    @Column(name = "User_name")
    private String nameUser;

    @Column(name = "User_mail")
    private String mailUser;

    @Column(name = "User_birthday")
    private Date birthUser;

    @Column(name = "User_address")
    private String addressUser;

}
