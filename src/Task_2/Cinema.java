package Task_2;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        //Fejlretter 1/5:
        this.seats = new String[rows][seats];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < seats; j++){
                this.seats[i][j] = "O";
            }
        }
        ////Fejlretter 2/5: Flyttet - Direktørens sæde reserveres her
        this.seats[0][0] = "X";
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        //Her reserveres sædet, hvis det er ledigt
        if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        //Fejlretter 3/5: "X" har erstattet "x" nedenfor:
        if (seats[row][seat].equals("X")) {
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}
