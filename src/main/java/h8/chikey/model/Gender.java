package h8.chikey.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "gender")
public class Gender {

    @Id
    @NonNull
    @Column(name = "Code")
    private char genderCode;

    @Column(name = "Name")
    private String genderName;

    @OneToMany(mappedBy = "gender")
    Set<Client> setGender;

    @Override
    public String toString() {
        return "Gender{" +
                "genderCode=" + genderCode +
                ", genderName='" + genderName + '\'' +
                '}';
    }
}
