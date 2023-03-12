import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию: 1. Добавить продукт. 2. Посмотреть список продуктов. 3. Удалить продукт.");
            System.out.println("Выберите номер операции или введите `end`");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            switch (input) {
                case ("1"): {
                    System.out.println("Какую покупку хотите добавить?");
                    String addProduct = scanner.nextLine();
                    products.add(addProduct);
                    int size = products.size();
                    System.out.println("Итого в списке покупок: " + size);
                    break;
                }
                case ("2"): {
                    System.out.println("Список покупок:");
                    showList(products) ;
                    break;
                }
                case ("3"): {
                    System.out.println("Список покупок:");
                    showList(products);
                    System.out.println("Введите номер или название покупки которую хотите удалить.");

                    if (scanner.hasNextInt()) {
                        String deleteProduct = scanner.nextLine();
                        int productId = Integer.parseInt(deleteProduct) - 1;
                        String deleteName = products.get(productId);
                        products.remove(productId);
                        System.out.println("Покупка " + deleteName + " удалена, список покупок:");
                        showList(products);
                    } else {
                        String deleteProduct = scanner.nextLine();
                        boolean isRemoved = products.remove(deleteProduct);
                        System.out.println("Покупка " + deleteProduct + " удалена, список покупок:");
                        showList(products);
                        }
                    }
                    break;
                }
            }
        }
    private static void showList(List<String> products) {
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
    }
}