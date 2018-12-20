package car;


public class CarBean {
	private String color, gearType;
	private int door; 
	
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setGearType(String gearType){
		this.gearType = gearType;
	}
	public String getgearType(){
		return gearType;
	}
	public void setDoor(int door){
		this.door = door;
	}
	public int getDoor(){
		return door;
	}
	@Override
	public String toString() {
		return String.format("[자동차 정보]\n"
				+ "자동차 색: %s\n"
				+ "자동차 기어: %s\n"
				+ "자동차 문 : %s",color,gearType,door);
	}
}