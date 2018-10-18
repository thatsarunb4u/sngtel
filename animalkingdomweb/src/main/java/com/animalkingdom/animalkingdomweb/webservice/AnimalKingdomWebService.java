/**
 * 
 */
package com.animalkingdom.animalkingdomweb.webservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animalkingdom.entities.Language;
import com.animalkingdom.entities.Rooster;

/**
 * @author Arun
 *
 */
@RestController
@RequestMapping("/animal-kingdom-service")
public class AnimalKingdomWebService {
	
	@RequestMapping("/singRooster")
	public ResponseEntity<?> singRooster(){
		Rooster rooster = new Rooster();
		rooster.sing();
		return new ResponseEntity<>("Rooster sung successfully", HttpStatus.OK);
	}
	
	@RequestMapping("/singInNativeRooster")
	public ResponseEntity<?> singInNativeRooster(){
		Rooster rooster = new Rooster();
		rooster.singInNative(Language.Dutch);
		return new ResponseEntity<>("Rooster sung successfully", HttpStatus.OK);
	}
}
