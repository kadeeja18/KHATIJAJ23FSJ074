package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike undef = new MotorBike();
		ducati.startMotor();
//		ducati.setSpeed(100);
//		System.out.println(ducati.getSpeed());
//		ducati.setSpeed(10);
	ducati.increaseSpeed(60);
	ducati.decreaseSpeed(20);
			
		
//		ducati.stopMotor();
//		ducati.setSpeed(0) ;
		honda.startMotor();
		honda.increaseSpeed(70);
		honda.decreaseSpeed(100);
////		ducati.setSpeed(10);

//		honda.setSpeed(80) ;
//		honda.setSpeed(10) ;
//		honda.stopMotor();
//	 	honda.setSpeed(0) ;
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(undef.getSpeed());
	}

}
