package ru.ivanovds.SpringStudy.pspu;

public class Board {

    public Cell[][] cells = new Cell[8][8];

    public Board() {
        iniBoard();
    }

    private void iniBoard() {
        for (short i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(convertToChar(j), (short) (i + 1));
            }
        }
    }

    public void putFig(char name, short number, String nameFigure, String colorFigure) {
        Cell cell = cells[convertToChar(name)][number - 1];
        if (cell.getNameFigure() == null || cell.getColorFigure() == null) {
            cells[convertToChar(name)][number - 1] = new Cell(name, number, nameFigure, colorFigure);
        } else {
            System.out.println("Недопустимая операция, в данный момент на этой клетки стоит фигура "
                    + cell.getColorFigure() + " " + cell.getNameFigure());
        }
    }

    public String getCell(char name, short number) {
        Cell cell = cells[convertToChar(name)][number - 1];
        if (cell.getNameFigure() != null || cell.getColorFigure() != null) {
            return "" + cell.getName() + cell.getNumber() + " - " + cell.getColorFigure() + " " + cell.getNameFigure();
        } else {
            return "";
        }
    }

    private char convertToChar(int i) {
        switch (i) {
            case 0:
                return 'a';
            case 1:
                return 'b';
            case 2:
                return 'c';
            case 3:
                return 'd';
            case 4:
                return 'e';
            case 5:
                return 'f';
            case 6:
                return 'g';
            case 7:
                return 'h';
            default:
                System.err.println("Не такой позиции на доске");
                return 'a';
        }
    }

    private char convertToChar(char elm) {
        switch (elm) {
            case 'a':
                return 0;
            case 'b':
                return 1;
            case 'c':
                return 2;
            case 'd':
                return 3;
            case 'e':
                return 4;
            case 'f':
                return 5;
            case 'g':
                return 6;
            case 'h':
                return 7;
            default:
                System.err.println("Не такой позиции на доске");
                return 0;
        }
    }

    public void print() {
        for (Cell[] cell : cells) {
            for (Cell value : cell) {
                if (value.getNameFigure() != null || value.getColorFigure() != null) {
                    System.out.print("" + value.getNumber() + value.getName() + " " +
                            value.getColorFigure() + " " + value.getNameFigure() + " ");
                } else {
                    System.out.print("" + value.getNumber() + value.getName() + " ");
                }
            }
            System.out.println();
        }
    }
}
