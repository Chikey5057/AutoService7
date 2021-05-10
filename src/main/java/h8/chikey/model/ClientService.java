package h8.chikey.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "clientservice")
public class ClientService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int clientseviceID;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "ClientID")
    private Client client;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "ServiceID")
    private Service service;

    @Column(name = "StartTime")
    private Date clientserviceStartTime;

    @Column(name = "Comment")
    private String clientserviceComment;


    @Override
    public String toString() {
        return "ClientService{" +
                "clientseviceID=" + clientseviceID +
                ", client=" + client +
                ", service=" + service +
                ", clientserviceStartTime=" + clientserviceStartTime +
                ", clientserviceComment='" + clientserviceComment + '\'' +
                '}';
    }
}
