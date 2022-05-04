public class ATM {
    public int countBanknotes(int sum) {
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] noteCounter = new int[9];
        int amount = 0;
        int i = 0;
        while (i < 9) {
            if (sum >= banknotes[i]) {
                noteCounter[i] = sum / banknotes[i];
                sum -= noteCounter[i] * banknotes[i];
            }
            i++;
        }
        int j = 0;
        while (j < 9) {
            if (noteCounter[j] != 0) {
                amount += noteCounter[j];
            }
            j++;
        }
        return amount;
    }
}