package org.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import org.example.crapsgame.model.Dice;
import org.example.crapsgame.model.Game;
import org.example.crapsgame.view.alert.AlertBox;

import java.util.ArrayList;

public class GameController {

    @FXML
    private Label pointLabel, shootLabel;

    @FXML
    private ImageView dice1ImageView, dice2ImageView;

    Dice dice1, dice2;

    private Game game = new Game();

    ArrayList<Game> games = new ArrayList<Game>();

    public GameController() {
        this.dice1 = new Dice();
        this.dice2 = new Dice();
    }
    public void setGame(Game game) {
        this.game = game;
    }

    @FXML
    public void onHandleButtonRollTheDice(ActionEvent event) {
        this.dice1.rollDice();
        this.dice2.rollDice();
        this.dice1ImageView.setImage(this.dice1.getDiceImage());
        this.dice2ImageView.setImage(this.dice2.getDiceImage());

        game.setShootCount(game.getShootCount() + 1);
        int punto = dice1.getValue()+dice2.getValue();
        game.setPoint(punto);

        initialize();
    }

    @FXML
    void onHelpButton(ActionEvent event) {
        new AlertBox().infoAlert("How To Play", "", "");
    }

    public void initialize(){


       this.pointLabel.setText(String.valueOf(game.getPoint()));

       this.shootLabel.setText(String.valueOf(game.getShootCount()));
    }

}
