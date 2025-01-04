package pro.sky.CalculatorTest.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.CalculatorTest.exception.ZeroDividerException;
import pro.sky.CalculatorTest.service.api.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ZeroDividerException();
        }
        return num1 / num2;
    }
}