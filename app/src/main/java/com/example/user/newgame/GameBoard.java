package com.example.user.newgame;

/**
 * Created by oriisking on 07/07/2017.
 */

public class GameBoard {

    //Data members
    private Character[][] boardMatrix;

    /**
     * Building a new instance of a board object.
     */
    public GameBoard()
    {
        this.boardMatrix = new Character[9][9];
    }
}
