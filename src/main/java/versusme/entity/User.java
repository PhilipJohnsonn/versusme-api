package versusme.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User", schema = "public")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long userId; 

    @Column(name = "firstName")
    private String firstName;
    
    @Column(name = "lastName")
    private String lastName;
    
    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "profilePicture")
    private String profilePicture;
    
    @Column(name = "locationLength")
    private Double locationLength;
    
    @Column(name = "locationLatitude")
    private Double locationLatitude;

    @Column(name = "maxDistance")
    private Double maxDistance;
    
//    private List<Sport> userSports;
//    
//    private List<SportMatch> matchHistory;
//    
//    private List<User> friends;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public Double getLocationLength() {
		return locationLength;
	}

	public void setLocationLength(Double locationLength) {
		this.locationLength = locationLength;
	}

	public Double getLocationLatitude() {
		return locationLatitude;
	}

	public void setLocationLatitude(Double locationLatitude) {
		this.locationLatitude = locationLatitude;
	}

	public Double getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(Double maxDistance) {
		this.maxDistance = maxDistance;
	}

//	public List<Sport> getUserSports() {
//		return userSports;
//	}
//
//	public void setUserSports(List<Sport> userSports) {
//		this.userSports = userSports;
//	}
//
//	public List<SportMatch> getMatchHistory() {
//		return matchHistory;
//	}
//
//	public void setMatchHistory(List<SportMatch> matchHistory) {
//		this.matchHistory = matchHistory;
//	}
//
//	public List<User> getFriends() {
//		return friends;
//	}
//
//	public void setFriends(List<User> friends) {
//		this.friends = friends;
//	}
    
}
