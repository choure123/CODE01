
public class RETURNTYPES {
    public int add() {
        int x = 23;
        int y = 24;
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        RETURNTYPES test = new RETURNTYPES();
        int add = test.add();
        System.out.println("the sum of x and y is " + add);


    }
}

