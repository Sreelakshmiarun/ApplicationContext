package com.example.demo;

 class Airtel implements Sim
{
	 public Airtel() {
		System.out.println("Airtel Constructor is called");
	}

	@Override
	public void calling() {
		
		System.out.println("You are using calling sim is AIRTEL");
		
	}

	@Override
	public void data() {
		
		System.out.println("You are using data sim is AIRTEL");
		
	}
	
	
}
