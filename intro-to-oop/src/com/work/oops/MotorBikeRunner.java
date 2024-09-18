package com.work.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike kawasakiNinja = new MotorBike();
		MotorBike royalEnfield = new MotorBike();

		kawasakiNinja.start();
		royalEnfield.start();

		kawasakiNinja.setSpeed(50);
		royalEnfield.setSpeed(75);

		System.out.println(kawasakiNinja.getSpeed());
		System.out.println(royalEnfield.getSpeed());

		System.out.println("Accelerating!!!");
		kawasakiNinja.changeSpeed(21);
		royalEnfield.changeSpeed(18);

		System.out.println(kawasakiNinja.getSpeed());
		System.out.println(royalEnfield.getSpeed());

		kawasakiNinja.stop();
		royalEnfield.stop();
		System.out.println("Decelerating!!!");

		kawasakiNinja.changeSpeed(-71);
		royalEnfield.changeSpeed(-93);

		System.out.println(kawasakiNinja.getSpeed());
		System.out.println(royalEnfield.getSpeed());
	}

}
