package com.company;

import java.awt.*;

public class MatrixFinite {
    private int sizeX;
    private int sizeY;
    private Cell[][] matrix;


    public MatrixFinite(){
        this.sizeX = MatrixPrime.getInstance().getMatrix().length;
        this.sizeY = MatrixPrime.getInstance().getMatrix()[0].length;

        matrix = new Cell[sizeX][sizeY];

        for(int i = 0; i < sizeX; i++){
            for(int j = 0; j < sizeY; j++){
                matrix[i][j] = new Cell(i,j);
            }
        }

    }

    public Cell getCenter(Cell leftTop, Cell rightBottom){

        int x = (leftTop.getCordX()+rightBottom.getCordX())/2;
        int y = (leftTop.getCordY()+rightBottom.getCordY())/2;
        return this.matrix[x][y];
    }

    public void mutate(){ // основной алгоритм отрисовки
        Cell currentCell = getCenter(matrix[0][0],matrix[sizeX-1][sizeY-1]);

    }



}
