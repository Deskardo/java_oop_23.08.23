package home_work_7_final_work;

import java.io.IOException;
import java.util.logging.Logger;

import home_work_7_final_work.userInterface.UserInterface;

public class Program {
    public static void main(String[] args) throws SecurityException, IOException {
        UserInterface ui = new UserInterface();
        Logger logger = Logger.getLogger("ComplexCalculatorLogger");
        ComplexCalculator calculator = new ComplexCalculator(ui, logger);
        calculator.run();
    }
}
