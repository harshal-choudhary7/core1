package pojos;

import javax.persistence.*;

@Entity
public class ReportAdd {
	
	private Integer reportId;
	private String description;
	private User user;
	private Advertise advertise;

	public ReportAdd() 
	{
		
	}

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getReportId() {
		return reportId;
	}

	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}

	@Column(length = 300)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToOne
	@JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name = "add_id")
	public Advertise getAdvertise() {
		return advertise;
	}

	public void setAdvertise(Advertise advertise) {
		this.advertise = advertise;
	}
	
}
