package seminar_6.interfaces;

// interface CoffeMachine {
//     void makeEspresso();

//     void makeLatte();

//     void cleanMachine();
// }

// class BasicCoffeeMachine implements CoffeMachine {
//     @Override
//     public void makeEspresso() {
//         // реализация
//     }

//     @Override
//     public void makeLatte() {
//         throw new UnsupportedOperationException("BasicCoffeeMachine can't make latte");
//     }

//     @Override
//     public void cleanMachine() {
//         // реализация
//     }
// }

interface EspressoMachine {
    void makeEspresso();
}

interface LatteMachine {
    void makeLatte();
}

interface CleaningFunction {
    void cleanMachine();
}

class BasicCoffeeMachine implements EspressoMachine, CleaningFunction {
    @Override
    public void makeEspresso() {
        // реализация
    }

    @Override
    public void cleanMachine() {
        // реализация
    }
}

class AdvancedCoffeeMachine implements EspressoMachine, CleaningFunction, LatteMachine {
    @Override
    public void makeEspresso() {
        // реализация
    }

    @Override
    public void makeLatte() {
        // реализация
    }

    @Override
    public void cleanMachine() {
        // реализация
    }
}