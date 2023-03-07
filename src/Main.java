public class Main {
    public static void main(String[] args) {

        int accountBalance = 100;
        int replenishmentAmount = 1500;
        int bonus;
        int currentAccount;

        if (replenishmentAmount < 1000) {
            currentAccount = accountBalance+replenishmentAmount;
            System.out.println("Клиент пополнил счёт на "+replenishmentAmount+" рублей — бонусов нет, итоговая сумма на счету клиента — "+currentAccount+" рублей.");
        } else {
            bonus = replenishmentAmount / 100;
            currentAccount = accountBalance+replenishmentAmount+bonus;
            System.out.println("Клиент пополнил счёт на "+replenishmentAmount+" рублей — бонус равен "+bonus+" рублям, итоговая сумма на счету клиента — "        +currentAccount+" рублей.");
        }
    }
}
