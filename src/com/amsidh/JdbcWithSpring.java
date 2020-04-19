/**
 * 
 */
package com.amsidh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.mvc.dtos.Vechile;
import com.amsidh.mvc.dtos.VechileDaoImpl;

/**
 * @author amsidhlokhande
 * 
 */
public class JdbcWithSpring {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		
		VechileDaoImpl vechileDaoImpl = context.getBean("vechileDaoImpl",VechileDaoImpl.class);
		//vechileDaoImpl.saveTenVechile();
	for(Vechile vechile: vechileDaoImpl.getAllVechile())
	{
		System.out.println(vechile.getVechileId()+"   "+vechile.getVechileType());
	}

	}

	
}
