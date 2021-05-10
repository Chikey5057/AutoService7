package h8.chikey.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    @Column(name = "ID")
    private int clientID;

    @NonNull
    @Column(name = "FirstName")
    private String clientFirstName;

    @NonNull
    @Column(name = "LastName")
    private String clientLastName;

    @Column(name = "Patronymic")
    private String clientPatronymic;

    @Column(name = "Birthday")
    private Date clientBirthday;

    @Column(name = "RegistrationDate")
    private Date clientRegistrationDate;

    @Column(name = "Phone")
    private String clientPhone;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "GenderCode")
    private Gender gender;

    @Column(name = "PhotoPath")
    private String clientPhotoPath;

    @OneToMany(mappedBy = "client")
    private Set<ClientService> setClient;


    @Override
    public String toString() {
        return "Client{" +
                "clientID=" + clientID +
                ", clientFirstName='" + clientFirstName + '\'' +
                ", clientLastName='" + clientLastName + '\'' +
                ", clientPatronymic='" + clientPatronymic + '\'' +
                ", clientBirthday=" + clientBirthday +
                ", clientRegistrationDate=" + clientRegistrationDate +
                ", clientPhone='" + clientPhone + '\'' +
                ", gender=" + gender +
                ", clientPhotoPath='" + clientPhotoPath + '\'' +
                '}';
    }
}
