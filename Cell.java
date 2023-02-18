package ru.ivanovds.SpringStudy.pspu;

import lombok.Getter;

@Getter
public class Cell {

    private char name;
    private short number;
    private String nameFigure;
    private String colorFigure;

    public Cell(char name, short number, String nameFigure, String colorFigure) {
        this.name = name;
        this.number = number;
        this.nameFigure = nameFigure;
        this.colorFigure = colorFigure;
    }

    public Cell(char name, short number) {
        this.name = name;
        this.number = number;
    }

    public void setName(char name) {

        this.name = name;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    public void setColorFigure(String colorFigure) {
        this.colorFigure = colorFigure;
    }
}
