package com.in28minutes.oops;

public class MotorBike {
	private int speed;
	MotorBike(){   //undefined or default constructor so that i can create obj without params
		this(150);   //this keyword usage
// We can call another constructor by using the this keyword,we are using this here so that we dont have to repeat the code
	}
	MotorBike (int speed){
		this.speed= speed;
	}
	
void startMotor() {
	System.out.println("Wroooooooooooom Wrommmm");
	
}
void changeGear() {
	System.out.println("Gear changed");
}

public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	
	
//	System.out.println(speed);
//	System.out.println(this.speed);
	if(speed>0) {
	this.speed = speed;}
//	System.out.println(this.speed);}

}
void increaseSpeed(int howMuch) {
	setSpeed(this.speed + howMuch);
//	return this.speed;
}
public void decreaseSpeed(int howMuch) {
	setSpeed(this.speed-howMuch);
}

void stopMotor() {
	System.out.println("hussssss");
}
}

