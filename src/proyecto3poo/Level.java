/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3poo;

/**
 *
 * @author Elio
 */
public class Level {
    private int horizontalBoxes;
    private int verticalBoxes;
    private int moves;
    private int scoreToReach;

    public Level(int horizontalBoxes, int verticalBoxes, int moves, int scoreToReach) {
        this.horizontalBoxes = horizontalBoxes;
        this.verticalBoxes = verticalBoxes;
        this.moves = moves;
        this.scoreToReach = scoreToReach;
    }

    public int getHorizontalBoxes() {
        return horizontalBoxes;
    }

    public void setHorizontalBoxes(int horizontalBoxes) {
        this.horizontalBoxes = horizontalBoxes;
    }

    public int getVerticalBoxes() {
        return verticalBoxes;
    }

    public void setVerticalBoxes(int verticalBoxes) {
        this.verticalBoxes = verticalBoxes;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    public int getScoreToReach() {
        return scoreToReach;
    }

    public void setScoreToReach(int scoreToReach) {
        this.scoreToReach = scoreToReach;
    }
    
}
