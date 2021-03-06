package com.carAgency;

import java.util.ArrayList;
import java.util.Random;

public class Sale {
	private static int numSales = 0;
	private Car car;
	private Client clnt;
	
	public Sale(Car car, Client clnt) {
		setCar(car);
		setClnt(clnt);
		car.setItsSold(true);
		numSales++;
	}

	public static Sale registerSale(ArrayList<Car> cars, ArrayList<Client> clnts) {
		Sale tmpSale = new Sale(
				Car.selectCar(cars),
				Client.selectClient(clnts)
		);
		return tmpSale;
	}
	
	public static String listSales(ArrayList<Sale> sales) {
		int count = 0;
		String list = null;
		StringBuilder builder = new StringBuilder();
		for (Sale sale : sales) {
			builder.append((count+1)+" - Cliente: "+sale.getClnt().getName()+" | Carro: "+sale.getCar().getModel()+"\n");
			count++;
		}
		list = builder.toString();
		return list;
	}
	
	public static boolean approveCredit(int min, int max) {
		Random random = new Random();
		int result = random.nextInt(max-min) + min;
		if(result < 1) {
			return false;
		} else {
			return true;
		}
	}
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Client getClnt() {
		return clnt;
	}

	public void setClnt(Client clnt) {
		this.clnt = clnt;
	}

	public static int getNumSales() {
		return numSales;
	}
}
