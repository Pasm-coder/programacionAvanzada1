package co.edu.uniminuto.proavanzada.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class FirstController {
	
	@GetMapping(value="sumar/{num1}/{num2}")//endPoint, recibir valores por variable 
	public double getSumar(@PathVariable("num1") double numero1,@PathVariable("num2") double numero2) {
		return numero1+numero2;
	}
	
	@GetMapping(value="restar")// recibir parámetro por param
	public double getRestar(@RequestParam("num1") double num1, @RequestParam ("num2") double num2) {
		return num1-num2;
}
    @GetMapping(value="multiplicar")
    public double getMultiplicar(@RequestParam("num1") double num1, @RequestParam ("num2") double num2) {
    	return num1*num2;
}
    @GetMapping(value="dividir")
    public double getDividir(@RequestParam("num1") double num1, @RequestParam ("num2") double num2) {
    	return num1/num2;
    }
         
}
