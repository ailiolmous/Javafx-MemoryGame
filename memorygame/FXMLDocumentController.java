package memorygame;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

/**
 *
 * @author Lefteris Moussiades
 * @author Anthi Iliopoulou
 */

public class FXMLDocumentController implements Initializable {

    BoardItem board[][];

    Button pB = null;
    BoardItem previousBoardItem = null;
    int tries = 0, opened = 0, score = 0;

    @FXML
    private Button button00;
    @FXML
    private Button button01;
    @FXML
    private Button button02;
    @FXML
    private Button button03;
    @FXML
    private Button button04;
    @FXML
    private Button button05;
    @FXML
    private Button button06;
    @FXML
    private Button button07;
    @FXML
    private Button button08;
    @FXML
    private Button button09;
    @FXML
    private Button button10;
    @FXML
    private Button button11;
    @FXML
    private Button button12;
    @FXML
    private Button button13;
    @FXML
    private Button button14;
    @FXML
    private Button button15;
    @FXML
    private Button button16;
    @FXML
    private Button button17;
    @FXML
    private Button button18;
    @FXML
    private Button button19;
    @FXML
    private Button button20;
    @FXML
    private Button button21;
    @FXML
    private Button button22;
    @FXML
    private Button button23;
    @FXML
    private Button button24;
    @FXML
    private Button button25;
    @FXML
    private Button button26;
    @FXML
    private Button button27;
    @FXML
    private Button button28;
    @FXML
    private Button button29;
    @FXML
    private Button button30;
    @FXML
    private Button button31;
    @FXML
    private Button button32;
    @FXML
    private Button button33;
    @FXML
    private Button button34;
    @FXML
    private Button button35;
    @FXML
    private Button button36;
    @FXML
    private Button button37;
    @FXML
    private Button button38;
    @FXML
    private Button button39;
    @FXML
    private Button button40;
    @FXML
    private Button button41;
    @FXML
    private Button button42;
    @FXML
    private Button button43;
    @FXML
    private Button button44;
    @FXML
    private Button button45;
    @FXML
    private Button button46;
    @FXML
    private Button button47;
    @FXML
    private Button button48;
    @FXML
    private Button button49;
    @FXML
    private Button button50;
    @FXML
    private Button button51;
    @FXML
    private Button button52;
    @FXML
    private Button button53;
    @FXML
    private Button button54;
    @FXML
    private Button button55;
    @FXML
    private Button button56;
    @FXML
    private Button button57;
    @FXML
    private Button button58;
    @FXML
    private Button button59;
    @FXML
    private Button button60;
    @FXML
    private Button button61;
    @FXML
    private Button button62;
    @FXML
    private Button button63;
    @FXML
    private Button button64;
    @FXML
    private Button button65;
    @FXML
    private Button button66;
    @FXML
    private Button button67;
    @FXML
    private Button button68;
    @FXML
    private Button button69;
    @FXML
    private Button button70;
    @FXML
    private Button button71;
    @FXML
    private Button button72;
    @FXML
    private Button button73;
    @FXML
    private Button button74;
    @FXML
    private Button button75;
    @FXML
    private Button button76;
    @FXML
    private Button button77;
    @FXML
    private Button button78;
    @FXML
    private Button button79;
    @FXML
    private Button button80;
    @FXML
    private Button button81;
    @FXML
    private Button button82;
    @FXML
    private Button button83;
    @FXML
    private Button button84;
    @FXML
    private Button button85;
    @FXML
    private Button button86;
    @FXML
    private Button button87;
    @FXML
    private Button button88;
    @FXML
    private Button button89;
    @FXML
    private Button button90;
    @FXML
    private Button button91;
    @FXML
    private Button button92;
    @FXML
    private Button button93;
    @FXML
    private Button button94;
    @FXML
    private Button button95;
    @FXML
    private Button button96;
    @FXML
    private Button button97;
    @FXML
    private Button button98;
    @FXML
    private Button button99;
    @FXML
    private Label scoreLabel;
    @FXML private Button buttonShow;
    

    void open(Button cB, int row, int clmn) {
        if (board[row][clmn].isImageFile()) {
            String fullFName = "images/" + board[row][clmn].getText();
            //System.out.println("user.dir: " + System.getProperty("user.dir"));
            cB.setStyle("-fx-background-image: url('" + fullFName + "');"
                    + "-fx-background-repeat: no-repeat; "
                    + "-fx-background-size: 100% 100%;");
        } else {
            cB.setText(board[row][clmn].getText());
        }
        board[row][clmn].setStatus(BoardItem.Status.TEMPOPEN);
    }

    void hide(Button cB, int row, int clmn) {
        if (board[row][clmn].isImageFile()) {
            cB.setStyle("-fx-background-image: none;");
        } else {
            cB.setText("");
        }
        board[row][clmn].setStatus(BoardItem.Status.HIDDEN);
    }

    Button getButton(int row, int clmn) {
        switch (row) {
            case 0:
                switch (clmn) {
                    case 0:
                        return button00;
                    case 1:
                        return button01;
                    case 2:
                        return button02;
                    case 3:
                        return button03;
                    case 4:
                        return button04;
                    case 5:
                        return button05;
                    case 6:
                        return button06;
                    case 7:
                        return button07;
                    case 8:
                        return button08;
                    case 9:
                        return button09;
                }
            case 1:
                switch (clmn) {
                    case 0:
                        return button10;
                    case 1:
                        return button11;
                    case 2:
                        return button12;
                    case 3:
                        return button13;
                    case 4:
                        return button14;
                    case 5:
                        return button15;
                    case 6:
                        return button16;
                    case 7:
                        return button17;
                    case 8:
                        return button18;
                    case 9:
                        return button19;
                }
            case 2:
                switch (clmn) {
                    case 0:
                        return button20;
                    case 1:
                        return button21;
                    case 2:
                        return button22;
                    case 3:
                        return button23;
                    case 4:
                        return button24;
                    case 5:
                        return button25;
                    case 6:
                        return button26;
                    case 7:
                        return button27;
                    case 8:
                        return button28;
                    case 9:
                        return button29;
                }
            case 3:
                switch (clmn) {
                    case 0:
                        return button30;
                    case 1:
                        return button31;
                    case 2:
                        return button32;
                    case 3:
                        return button33;
                    case 4:
                        return button34;
                    case 5:
                        return button35;
                    case 6:
                        return button36;
                    case 7:
                        return button37;
                    case 8:
                        return button38;
                    case 9:
                        return button39;
                }
            case 4:
                switch (clmn) {
                    case 0:
                        return button40;
                    case 1:
                        return button41;
                    case 2:
                        return button42;
                    case 3:
                        return button43;
                    case 4:
                        return button44;
                    case 5:
                        return button45;
                    case 6:
                        return button46;
                    case 7:
                        return button47;
                    case 8:
                        return button48;
                    case 9:
                        return button49;
                }
            case 5:
                switch (clmn) {
                    case 0:
                        return button50;
                    case 1:
                        return button51;
                    case 2:
                        return button52;
                    case 3:
                        return button53;
                    case 4:
                        return button54;
                    case 5:
                        return button55;
                    case 6:
                        return button56;
                    case 7:
                        return button57;
                    case 8:
                        return button58;
                    case 9:
                        return button59;
                }
            case 6:
                switch (clmn) {
                    case 0:
                        return button60;
                    case 1:
                        return button61;
                    case 2:
                        return button62;
                    case 3:
                        return button63;
                    case 4:
                        return button64;
                    case 5:
                        return button65;
                    case 6:
                        return button66;
                    case 7:
                        return button67;
                    case 8:
                        return button68;
                    case 9:
                        return button69;
                }
            case 7:
                switch (clmn) {
                    case 0:
                        return button70;
                    case 1:
                        return button71;
                    case 2:
                        return button72;
                    case 3:
                        return button73;
                    case 4:
                        return button74;
                    case 5:
                        return button75;
                    case 6:
                        return button76;
                    case 7:
                        return button77;
                    case 8:
                        return button78;
                    case 9:
                        return button79;
                }
            case 8:
                switch (clmn) {
                    case 0:
                        return button80;
                    case 1:
                        return button81;
                    case 2:
                        return button82;
                    case 3:
                        return button83;
                    case 4:
                        return button84;
                    case 5:
                        return button85;
                    case 6:
                        return button86;
                    case 7:
                        return button87;
                    case 8:
                        return button88;
                    case 9:
                        return button89;
                }
            case 9:
                switch (clmn) {
                    case 0:
                        return button90;
                    case 1:
                        return button91;
                    case 2:
                        return button92;
                    case 3:
                        return button93;
                    case 4:
                        return button94;
                    case 5:
                        return button95;
                    case 6:
                        return button96;
                    case 7:
                        return button97;
                    case 8:
                        return button98;
                    case 9:
                        return button99;
                }
        }
        return null;
    }

    void openAll() {
        for (int row = 0; row < board.length; row++) {
            for (int clmn = 0; clmn < board[row].length; clmn++) {
                open(getButton(row, clmn), row, clmn);
            }
        }
    }

    void hideAll() {
        for (int row = 0; row < board.length; row++) {
            for (int clmn = 0; clmn < board[row].length; clmn++) {
                hide(getButton(row, clmn), row, clmn);
            }
        }
    }

    @FXML
    private void handleButtonShowAction(ActionEvent event) {
        if (Board.allHidden(board)) {
            openAll();
            PauseTransition visiblePause = new PauseTransition(Duration.seconds(20));
            visiblePause.setOnFinished((ActionEvent e) -> {
                hideAll();
            });
            visiblePause.play();
        }
    }

    void updateScore() {
        String text = "Opened: " + opened + " Tries: " 
                + tries + " Score: " + 
                (int) (((double) opened / tries) * 1000);
        scoreLabel.setText(text);
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        buttonShow.setDisable(true);
        ArrayList<BoardItem> tempOpenList = Board.temporaryOpen(board);
        if (tempOpenList.size() == 2) {
            return;
        }

        Button cB = (Button) event.getSource();
        String fxId = cB.getId();
        int row = Integer.valueOf(fxId.substring(6, 7));
        int clmn = Integer.valueOf(fxId.substring(7, 8));
        BoardItem.Status status = board[row][clmn].getStatus();
        if (status != BoardItem.Status.HIDDEN) {
            return;
        }

        open(cB, row, clmn);
        tempOpenList.add(board[row][clmn]);
        if (tempOpenList.size() == 2) {
            tries++;
            updateScore();
            String fxIdPB = pB.getId();
            int rowPB = Integer.valueOf(fxIdPB.substring(6, 7));
            int clmnPB = Integer.valueOf(fxIdPB.substring(7, 8));
            if (!board[row][clmn].match(previousBoardItem)) {
                PauseTransition visiblePause = new PauseTransition(Duration.seconds(5));
                visiblePause.setOnFinished((ActionEvent e) -> {
                    hide(pB, rowPB, clmnPB);
                    board[rowPB][clmnPB].setStatus(BoardItem.Status.HIDDEN);
                    hide(cB, row, clmn);
                    board[row][clmn].setStatus(BoardItem.Status.HIDDEN);
                    pB = null;
                    previousBoardItem = null;
                });
                visiblePause.play();

            } else {
                opened++;
                updateScore();
                pB = cB;
                previousBoardItem = board[row][clmn];
                board[rowPB][clmnPB].setStatus(BoardItem.Status.OPEN);
                board[row][clmn].setStatus(BoardItem.Status.OPEN);
            }
        } else {
            pB = cB;
            previousBoardItem = board[row][clmn];

        }

    }

    ArrayList<String> loadFileNames() {
        ArrayList<String> fileNames = new ArrayList<>();

        File[] files = new File("./src/images").listFiles();
        for (File file : files) {
            if (file.isFile()) {
                fileNames.add(file.getName());
            }
        }
        return fileNames;
    }

    ArrayList<String> getImageText(ArrayList<String> fileNames) {
        ArrayList<String> items = new ArrayList<>(fileNames.size());
        Iterator<String> i = fileNames.iterator();
        while (i.hasNext()) {
            String fN = i.next();
            String iName = fN.substring(0, fN.indexOf('.'));
            items.add(iName);
        }
        return items;
    }

    ArrayList<String> concat(ArrayList<String> fNames, ArrayList<String> iNames) {
        ArrayList<String> concatenated = new ArrayList<>(fNames);
        Iterator<String> i = iNames.iterator();
        while (i.hasNext()) {
            concatenated.add(i.next());
        }
        return concatenated;
    }

    BoardItem[][] getBoard(ArrayList<String> allItems) {
        BoardItem board[][] = new BoardItem[10][10];

        for (int i = 0; i < allItems.size(); i++) {
            int row = i / 10;
            int clmn = i % 10;
            board[row][clmn] = new BoardItem(allItems.get(i));
        }
        return board;
    }

    void print() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j].isImageFile()) {
                    System.out.print(board[i][j].getText() + " ");
                } else {
                    System.out.print(board[i][j].getText() + ".jpg ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<String> fileNames = loadFileNames();
        ArrayList<String> imageText = getImageText(fileNames);
        ArrayList<String> allItems = concat(fileNames, imageText);
        Collections.shuffle(allItems);
        board = getBoard(allItems);
        //print();

        // TODO
    }

}
