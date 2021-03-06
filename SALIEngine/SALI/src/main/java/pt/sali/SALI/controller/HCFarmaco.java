package pt.sali.SALI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pt.sali.SALI.functions.FFarmaco;
import pt.sali.SALI.model.Farmaco;
import pt.sali.SALI.service.IFarmaco;

@RestController
@RequestMapping("/Farmaco")
public class HCFarmaco {
	
	@Autowired
	FFarmaco ffarmaco;
	@Autowired
	IFarmaco iFarmaco;
	
	@PostMapping("/add")
	public String addFarmaco(@RequestBody Farmaco f, @RequestParam ("tok") String tok) {
		
		int status = ffarmaco.saveFarmaco(f, tok);
		
		if (status == 0) {
			return "Token";
		}else if (status == 1) {
			return "Sucesso";
		}
		return "Existente";
	}
	
	@RequestMapping("/list")
	public ResponseEntity<?> listarAllFarmacos (@RequestParam ("tok") String tok){
		
		List<Farmaco> f = ffarmaco.listarFarmaco(tok); 
		
		if(f != null) {
			return new ResponseEntity<>(f, HttpStatus.OK);
		}
		return new ResponseEntity<>("Token", HttpStatus.OK);
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> updateFarmaco(@RequestBody Farmaco f, @RequestParam ("tok") String tok) {
		
		if (ffarmaco.updateFarmaco(f, tok)) {
			return new ResponseEntity<>("Sucesso", HttpStatus.OK);
		}
		return new ResponseEntity<>("Token", HttpStatus.OK);
	}

	@PostMapping("/delete")
	public ResponseEntity<?> deleteFarmaco(@RequestParam("id") String id, @RequestParam ("tok") String tok) {
		
		if (ffarmaco.deleteFarmaco(id, tok)) {
			return new ResponseEntity<>("Sucesso", HttpStatus.OK);
		}
		return new ResponseEntity<>("Token", HttpStatus.OK);
	}
	
	@GetMapping("/mock")
	public ResponseEntity<String> mockup() {
		
		iFarmaco.save(new Farmaco ("Tirofiban"));
		iFarmaco.save(new Farmaco ("Valepotriatos"));
		iFarmaco.save(new Farmaco ("Bumetanida"));
		iFarmaco.save(new Farmaco ("Colestiramina"));
		iFarmaco.save(new Farmaco ("Donepezil"));
		iFarmaco.save(new Farmaco ("Feniramina"));
		iFarmaco.save(new Farmaco ("Hipromelose"));
		iFarmaco.save(new Farmaco ("Levocabastina"));
		iFarmaco.save(new Farmaco ("Probucol"));
		iFarmaco.save(new Farmaco ("Resorcinol"));
		
		return new ResponseEntity<String>("done", HttpStatus.OK);
	}
}
