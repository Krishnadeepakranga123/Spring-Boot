package org.mk.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping(value="/home")
	public String home() {
		return "welcome to krishna spring Boot class";
	}
	@RequestMapping(value="/hello")
	public String hello() {
		return "hello this is krishna";
	}
	@GetMapping(value="/sum")
	public String getsum(@RequestParam(name="n1") int num1,@RequestParam(name="n2") int num2) {
		return num1+"+"+num2+"="+(num1+num2);
	}
	
	@GetMapping(value="/sub")
	public String getsub(@RequestParam(name="n1") int num1,@RequestParam(name="n2") int num2) {
		return num1+"-"+num2+"="+(num1-num2);
	}
	
	@GetMapping(value="/mul")
	public String getsmul(@RequestParam(name="n1") int num1,@RequestParam(name="n2") int num2) {
		return num1+"*"+num2+"="+(num1*num2);
	}
	
	@GetMapping(value="/div")
	public String getdiv(@RequestParam(name="n1") int num1,@RequestParam(name="n2") int num2) {
		return num1+"/"+num2+"="+(num1/num2);
	}
	
	@GetMapping(value="/moddiv")
	public String getmoddiv(@RequestParam(name="n1") int num1,@RequestParam(name="n2") int num2) {
		return num1+"%"+num2+"="+(num1%num2);
	}
	@PostMapping(value="/login")
	public String verify(@RequestParam long phone,@RequestParam String password) {
		if(phone == 958108586 && password.equals("Krishna143")) {
			return"Login Successful";
		}
		else {
			return"Invalid phoneno or password";
		}
	}
	
	@GetMapping(value="/table/{num}")
	public String getTable(@PathVariable(name="num") int n) {
		String table=" ";
		for(int i=1;i<=10;i++) {
			table =table +(n+"*"+i+"="+n*i)+"\n";
		}
		return table;
	}

}
