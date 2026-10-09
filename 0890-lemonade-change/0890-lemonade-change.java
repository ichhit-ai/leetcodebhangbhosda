class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fivedollars = 0;
        int tendollars = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fivedollars++;
            }
            else if (bills[i] == 10) {
                if (fivedollars > 0) {
                    fivedollars--;
                    tendollars++;
                }
                else {
                    return false;
                }
            }
            else if (bills[i] == 20) {
                if (tendollars > 0 && fivedollars > 0) {
                    tendollars--;
                    fivedollars--;
                }
                else if (fivedollars >= 3) {
                    fivedollars -= 3;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }
}