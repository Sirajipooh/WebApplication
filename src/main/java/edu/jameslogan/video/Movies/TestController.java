package edu.jameslogan.video.Movies;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TestController {

	@RequestMapping("/")
	public String index() {
        
        //
        //
        System.out.println("hello");
		return "Hello guys from Siraj";
	}

}
