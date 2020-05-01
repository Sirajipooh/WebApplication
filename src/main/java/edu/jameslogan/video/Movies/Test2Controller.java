package edu.jameslogan.video.Movies;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Test2Controller {

	@RequestMapping("/police")
	public int index2() {
        
       
		return 911;
    }
    @RequestMapping("/maps")
	public String index3() {
        
     
        return "I live in california:";
    }
    @RequestMapping("/school")
	public String index4() {
        
       
		return "I have been to school virtually but not physically!!!";
	}

}