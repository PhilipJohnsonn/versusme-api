//package versusme.entity;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "Court")
//public class Court {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "courtId")
//    private Long courtId;
//
//    @ManyToOne
//    @JoinColumn(name = "sportId")
//    private Sport sport;
//
//    @Column(name = "maxPlayers")
//    private Integer maxPlayers;
//
//    @Column(name = "minPlayers")
//    private Integer minPlayers;
//
//    public Long getCourtId() {
//        return courtId;
//    }
//
//    public void setCourtId(Long courtId) {
//        this.courtId = courtId;
//    }
//
//    public Sport getSport() {
//        return sport;
//    }
//
//    public void setSport(Sport sport) {
//        this.sport = sport;
//    }
//
//    public Integer getMaxPlayers() {
//        return maxPlayers;
//    }
//
//    public void setMaxPlayers(Integer maxPlayers) {
//        this.maxPlayers = maxPlayers;
//    }
//
//    public Integer getMinPlayers() {
//        return minPlayers;
//    }
//
//    public void setMinPlayers(Integer minPlayers) {
//        this.minPlayers = minPlayers;
//    }
//}
