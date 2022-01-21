package second;

import java.util.ArrayList;
import java.util.List;

public class Intro {

    List<int[]> theList = new ArrayList<>();
    List<Cell> gameBoard = new ArrayList<>();

    /**
     * 코드가 하는 일을 짐작하기 어렵다.
     */
    public List<int[]> getThem(){
        List<int[]> list1 = new ArrayList<>();
        for (int[] x : theList) {
            if(x[0] == 4)
                list1.add(x);
        }
        return list1;
    }

    /**
     * 간단한 클래스로 만들경우 함수가 하는 일을 이해하기 쉬워졌다.
     */
    public List<Cell> getFlaggedCells(){
        List<Cell> flaggedCells = new ArrayList<>();
        for (Cell cell : gameBoard) {
            if(cell.isFlagged()){
                flaggedCells.add(cell);
            }
        }
        return flaggedCells;
    }
}
