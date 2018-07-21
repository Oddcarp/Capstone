package hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {



    final String CLIENT_URL = "http://localhost:4200";

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @CrossOrigin(origins = CLIENT_URL)
    @RequestMapping("/calculator")
    public Calculator calculator(@RequestParam(value="formula", defaultValue="H") String formula) {
        return new Calculator(counter.incrementAndGet(), formula);
    }

    @CrossOrigin(origins = CLIENT_URL)
    @RequestMapping("/idealgaslaw")
    public IdealGasLaw idealGasLaw(@RequestParam(value="pressure", required=false) String pressure,
                                   @RequestParam(value="volume", required=false) String volume,
                                   @RequestParam(value="moles", required=false) String moles,
                                   @RequestParam(value="temperature", required=false) String temperature) {
        return new IdealGasLaw(counter.incrementAndGet(), pressure, volume, moles, temperature);
    }
}
