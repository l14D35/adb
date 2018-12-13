package adb.academy.Daniel.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@NoArgsConstructor
@Data
@Entity
public class PersonEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String secondName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private int footSize;


    public PersonEntity(String firstName, String secondName, Date birthday, int footSize) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.footSize = footSize;
    }
}
