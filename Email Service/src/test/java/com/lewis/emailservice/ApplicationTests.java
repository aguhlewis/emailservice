package com.lewis.emailservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

	public static void main(String[] args) {

		//Integer[] a = {4,5,5,5,6,6,4,1,4,4,3,6,6,3,6,1,4,5,5,5};
		//Integer[] a = {1,1,3,1,2,1,3,3,3,3};
		Integer[] a = {10,20,20,10,10,30,50,10,20,20};


		ApplicationTests application = new ApplicationTests();
		application.function(a);

	}

	public int function(Integer[] a){


		List <Integer> odd = new ArrayList<>();

		Arrays.sort(a);
		int i, j = 0;

		for(i = 0; i < a.length -1 ; i++){
			for(j = i + 1; j < a.length; j++){
//				if(a[i] != a[j] && !odd.contains(a[i])){
//
//					odd.add(a[i]);
//
//				}
				System.out.println(a[i]+ " ");
			}
		}

		System.out.println(odd+" ");

		return 0;

	}


}

