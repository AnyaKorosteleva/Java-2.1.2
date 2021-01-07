public class main {
    public static void main(String[] args) {

        int refill = 1100;
        int EveryHundred = 100;
        int bonus = 1000;
        int accaunt = 500;
        if (refill < bonus) {refill = 0;}
        int CommonBonus = refill/EveryHundred;
        int Balance = refill + accaunt + CommonBonus;
        System.out.println(Balance);
        System.out.println(CommonBonus);

    }
}
