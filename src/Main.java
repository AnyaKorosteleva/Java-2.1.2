public class Main {
    public static void main(String[] args) {

        int refill = 1000;
        int bonus = 1000;
        int accaunt = 200;
        int balance;
        int commonBonus = refill / 100;
        if (refill < bonus) {commonBonus = 0;}
        if (refill < bonus) {balance = refill + accaunt ;}
        else {balance = refill + accaunt + commonBonus ;}
        System.out.println(balance);
        System.out.println(commonBonus);

    }
}
