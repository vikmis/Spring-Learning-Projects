package com.vikashlearningConstructerInjection;

public class AlienConstructorInj {
	
	private int age;
	private LaptopConstructorInj laptop;
	
	
	public LaptopConstructorInj getLaptop() {
		return laptop;
	}



	public void setLaptop(LaptopConstructorInj laptop) {
		this.laptop = laptop;
	}



	public AlienConstructorInj() {
		
		System.out.println("Object created");
	}
	
	public AlienConstructorInj(int age, LaptopConstructorInj laptop) {
		System.out.println("Parameterzied constructor is getting called");
		this.age=age;
		this.laptop=laptop;

}
	
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setter is called ");
		this.age = age;
	}

	
	public void code() 
	{
		
			System.out.println("Coding");
			laptop.compile();
		}
		

}
