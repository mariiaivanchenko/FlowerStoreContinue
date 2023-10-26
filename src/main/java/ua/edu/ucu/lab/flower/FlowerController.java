package ua.edu.ucu.lab.flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower")
public class FlowerController {
    @GetMapping("/")
    public Flower getFlower() {
	return new Flower(10.0, 20.0, FlowerColor.BLUE, FlowerType.ROSE);
    }
}
