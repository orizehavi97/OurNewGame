package com.example.user.newgame;

/**
 * Created by oriisking on 07/07/2017.
 */

public class GameBoard {

    //Data members
    private Point[][] boardMatrix;

    /**
     * Building a new instance of a board object.
     */
    public GameBoard()
    {
        boardMatrix = new Point[9][9];
    }
}
