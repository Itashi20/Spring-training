

package com.guest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.service.GuestService;


public class guest {

	public static void main(String[] args) {
		 
//		GuestService service= new GuestSeerviceImpl(new IndianRestaurant());
//		System.out.println(service.inRoomDining("fries"));
//		
//		LaunderyService laun=new LaundaryServiceImpl();
//		System.out.println(laun.isAvailable(false )+"Service Unavailable");
//		
		//loading the container
		
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");

		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		GuestService gs=(GuestService)ctx.getBean("s");
		
		//System.out.println(gs.inRoomDining("dosa"));
		System.out.println(gs.inRoomDining("fries"));
	
	
	}

}
