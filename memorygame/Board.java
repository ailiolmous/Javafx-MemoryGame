package memorygame;

import java.util.ArrayList;

/**
 *
 * @author Lefteris Moussiades
 * @author Anthi Iliopoulou
 */
public class Board {
    public static ArrayList<BoardItem> temporaryOpen(BoardItem board[][]) {
        ArrayList<BoardItem> rVal=new ArrayList<>();
        for (BoardItem[] board1 : board) {
            for (BoardItem board11 : board1) {
                if (board11.getStatus() == BoardItem.Status.TEMPOPEN) {
                    rVal.add(board11);
                }
            }
        }
        return rVal;
    }
    
    public static boolean allHidden(BoardItem board[][]) {
        for (BoardItem[] board1 : board) {
            for (BoardItem board11 : board1) {
                if (board11.getStatus() != BoardItem.Status.HIDDEN) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
