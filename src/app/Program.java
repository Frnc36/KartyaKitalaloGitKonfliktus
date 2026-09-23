package app;

public class Program {
    static String[] pakli = new String[22];
            
    public static void main(String[] args) {
        int oszlop = 1;
        kever(oszlop);
    }

    private static void kever(int oszlop) {
        String[] regiPakli = pakli;
        switch (oszlop) {
            case 1:
                for (int i = 1; i < 8; i++) {
                    pakli[i] = regiPakli[19-(i-1)*3];
                    pakli[i+7] = regiPakli[20-(i-1)*3];
                    pakli[i+14] = regiPakli[21-(i-1)*3];
                    
                }   break;
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
