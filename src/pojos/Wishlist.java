package pojos;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Wishlist 
{
	private Integer wishlistId;
	private Set<Advertise> addList = new HashSet<>();
	private User user;
	
	public Wishlist() 
	{
		
	}

	
	
	public Wishlist(Set<Advertise> addList, User user) {
		super();
		this.addList = addList;
		this.user = user;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(Integer wishlistId) {
		this.wishlistId = wishlistId;
	}

	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name = "wishlist_add",joinColumns = @JoinColumn(name="wish_id"),inverseJoinColumns = @JoinColumn(name="add_id"))
	public Set<Advertise> getAddList() {
		return addList;
	}

	public void setAddList(Set<Advertise> addList) {
		this.addList = addList;
	}
	
	@OneToOne
	@JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
}
