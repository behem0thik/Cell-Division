package com.company;

import java.awt.*;

public class MatrixPrime {
    private static MatrixPrime instance;
    private Cell[][] matrix;

    private MatrixPrime(){

        //to-do: превратить картинку в матрицу
    }

    public static MatrixPrime getInstance(){
        if (instance ==null) {
            instance = new MatrixPrime();
        }
        return instance;
    }

    public Cell[][] getMatrix() {
        return this.matrix;
    }



}
