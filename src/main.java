public class main {
    public static void main(String[] args) {

        int refill = 1000;
        int bonus = 1000;
        int accaunt = 200;
        int Balance;
        int CommonBonus = refill/100;
        if (refill < bonus) {CommonBonus = 0;}
        if (refill < bonus) {Balance = refill + accaunt ;}
        else {Balance = refill + accaunt + CommonBonus ;}
        System.out.println(Balance);
        System.out.println(CommonBonus);

    }
}
