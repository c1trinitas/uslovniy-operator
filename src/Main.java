public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Task 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");

        } else {
            System.out.println("Ты несовершеннолетний");
        }
        int ageTwo = 19;
        if (ageTwo >= 18) {
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("Ты несовершеннолетний");
        }
        System.out.println("Task 2");
        int temperature = 7;
        if (temperature >= 5) {
            System.out.println("На улице тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, лучше быть в шапке");
        }
        int temperatureTwo = 4;
        if (temperatureTwo >= 5) {
            System.out.println("На улице тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, лучше быть в шапке");
        }
        System.out.println("Task 3");
        int speed = 70;
        int normalSpeed = 60;
        if (speed > normalSpeed) {
            System.out.println("Превышена скорость, вы можете быть оштрафованы");
        } else {
            System.out.println("Скорость приемлема, вы не превышаете скоростной лимит");
        }
        int speedTwo = 55;
        if (speedTwo > normalSpeed) {
            System.out.println("Превышена скорость, вы можете быть оштрафованы");
        } else {
            System.out.println("Скорость приемлема, вы не превышаете скоростной лимит");
        }
        System.out.println("Task 4");
        int tetr = 17;
        if (tetr < 2 && tetr >= 6) {
            System.out.println("Скорее всего ты ходишь в детсад");
        } else if (tetr > 6 && tetr <= 17) {
            System.out.println("Скорее всего ты ходишь в школу");
        } else if (tetr >= 18 && tetr <= 24) {
            System.out.println("Скорее всего ты учишься в вузе");
        } else if (tetr >= 24) {
            System.out.println("Скорее всего ты ходишь на работу");
        }
        System.out.println("Task 5");
        int ert = 12;
        if (ert < 5) {
            System.out.println("Если возраст ребенка равен" + ert + "то ему нельзя кататься на атракционе");
        } else if (ert > 5 && ert < 14) {
            System.out.println("Если возраст ребенка равен" + ert + "то ему можно кататься, но в сопровождении взрослого, без взрослого кататься нельзя");
        } else if (ert >= 14) {
            System.out.println("Если возраст ребенка равен" + ert + "то ему можно кататься самостоятельно");
        }
        System.out.println("Task 6");
        int railwayCarriage = 102;
        int seats = 60;
        int standingPlaces = railwayCarriage - seats;
        System.out.println("Всего" + standingPlaces + "стоячих мест");
        int sittingPeople = 48;
        int standingPeople = 38;
        if (sittingPeople < seats) {
            System.out.println("В вагоне есть ещё места где можно посидеть");
        } else if (sittingPeople >= seats) {
            System.out.println("В вагоне нет мест где можно посидеть");
        }
        if (standingPeople < standingPlaces) {
            System.out.println("В вагоне есть места где можно постоять");
        } else if (standingPeople >= standingPlaces) {
            System.out.println("В вагоне нет мест где можно постоять");
        }
        System.out.println("Task 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Самое большое число это" + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число это" + two);
        } else if (three > two && three > one) {
            System.out.println("Самое большое число это" + three);
        }
    }
}



