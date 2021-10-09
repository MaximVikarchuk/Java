package hw.lesson6;

public class HomeWorkApp6 {

    public static void main(String[] args) {

        String tempWinEvent = "  получилось";
        String tempLossEvent = "  не получилось";
        String eventName;
        String eventResult;

        Cat cat1 = new Cat("Толстяк", 1, 50, 1);
        Cat cat2 = new Cat("Хвостач", 3, 100, 1);
        Dog dog1 = new Dog("Слюняч", 1.5f, 300, 5);
        Dog dog2 = new Dog("Гавкач", 0.5f, 150, 7);

        Animal[] animals = {cat1, cat2, dog1, dog2};

        float jumpLength = 2.5f;
        float runLength = 250;
        float swimLength = 8;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName() + " может ";

            eventName = "прыгнуть на " + animals[i].getMaxJump() + " м. Пытается прыгнуть на ";
            eventResult = (animals[i].jump(jumpLength)) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, jumpLength, eventResult);


            eventName = "пробежать на " + animals[i].getMaxRun() + " м. Пытается пробежать на ";
            eventResult = animals[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = animals[i].swim(swimLength);
            eventName = "проплыть на " + animals[i].getMaxSwim() + " м. Попытка проплыть на ";
            eventResult = (swimResult == Animal.SWIM_OK) ? tempWinEvent : tempLossEvent;

            if (swimResult == Animal.SWIM_NONE)
                eventResult = " это не получилось, т.к. не умеет плавать";
            result(nameString, eventName, swimLength, eventResult);
        }

        System.out.println("Всего животных = " + Animal.countAnimal + " > котов  = " + Cat.countCat + " > собак  = " + Dog.countDog);
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " м и" + resultEvent);
    }
}
