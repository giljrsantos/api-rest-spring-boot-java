package br.com.br.firstapispringboot.controllers;

import br.com.br.firstapispringboot.exception.UnsupportedMathOperationException;
import br.com.br.firstapispringboot.math.SimpleMath;
import br.com.br.firstapispringboot.request.convertes.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// kept using IllegalArgumentException as requested

@RestController
@RequestMapping("/math")
public class MathController {

    private SimpleMath math = new SimpleMath();

    // request mapping from sum
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
           @PathVariable("numberOne") String numberOne,
           @PathVariable("numberTwo") String numberTwo
    )  throws Exception {
        // validate inputs: if any value is NOT numeric, throw IllegalArgumentException (kept by request)
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // request mapping from subtraction
    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
           @PathVariable("numberOne") String numberOne,
           @PathVariable("numberTwo") String numberTwo
    )  throws Exception {
        // validate inputs: if any value is NOT numeric, throw IllegalArgumentException (kept by request)
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    // request mapping from multiplication
    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
           @PathVariable("numberOne") String numberOne,
           @PathVariable("numberTwo") String numberTwo
    )  throws Exception {
        // validate inputs: if any value is NOT numeric, throw IllegalArgumentException (kept by request)
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    // request mapping from multiplication
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
           @PathVariable("numberOne") String numberOne,
           @PathVariable("numberTwo") String numberTwo
    )  throws Exception {
        // validate inputs: if any value is NOT numeric, throw IllegalArgumentException (kept by request)
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // request mapping from mean
    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
           @PathVariable("numberOne") String numberOne,
           @PathVariable("numberTwo") String numberTwo
    )  throws Exception {
        // validate inputs: if any value is NOT numeric, throw IllegalArgumentException (kept by request)
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value");

        return math.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    // request mapping from square root
    @RequestMapping("/squareroot/{number}")
    public Double squareRoot(
           @PathVariable("number") String number
    )  throws Exception {
        // validate inputs: if any value is NOT numeric, throw IllegalArgumentException (kept by request)
        if(!NumberConverter.isNumeric(number)) throw new UnsupportedMathOperationException("Please set a numeric value");

        return math.squareRoot(NumberConverter.convertToDouble(number));
    }




}
