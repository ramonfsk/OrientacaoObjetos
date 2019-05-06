package com.carAgency;

import java.util.ArrayList;

public class Car {
	private static int numCars = 0;
	private String brand;
	private String model;
	private int chassi;
	private int motorPower;
	private double value;
	private boolean itsSold;
	
	public Car(String brand, String model, int chassi, int motorPower, double value){
		setBrand(brand);
		setModel(model);
		setChassi(chassi);
		setMotorPower(motorPower);
		setValue(value);
		itsSold = false;
		numCars++;
	}
	
	public static Car registerCar() {
		Car tmpCar = new Car(
			View.solicitarDadosString(null, "Qual a marca do carro: "),
			View.solicitarDadosString(null, "E qual o modelo: "),
			View.solicitarDadosInt(null, "E o numero do chassi: "),
			View.solicitarDadosInt(null, "Qual a pot�ncia do motor: "),
			View.solicitarDadosDouble(null, "E por ultimo, o valor: ")
		);
		return tmpCar;
	}
	
	public static String listCars(ArrayList<Car> cars) {
		int count = 0;
		String list = null;
		StringBuilder builder = new StringBuilder();
		for (Car car : cars) {
			if(car.getIsItsSold()) {
				builder.append((count+1)+" - "+car.getModel()+" | R$ "+car.getValue()+"\n");
				count++;
			}
		}
		list = builder.toString();
		return list;
	}
	
	public static Car selectCar(ArrayList<Car> cars) {
		String msg = listCars(cars);
		int option = View.solicitarDadosInt("Selecione um carro: ", msg);
		return cars.get(option-1);
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		Utils.validaString(brand);
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		Utils.validaString(model);
		this.model = model;
	}

	public int getChassi() {
		return chassi;
	}

	public void setChassi(int chassi) {
		Utils.validaInt(chassi);
		this.chassi = chassi;
	}

	public static int getNumCars() {
		return numCars;
	}

	public int getMotorPower() {
		return motorPower;
	}

	public void setMotorPower(int motorPower) {
		Utils.validaInt(motorPower);
		this.motorPower = motorPower;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		Utils.validaDouble(value);
		this.value = value;
	}

	public boolean getIsItsSold() {
		return itsSold;
	}

	public void setItsSold(boolean itsSold) {
		this.itsSold = itsSold;
	}
}