package tables;
public class Exercice_4_MultiplicationTable {

    public static void main(String[] args) {

        int num = 3;
        for(int i = 0; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}