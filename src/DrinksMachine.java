import java.util.Scanner;

public class DrinksMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        double totalPrice = 0;

        System.out.printf("Щоб замовити %s натисність %d. Ціна напою - %.2f ₴\n", Drinks.COFFEE, Drinks.COFFEE.ordinal() + 1, Drinks.COFFEE.getPrice());
        System.out.printf("Щоб замовити %s натисність %d. Ціна напою - %.2f ₴\n", Drinks.TEA, Drinks.TEA.ordinal() + 1, Drinks.TEA.getPrice());
        System.out.printf("Щоб замовити %s натисність %d. Ціна напою - %.2f ₴\n", Drinks.LEMONADE, Drinks.LEMONADE.ordinal() + 1, Drinks.LEMONADE.getPrice());
        System.out.printf("Щоб замовити %s натисність %d. Ціна напою - %.2f ₴\n", Drinks.MOJITO, Drinks.MOJITO.ordinal() + 1, Drinks.MOJITO.getPrice());
        System.out.printf("Щоб замовити %s натисність %d. Ціна напою - %.2f ₴\n", Drinks.WATER, Drinks.WATER.ordinal() + 1, Drinks.WATER.getPrice());
        System.out.printf("Щоб замовити %s натисність %d. Ціна напою - %.2f ₴\n", Drinks.COLA, Drinks.COLA.ordinal() + 1, Drinks.COLA.getPrice());


        while (counter >= 0) {
            switch (scanner.nextInt()) {
                case 1:
                    counter++;
                    totalPrice = totalPrice + Drinks.COFFEE.getPrice();
                    System.out.printf("Ви замовили %s. Його вартість - %.2f ₴.\tЗагальна вартість замовлення - %.2f ₴.\nВи можете замовити ще напої, або завершити роботу автомату та отримати загальну суму до сплати (для цього натисніть 0).\n", Drinks.COFFEE, Drinks.COFFEE.getPrice(), totalPrice);
                    break;

                case 2:
                    counter++;
                    totalPrice = totalPrice + Drinks.TEA.getPrice();
                    System.out.printf("Ви замовили %s. Його вартість - %.2f ₴.\tЗагальна вартість замовлення - %.2f ₴.\nВи можете замовити ще напої, або завершити роботу автомату та отримати загальну суму до сплати (для цього натисніть 0).\n", Drinks.TEA, Drinks.TEA.getPrice(), totalPrice);
                    break;

                case 3:
                    counter++;
                    totalPrice = totalPrice + Drinks.LEMONADE.getPrice();
                    System.out.printf("Ви замовили %s. Його вартість - %.2f ₴.\tЗагальна вартість замовлення - %.2f ₴.\nВи можете замовити ще напої, або завершити роботу автомату та отримати загальну суму до сплати (для цього натисніть 0).\n", Drinks.LEMONADE, Drinks.LEMONADE.getPrice(), totalPrice);
                    break;

                case 4:
                    counter++;
                    totalPrice = totalPrice + Drinks.MOJITO.getPrice();
                    System.out.printf("Ви замовили %s. Його вартість - %.2f ₴.\tЗагальна вартість замовлення - %.2f ₴.\nВи можете замовити ще напої, або завершити роботу автомату та отримати загальну суму до сплати (для цього натисніть 0).\n", Drinks.MOJITO, Drinks.MOJITO.getPrice(), totalPrice);
                    break;

                case 5:
                    counter++;
                    totalPrice = totalPrice + Drinks.WATER.getPrice();
                    System.out.printf("Ви замовили %s. Його вартість - %.2f ₴.\tЗагальна вартість замовлення - %.2f ₴.\nВи можете замовити ще напої, або завершити роботу автомату та отримати загальну суму до сплати (для цього натисніть 0).\n", Drinks.WATER, Drinks.WATER.getPrice(), totalPrice);
                    break;

                case 6:
                    counter++;
                    totalPrice = totalPrice + Drinks.COLA.getPrice();
                    System.out.printf("Ви замовили %s. Його вартість - %.2f ₴.\tЗагальна вартість замовлення - %.2f ₴.\nВи можете замовити ще напої, або завершити роботу автомату та отримати загальну суму до сплати (для цього натисніть 0).\n", Drinks.COLA, Drinks.COLA.getPrice(), totalPrice);
                    break;

                case 0:
                    System.out.printf("Кількість замовлених напоїв - %d.\nДо сплати - %.2f ₴", counter, totalPrice);
                    return;
            }
        }
    }
}
