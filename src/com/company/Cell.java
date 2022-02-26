package com.company;

import java.awt.*;

public class Cell {
    private int coordX;
    private int coordY;
    private Color color;


    public Cell(int coordX, int coordY){
        this.color = Color.CYAN;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public Cell Division(Direction direction){
        int x=-1, y=-1;

        if(direction == Direction.down){
            x= this.coordX;
            y = this.coordY+1;

        }

        if(direction == Direction.up){
            x= this.coordX;
            y = this.coordY-1;
        }

        if(direction == Direction.left){
            x= this.coordX-1;
            y = this.coordY;
        }

        if(direction == Direction.right){
            x= this.coordX+1;
            y = this.coordY;
        }
        return new Cell(x,y);
    }

    public int getCordX(){
     return this.coordX;
    }

    public int getCordY(){
        return this.coordY;
    }

}
