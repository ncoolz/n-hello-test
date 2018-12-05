package com.navercorp.nhelloworld.samples.defaultsample;

import com.navercorp.nhelloworld.library.helloworld.*;

public class HelloWorldSample {

	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		System.out.println(helloWorld.getHello() + helloWorld.getComma() + " " + helloWorld.getWorld());


	}
}
