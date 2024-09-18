package com.work.oops;

public class MotorBike {

//	 State
	private int speed;

//	behaviour

//	Create getter and setter

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed >= 0) {
			this.speed = speed;
		}
	}

	void start() {

		System.out.println("Started");
	}

	void stop() {

		System.out.println("Stopped");
	}

	public void changeSpeed(int deltaSpeed) {

		setSpeed(this.speed + deltaSpeed);
	}

}
