package pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarInfo 
{
	private Integer carId;
	private String brand;
	private String type;
	private Double sellingPrice;
	private Integer buyingYear;
	private Integer drivenKm;
	private String model;
	private FuelType fuelType;
	private String description;
	private Ownership ownership;

	public CarInfo() 
	{
		
	}
	
	public CarInfo(String brand, String type, Double sellingPrice, Integer buyingYear, Integer drivenKm, String model,
			FuelType fuelType, String description, Ownership ownership) {
		super();
		this.brand = brand;
		this.type = type;
		this.sellingPrice = sellingPrice;
		this.buyingYear = buyingYear;
		this.drivenKm = drivenKm;
		this.model = model;
		this.fuelType = fuelType;
		this.description = description;
		this.ownership = ownership;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	@Column(length = 40)
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Column(length = 40)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Integer getBuyingYear() {
		return buyingYear;
	}

	public void setBuyingYear(Integer buyingYear) {
		this.buyingYear = buyingYear;
	}

	public Integer getDrivenKm() {
		return drivenKm;
	}

	public void setDrivenKm(Integer drivenKm) {
		this.drivenKm = drivenKm;
	}
	
	@Column(length = 80)
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

	@Enumerated(EnumType.STRING)
	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	@Column(length = 300)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Enumerated(EnumType.STRING)
	public Ownership getOwnership() {
		return ownership;
	}

	public void setOwnership(Ownership ownership) {
		this.ownership = ownership;
	}

	
	
}
