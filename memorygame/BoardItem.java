package memorygame;

/**
 *
 * @author Lefteris Moussiades
 * @author Anthi Iliopoulou
 */

public class BoardItem {
    public enum Status {HIDDEN, TEMPOPEN, OPEN};
    
    
    private final String text;
    private boolean isOpen;
    private Status status;
    private BoardItem correspondingItem;
    
    public BoardItem(String text) {
        this.text=text;
        status=Status.HIDDEN;
        correspondingItem=null;
    }
    
    public boolean isImageFile() {
        return text.contains(".");
    }
    
    public void setStatus(Status status) {
        this.status=status;
    }
    
    public void setCorrespondingItem(BoardItem cI) {
        correspondingItem=cI;
    }
    
    public Status getStatus() {
        return status;
    }
    
    public String getText() {
        return text;
    }
    
    public boolean match(BoardItem bI) {
        String lText=text.replaceAll(".jpg", "");
        String pText=bI.text.replaceAll(".jpg", "");
        return lText.equals(pText);
    }
    
}
