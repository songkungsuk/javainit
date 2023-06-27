package p02;

public class AreaTour {

	String areaName;
	int cost;
	String hotelName;
	String car;
	
	
	public static void main(String[] args) {
		AreaTour at = new AreaTour();
		at.areaName = "seoul";
		at.cost = 1;
		at.hotelName = "sinra";
		at.car = "bus";
		
	}
	
	
	
	
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	
	
}
