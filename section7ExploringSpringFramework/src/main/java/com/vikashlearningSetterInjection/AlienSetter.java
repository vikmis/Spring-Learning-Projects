package com.vikashlearningSetterInjection;

public class AlienSetter {
	
	private int age;
	private LaptopSetter laptop;
	
	
	public LaptopSetter getLaptop() {
		return laptop;
	}



	public void setLaptop(LaptopSetter laptop) {
		this.laptop = laptop;
	}



	public AlienSetter() {
		
		System.out.println("Object created");
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
