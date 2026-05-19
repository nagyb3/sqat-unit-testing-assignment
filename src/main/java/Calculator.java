import java.lang.Math;

public class Calculator {

    private final Database db;

    public Calculator() {
        this.db = new Database(10);
    }

    public Calculator(int num) {
        this.db = new Database(num);
    }

    public int add(int a, int b) {
		return a + b;
	}

    public double sqrt(double num) {
        return Math.sqrt(num);
    }

    public int factorial(int num) {
        int res = 1, i;
        for (i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    public boolean checknum(int num) {
        return db.checknum(num);
    }
}