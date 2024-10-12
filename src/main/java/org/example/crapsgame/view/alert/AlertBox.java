package org.example.crapsgame.view.alert;

import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AlertBox implements IAlertBox {

    @Override
    public void showMessage(String title, String header, String content){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();

    }

    public void infoAlert(String title, String header, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(null);
        Image image = new Image(getClass().getResourceAsStream("/org/example/crapsgame/images/cra.png"));
        ImageView imageView = new ImageView(image);


        alert.setGraphic(imageView);

        alert.getDialogPane().setPrefSize(400, 400);
        alert.showAndWait();
    }
}
