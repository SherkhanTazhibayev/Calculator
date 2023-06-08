package petprojects.calculator;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import petprojects.calculator.service.CalculatorService;

//@RestController
@RequestMapping("/calculate")
@Controller
public class CalculatorController {

//    @Autowired
//    private CalculatorService calculatorService;

    private /*final*/ CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("num1") int num1,
                      @RequestParam("num2") int num2,
                      Model model) {
        int result = calculatorService.add(num1, num2);
        model.addAttribute("result", result);
        model.addAttribute("operation", "add");
        return "result";
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam("num1") int num1,
                           @RequestParam("num2") int num2,
                           Model model) {
        int result = calculatorService.subtract(num1, num2);
        model.addAttribute("result", result);
        model.addAttribute("operation", "subtract");
        return "result";
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int num1,
                           @RequestParam("num2") int num2,
                           Model model) {
        int result = calculatorService.multiply(num1, num2);
        model.addAttribute("result", result);
        model.addAttribute("operation", "multiply");
        return "result";
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int num1,
                         @RequestParam("num2") int num2,
                         Model model) {
        int result = calculatorService.divide(num1, num2);
        model.addAttribute("result", result);
        model.addAttribute("operation", "divide");
        return "result";
    }


/*    @GetMapping("/add/{num1}/{num2}")
    public int add(@PathVariable int num1,
                   @PathVariable int num2) {
        return num1 + num2;
    }

    @GetMapping("/subtract/{num1}/{num2}")
    public int subtract(@PathVariable int num1,
                        @PathVariable int num2) {
        return num1 - num2;
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public int multiply(@PathVariable int num1,
                        @PathVariable int num2) {
        return num1 * num2;
    }

    @GetMapping("/divide/{num1}/{num2}")
    public double divide(@PathVariable double num1,
                         @PathVariable double num2) {
        return num1 / num2;
    }*/


}
