package pojos;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Advertise 
{
	private Integer addId;
	private Date addPostedDate;
	private String addCity;
	private Integer viewsOnAdd;
	private User user;
	private CarInfo carInfo;
	private Boolean soldOut;
	private Boolean isBlocked;
	private List<ReportAdd> reportList = new ArrayList<ReportAdd>();
	private List<Photos> photoList = new ArrayList<Photos>();
	private Set<Wishlist> wishList = new HashSet<>();
	
	public Advertise() 
	{
		
	}
	
	
	
	public Advertise(Date addPostedDate, String addCity, Integer viewsOnAdd, User user, CarInfo carInfo,
			Boolean soldOut, Boolean isBlocked) {
		super();
		this.addPostedDate = addPostedDate;
		this.addCity = addCity;
		this.viewsOnAdd = viewsOnAdd;
		this.user = user;
		this.carInfo = carInfo;
		this.soldOut = soldOut;
		this.isBlocked = isBlocked;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getAddId() {
		return addId;
	}
	public void setAddId(Integer addId) {
		this.addId = addId;
	}
	@Temporal(TemporalType.DATE)
	public Date getAddPostedDate() {
		return addPostedDate;
	}
	public void setAddPostedDate(Date addPostedDate) {
		this.addPostedDate = addPostedDate;
	}
	@Column(length = 50)
	public String getAddCity() {
		return addCity;
	}
	public void setAddCity(String addCity) {
		this.addCity = addCity;
	}
	public Integer getViewsOnAdd() {
		return viewsOnAdd;
	}
	public void setViewsOnAdd(Integer viewsOnAdd) {
		this.viewsOnAdd = viewsOnAdd;
	}
	@ManyToOne
	@JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "car_id")
	public CarInfo getCarInfo() {
		return carInfo;
	}
	public void setCarInfo(CarInfo carInfo) {
		this.carInfo = carInfo;
	}
	public Boolean getSoldOut() {
		return soldOut;
	}
	public void setSoldOut(Boolean soldOut) {
		this.soldOut = soldOut;
	}
	public Boolean getIsBlocked() {
		return isBlocked;
	}
	public void setIsBlocked(Boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "advertise",orphanRemoval = true)
	public List<ReportAdd> getReportList() {
		return reportList;
	}
	public void setReportList(List<ReportAdd> reportList) {
		this.reportList = reportList;
	}
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "advertise",orphanRemoval = true)
	public List<Photos> getPhotoList() {
		return photoList;
	}
	public void setPhotoList(List<Photos> photoList) {
		this.photoList = photoList;
	}
	@ManyToMany(mappedBy = "addList")
	public Set<Wishlist> getWishList() {
		return wishList;
	}
	public void setWishList(Set<Wishlist> wishList) {
		this.wishList = wishList;
	}
	
	public void addAdvertise()
	{
		
	}

	
}
