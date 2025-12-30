public class Main {
    public static void main(String[] args) {
        User Oleksandr = new User(121212, "Oleksandr", "Zhdanov", 5000);
        User Timur = new User(456121,"Timur", "Hladii", 10);
        User Vova = new User(532134,"Vova", "Kostyk", 4000);
        User Pasha = new User(656564,"Pasha", "Kotleta", 1000000);
        checkMoney(Timur);
        checkMoney(Oleksandr);
        checkMoney(Pasha);
        checkMoney(Vova);
        transfer(Timur, Vova, 200);
        checkMoney(Timur);
        checkMoney(Vova);
    }

    public static void checkMoney(User user){
        System.out.println("На рахунку у " + user.firstName + ": " + user.money + " стільки грошей.");
    }
    public static void transfer(User fromUser, User toUser, double countOfMoney){
        toUser.money = toUser.money+countOfMoney;
        fromUser.money = toUser.money-countOfMoney;
    }
}
