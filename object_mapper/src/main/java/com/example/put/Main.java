package com.example.put;

import java.util.Arrays;
import java.util.List;

import com.example.put.dto.Car;
import com.example.put.dto.User;

public class Main {

	public static void main(String[] args) {
		System.out.println("main");
		ObjectMapper objectMapper = new ObjectMapper();
		
		User user = new User();
		user.setName("È«±æµ¿");
		user.setAge(10);
			
		Car car1 = new Car();
		car1.setName("k5");
		car1.setCarNumber("11°¡ 1111");
		car1.setType("sedan");
		
		Car car2 = new Car();
		car2.setName("Q5");
		car2.setCarNumber("22°¡ 2222");
		car2.setType("SUV");
		
		List<Car> carList = Arrays.asList(car1, car2);
		user.setCars(carList);
		System.out.println(user);
	}
}
