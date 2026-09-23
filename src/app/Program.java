package app;

public class Program {

    public static void main(String[] args) {
        switch (var) {
            case val:
                
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    uj[i+7] = pakli[19 - (i - 1) * 3];
                    uj[i] = pakli[20 - (i - 1) * 3];
                    uj[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    uj[i+7] = pakli[19 - (i - 1) * 3];
                    uj[i + 14] = pakli[21 - (i - 1) * 3];
                    uj[i] = pakli[20 - (i - 1) * 3];
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    
    
}
