package home_work_7_final_work;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import home_work_7_final_work.operationInterface.ComplexNumberInterface;
import home_work_7_final_work.userInterface.UserInterface;

/**
 * Класс калькулятора комплексных чисел.
 */
class ComplexCalculator {
    private ComplexNumberInterface num1;
    private ComplexNumberInterface num2;
    private ComplexNumberInterface result;
    private String operation;
    private UserInterface ui;
    private Logger logger;
    private FileHandler fileHandler;

    public ComplexCalculator(UserInterface ui, Logger logger) throws SecurityException, IOException {
        this.ui = ui;
        this.logger = logger;
        
        fileHandler = new FileHandler("complex_calculator.log");
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);
    }

    public void run() {
        try {
            num1 = ui.getComplexNumber();
            num2 = ui.getComplexNumber();
            operation = ui.getOperation();

            switch (operation) {
                case "+":
                    result = num1.add(num2);
                    break;
                case "-":
                    result = num1.subtract(num2);
                    break;
                case "*":
                    result = num1.multiply(num2);
                    break;
                case "/":
                    result = num1.divide(num2);
                    break;
                default:
                    ui.printError();
                    logger.log(Level.WARNING, "Invalid operation: " + operation);
                    return;
            }

            ui.printResult(result);
            logger.log(Level.INFO, "Operation " + operation + " performed successfully");
        } finally {
            fileHandler.close();
        }
    }
}