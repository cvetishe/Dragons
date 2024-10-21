import java.util.Scanner;

public class Main {
    static final int MIN_HEAD = 3;
    public static void main(String[] args) {
        System.out.println("Введите количество голов драконьей стаи: ");
        Scanner inn = new Scanner(System.in);
        int heads = inn.nextInt();
        powerDragonPack(heads);
    }
    public static void powerDragonPack(int heads){
        int additionalHeads = heads % MIN_HEAD;
        int power = 1;
        int dragons;
        if (additionalHeads == 1) {
            dragons = (heads / MIN_HEAD) - 1;
            power = calcPower(power,dragons);
            power *= additionalHeads + MIN_HEAD;
        } else if (additionalHeads == 2) {
            dragons = heads / MIN_HEAD;
            power = calcPower(power,dragons);
            power *= additionalHeads;
        } else if (additionalHeads == 0) {
            dragons = heads / MIN_HEAD;
            power = calcPower(power,dragons);
        }
        System.out.println("Cила, которая может быть у стаи драконов из " + heads + " голов: " + power);
    }
    
    public static int calcPower(int power, int dragons) {
        for (int i = 0; i < dragons; i++) {
            power *= MIN_HEAD;
        }
        return power;
    }
}