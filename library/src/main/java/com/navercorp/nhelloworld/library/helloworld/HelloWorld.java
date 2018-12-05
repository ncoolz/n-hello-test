/*
 * Copyright (C) 2014 Naver Business Platform Corp.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.navercorp.nhelloworld.library.helloworld;

public class HelloWorld {

	public String getHello() {
		return "Hello";
	}
	
	public String getWorld() {
		return "World";
	}
	
	public String getComma() {
		return ",";
	}

	public String getCodeSmell() {
                String hello1 = ",";
		String hello_2 = ","; 
		return hello_2;
	}

       public String getCodeSmeeeell2() {
		return "abc" + "cde";
      }
}
