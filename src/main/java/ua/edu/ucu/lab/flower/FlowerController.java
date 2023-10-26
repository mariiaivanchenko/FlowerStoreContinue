package ua.edu.ucu.lab.flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower")
public class FlowerController {
    private static final int SEPAL = 10;
    private static final int PRCE = 20;
    @GetMapping("/")
    public Flower getFlower() {
        return new Flower(SEPAL, PRCE, FlowerColor.BLUE, FlowerType.ROSE);
    }
}
