package br.com.br.firstapispringboot.controllers;

import br.com.br.firstapispringboot.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// kept using IllegalArgumentException as requested

@RestController
@RequestMapping("/math")
public class MathController {

    // request mapping from sum
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
           @PathVariable("numberOne") String numberOne,
           @PathVariable("numberTwo") String numberTwo
    )  throws Exception {
        // validate inputs: if any value is NOT numeric, throw IllegalArgumentException (kept by request)
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    // request mapping from subtraction
    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
           @PathVariable("numberOne") String numberOne,
           @PathVariable("numberTwo") String numberTwo
    )  throws Exception {
        // validate inputs: if any value is NOT numeric, throw IllegalArgumentException (kept by request)
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }
    // request mapping from multiplication
    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
           @PathVariable("numberOne") String numberOne,
           @PathVariable("numberTwo") String numberTwo
    )  throws Exception {
        // validate inputs: if any value is NOT numeric, throw IllegalArgumentException (kept by request)
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }
    // request mapping from multiplication
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
           @PathVariable("numberOne") String numberOne,
           @PathVariable("numberTwo") String numberTwo
    )  throws Exception {
        // validate inputs: if any value is NOT numeric, throw IllegalArgumentException (kept by request)
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    // request mapping from mean
    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
           @PathVariable("numberOne") String numberOne,
           @PathVariable("numberTwo") String numberTwo
    )  throws Exception {
        // validate inputs: if any value is NOT numeric, throw IllegalArgumentException (kept by request)
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value");

        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
    }
    // request mapping from square root
    @RequestMapping("/squareroot/{number}")
    public Double squareRoot(
           @PathVariable("number") String number
    )  throws Exception {
        // validate inputs: if any value is NOT numeric, throw IllegalArgumentException (kept by request)
        if(!isNumeric(number)) throw new UnsupportedMathOperationException("Please set a numeric value");

        return Math.sqrt(convertToDouble(number));
    }

    // TODO -> multiplication, division, mean, square root

    private Double convertToDouble(String strNumber) throws IllegalArgumentException {
        if(strNumber == null || strNumber.isEmpty()) throw new UnsupportedMathOperationException("Please set a numeric value");
        String number = strNumber.replace(",", "."); // R$ 5,00 USD 5.0
           return Double.parseDouble((number));
    }

    private boolean isNumeric(String strNumber) {
        if(strNumber == null || strNumber.isEmpty()) return false;

        String number = strNumber.replace(",", "."); // R$ 5,00 USD 5.0
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");

    }


}
