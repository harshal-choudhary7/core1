package pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {

	private Integer userId;
	private String name;
	private String email;
	private String password;
	private Role role;
	private Address address;
	private Boolean isBlocked;
	private List<Advertise> addList=new ArrayList<Advertise>();
	private List<ReportAdd> reportList=new ArrayList<ReportAdd>();
	private Wishlist wishlist = new Wishlist();
	
	public User() 
	{
		wishlist.setUser(this);
	}
	
	public User(String name, String email, String password, Role role, Address address, Boolean isBlocked) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.address = address;
		this.isBlocked = isBlocked;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Column(length = 50)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(length = 50)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(length = 50)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Enumerated(EnumType.STRING)
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Embedded
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Boolean getIsBlocked() {
		return isBlocked;
	}
	public void setIsBlocked(Boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user",orphanRemoval = true)
	public List<Advertise> getAddList() {
		return addList;
	}
	public void setAddList(List<Advertise> addList) {
		this.addList = addList;
	}
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user",orphanRemoval = true)
	public List<ReportAdd> getReportList() {
		return reportList;
	}
	public void setReportList(List<ReportAdd> reportList) {
		this.reportList = reportList;
	}
	@OneToOne(mappedBy = "user")
	public Wishlist getWishlist() {
		return wishlist;
	}
	public void setWishlist(Wishlist wishlist) {
		this.wishlist = wishlist;
	}
	
	public void addAdvertisement(Advertise a)
	{
		this.addList.add(a);
		a.setUser(this);
	}
	
	public void deleteAdvertisement(Advertise a)
	{
		this.addList.remove(a);
		a.setUser(null);
	}

	public void addReport(Advertise add1, ReportAdd report1) 
	{	
		this.reportList.add(report1);
		report1.setAdvertise(add1);
		report1.setUser(this);
	}
	
	public void removeReport(Advertise add1, ReportAdd report1) 
	{	
		//PENDING
//		this.reportList.add(report1);
//		report1.setAdvertise(add1);
//		report1.setUser(this);
	}
	public void addAdvertisementToWishlist(Advertise add1)
	{
		this.wishlist.getAddList().add(add1);
	}
}
