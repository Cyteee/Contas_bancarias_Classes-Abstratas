import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1020, "Halter", 200.00, 0.01));
        list.add(new BusinessAccount(1002, "Benson", 1020.0, 100.0));


        double soma = 0.0;
        for (Account acc : list){
            soma += acc.getBalance();
        }

         System.out.printf("Saldo total: %.2f%n", soma);

        for (Account acc : list){
            acc.deposit(26.85);
        }
        for (Account acc : list){
            System.out.printf("Saldo final na conta %d apos deposito: %.2f%n", acc.getNumber(), acc.getBalance());
        }

        sc.close();
}