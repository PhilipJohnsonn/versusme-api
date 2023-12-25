package versusme.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "SportComplex")
public class SportComplex {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "complexId")
    private Long complexId;

    @Column(name = "name")
    private String name;

    @Column(name = "locationLatitude")
    private Double locationLatitude;

    @Column(name = "locationLongitude")
    private Double locationLongitude;

    @ManyToMany
    @JoinTable(
            name = "SportComplex_Sport",
            joinColumns = @JoinColumn(name = "complexId"),
            inverseJoinColumns = @JoinColumn(name = "sportId")
    )
    private List<Sport> availableSports;

    @OneToMany(mappedBy = "sportComplex")
    private List<Court> availableCourts;

    public Long getComplexId() {
        return complexId;
    }

    public void setComplexId(Long complexId) {
        this.complexId = complexId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLocationLatitude() {
        return locationLatitude;
    }

    public void setLocationLatitude(Double locationLatitude) {
        this.locationLatitude = locationLatitude;
    }

    public Double getLocationLongitude() {
        return locationLongitude;
    }

    public void setLocationLongitude(Double locationLongitude) {
        this.locationLongitude = locationLongitude;
    }

    public List<Sport> getAvailableSports() {
        return availableSports;
    }

    public void setAvailableSports(List<Sport> availableSports) {
        this.availableSports = availableSports;
    }

    public List<Court> getAvailableCourts() {
        return availableCourts;
    }

    public void setAvailableCourts(List<Court> availableCourts) {
        this.availableCourts = availableCourts;
    }
}
