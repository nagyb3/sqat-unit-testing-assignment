import java.util.Random;

public class Database {

    private int[] numbers;
    private int size;

    private int lbound = 1;
    private int ubound = 100;

    public Database(int num) {
        this.size = num;
        numbers = new int[num];

        Random random = new Random();

        for(int i = 0; i < num; i++) {
            numbers[i] = random.nextInt(this.lbound, this.ubound);
        }        
    }

    public boolean checknum(int num) {
        for(int i = 0; i < this.size; i++) {
            if(numbers[i] == num) {
                return true;
            }
        }

        return false;
    }

}