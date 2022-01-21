package second;

public class Cell {
    int cell;
    private final int FLAGGED = 4;
    public boolean isFlagged() {
        return cell == FLAGGED ? true : false;
    }
}
