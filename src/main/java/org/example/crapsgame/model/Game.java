package org.example.crapsgame.model;

public class Game {
    private int shootCount;
    private int shoot;
    private int point;
    private boolean win;
    private boolean lose;
    Dice dice1, dice2;

    public Game() {
        this.shootCount = 0;
        this.shoot = 0;
        this.point = 0;
    }

    public int getShoot() {
        return this.shoot;
    }

    public int getShootCount() {
        return this.shootCount;
    }

    public void setShootCount(int x){
        this.shootCount = x;
    }

    public void setShoot(int x){
        this.shoot = x;
    }

    public int getPoint() {
        return this.point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public boolean isWin() {
        return this.win;
    }

    public boolean isLose() {
        return this.lose;
    }

    public int rollDices() {
        return this.shoot;
    }

}
