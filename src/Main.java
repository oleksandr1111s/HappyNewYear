public class Main {
    public static void main(String[] args) {
        User Oleksandr = new User(121212, "Zhdanov", 5000);
        User Timur = new User(456121, "Hladiy", 10);
        User Vova = new User(532134, "Kostyk", 4000);
        User Pasha = new User(656564, "Kotleta", 1000000);
        System.out.println("У користувача з прізвищем " + "Zhdanov" + " і ID " + 121212 + " з балансом " + 5000 + ".");
        System.out.println("У користувача з прізвищем " + "Hladiy" + " і ID " + 456121 + " з балансом " + 10 + ".");
        System.out.println("У користувача з прізвищем " + "Kostyk" + " і ID " + 532134 + " з балансом " + 4000 + ".");
        System.out.println("У користувача з прізвищем " + "Kotleta" + " і ID " + 656564 + " з балансом " + 1000000 + ".");
    }
}
