package com.example.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Sample {
	@RequestMapping("/gopi")
	public String  gopikrishn() {
		return "hiiii sir" ;
	}
	
	@RequestMapping("/mani/kanta")
public String mani() {
	return"manikanta is returned";
}
 


}
