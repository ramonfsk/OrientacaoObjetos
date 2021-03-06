package com.carAgency;

import java.util.ArrayList;

public class Branch {
	private static int numBranchs;
	private String storeName;
	private ArrayList<Car> cars = new ArrayList<Car>();
	private ArrayList<Client> clnts = new ArrayList<Client>();
	private ArrayList<Sale> sales = new ArrayList<Sale>();
	
	public Branch(String storeName) {
		setStoreName(storeName);
		numBranchs++;
	}

	public static Branch registerBranch() {
		Branch tmpBranch = new Branch(
				View.solicitarDadosString(null, "Qual sera o nome da filial: ")
		);
		return tmpBranch;
	}
	
	public static String listBranchs(ArrayList<Branch> brnchs) {
		int count = 0;
		String list = null;
		StringBuilder builder = new StringBuilder();
		for (Branch branch : brnchs) {
			builder.append((count+1)+" - "+branch.getStoreName()+"\n");
			count++;
		}
		list = builder.toString();
		return list;
	}
	
	public static Branch selectBranch(ArrayList<Branch> brnchs) {
		String msg = listBranchs(brnchs);
		int option = View.solicitarDadosInt("Selecione uma filial: ", msg);
		return brnchs.get(option-1);
	}
	
	public void addCar(Car car) {
		cars.add(car);
	}
	
	public void addClient(Client clnt) {
		clnts.add(clnt);
	}
	
	public void addSale(Sale sale) {
		sales.add(sale);
	}
	
	public static int getNumBranchs() {
		return numBranchs;
	}
	
	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		Utils.validaString(storeName);
		this.storeName = storeName;
	}
	
	public ArrayList<Car> getCars() {
		return cars;
	}

	public ArrayList<Client> getClnts() {
		return clnts;
	}

	public ArrayList<Sale> getSales() {
		return sales;
	}
}
