package ua.edu.ucu.lab.flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower")
public class FlowerController {
    private static final double sepal = 10;
    private static final double prce = 10;
    @GetMapping("/")
    public Flower getFlower() {
	return new Flower(sepal, prce, FlowerColor.BLUE, FlowerType.ROSE);
    }
}
