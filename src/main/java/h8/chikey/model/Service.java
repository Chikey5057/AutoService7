package h8.chikey.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int serviceID;
    @NonNull
    @Column(name = "Title")
    private String serviceTitle;
    @Column(name = "Cost")
    @NonNull
    private double serviceCost;
    @NonNull
    @Column(name = "DurationInSeconds")
    private int serviceDurationInSeconds;
    @Column(name = "Description")
    private String serviceDescription;
    @Column(name = "Discout")
    private double serviceDiscount;
    @Column(name = "MainImagePath")
    private String serviceMaiImagePath;
    @Column(name = "DurationInsecond")
    private int DurationInSecond;

    @OneToMany(mappedBy = "service")
    Set<ClientService> setService;

    @Override
    public String toString() {
        return "Service{" +
                "serviceID=" + serviceID +
                ", serviceTitle='" + serviceTitle + '\'' +
                ", serviceCost=" + serviceCost +
                ", serviceDurationInSeconds=" + serviceDurationInSeconds +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", serviceDiscount=" + serviceDiscount +
                ", serviceMaiImagePath='" + serviceMaiImagePath + '\'' +
                ", DurationInSecond=" + DurationInSecond +
                '}';
    }
}
