package recording.day16_classObject;

public class Car {
	
	String make;
	String model;
	int year;
	int currentSpeed;
	String color;
	
	public Car() {
	}
	
	public void printCarInfo() {
		
		String info = "Car make[" + make + "], model[" + model + "], color[" + color + "], current speed[" 
						+ currentSpeed + "]";
		
		System.out.println(info);
		
	}
	
	public void drive() {
		System.out.println(make + " " + model + " is driving");
	}
	
	public void accelerate(int mph) {
		currentSpeed += mph;
	}
	
	public void showCurrentSpeed(int speedLimit) {
		if(currentSpeed <= speedLimit) {
			System.out.println(make + " is driving at " + currentSpeed + " mph which is in limits-" + speedLimit);
		}else {
			System.out.println(make + " is driving at " + currentSpeed + " mph which is OVER limits-" + speedLimit);
		}
	}
	
	
	
	
}
