/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecenarios;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.SepiaTone;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import Clases_Java.Peon;

/**
 * FXML Controller class
 *
 * @author milto
 */
public class JugandoController implements Initializable {

    @FXML
    private Button btSiguienteTurno;
    @FXML
    private Button btVolver;
    @FXML
    private Button btSalirJuego;
    @FXML
    private Button bt1A;
    @FXML
    private Button bt1B;
    @FXML
    private Button bt1C;
    @FXML
    private Button bt1D;
    @FXML
    private Button bt1E;
    @FXML
    private Button bt1F;
    @FXML
    private Button bt1G;
    @FXML
    private Button bt1H;
    @FXML
    private Button bt2A;
    @FXML
    private Button bt2B;
    @FXML
    private Button bt2C;
    @FXML
    private Button bt2D;
    @FXML
    private Button bt2E;
    @FXML
    private Button bt2F;
    @FXML
    private Button bt2G;
    @FXML
    private Button bt2H;
    @FXML
    private Button bt3A;
    @FXML
    private Button bt3B;
    @FXML
    private Button bt3C;
    @FXML
    private Button bt3D;
    @FXML
    private Button bt3E;
    @FXML
    private Button bt3F;
    @FXML
    private Button bt3G;
    @FXML
    private Button bt3H;
    @FXML
    private Button bt4A;
    @FXML
    private Button bt4B;
    @FXML
    private Button bt4C;
    @FXML
    private Button bt4D;
    @FXML
    private Button bt4E;
    @FXML
    private Button bt4F;
    @FXML
    private Button bt4G;
    @FXML
    private Button bt4H;
    @FXML
    private Button bt5A;
    @FXML
    private Button bt5B;
    @FXML
    private Button bt5C;
    @FXML
    private Button bt5D;
    @FXML
    private Button bt5E;
    @FXML
    private Button bt5F;
    @FXML
    private Button bt5G;
    @FXML
    private Button bt5H;
    @FXML
    private Button bt6A;
    @FXML
    private Button bt6B;
    @FXML
    private Button bt6C;
    @FXML
    private Button bt6D;
    @FXML
    private Button bt6E;
    @FXML
    private Button bt6F;
    @FXML
    private Button bt6G;
    @FXML
    private Button bt6H;
    @FXML
    private Button bt7A;
    @FXML
    private Button bt7B;
    @FXML
    private Button bt7C;
    @FXML
    private Button bt7D;
    @FXML
    private Button bt7E;
    @FXML
    private Button bt7F;
    @FXML
    private Button bt7G;
    @FXML
    private Button bt7H;
    @FXML
    private Button bt8A;
    @FXML
    private Button bt8B;
    @FXML
    private Button bt8C;
    @FXML
    private Button bt8D;
    @FXML
    private Button bt8E;
    @FXML
    private Button bt8F;
    @FXML
    private Button bt8G;
    @FXML
    private Button bt8H;
    @FXML
    private Label lbJugador;

    // -------------- Fichas Blancas ------------------------------------
    private final Image PeonB = new Image(getClass().getResourceAsStream("Fichas_Blancas/wp.gif"));
    private final Image TorreB = new Image(getClass().getResourceAsStream("Fichas_Blancas/wr.gif"));
    private Image CaballoB = new Image(getClass().getResourceAsStream("Fichas_Blancas/wn.gif"));
    private Image ArfilB = new Image(getClass().getResourceAsStream("Fichas_Blancas/wb.gif"));
    private Image ReinaB = new Image(getClass().getResourceAsStream("Fichas_Blancas/wq.gif"));
    private Image ReyB = new Image(getClass().getResourceAsStream("Fichas_Blancas/wk.gif"));

    // -------------- Fichas Negras ------------------------------------
    private final Image PeonN = new Image(getClass().getResourceAsStream("Fichas_Negras/bp.gif"));
    private final Image TorreN = new Image(getClass().getResourceAsStream("Fichas_Negras/br.gif"));
    private Image CaballoN = new Image(getClass().getResourceAsStream("Fichas_Negras/bn.gif"));
    private Image ArfilN = new Image(getClass().getResourceAsStream("Fichas_Negras/bb.gif"));
    private Image ReinaN = new Image(getClass().getResourceAsStream("Fichas_Negras/bq.gif"));
    private Image ReyN = new Image(getClass().getResourceAsStream("Fichas_Negras/bk.gif"));
    private ActionEvent actionEvent;

    //// Matriz de 8 x 8
    public boolean[][] bandera = new boolean[8][8];
    public int [][] Juego_Actual = new int[8][8];
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
        //FICHAS BLANCAS
        //Peones 
        Juego_Actual[1][0]=1;
        Juego_Actual[1][1]=1;
        Juego_Actual[1][2]=1;
        Juego_Actual[1][3]=1;
        Juego_Actual[1][4]=1;
        Juego_Actual[1][5]=1;
        Juego_Actual[1][6]=1;
        Juego_Actual[1][7]=1;
        //Torres
        Juego_Actual[0][0]=2;
        Juego_Actual[0][7]=2;
        //Caballos
        Juego_Actual[0][1]=3;
        Juego_Actual[0][6]=3;
        //Arfiles
        Juego_Actual[0][2]=4;
        Juego_Actual[0][5]=4;
        //Reina
        Juego_Actual[0][3]=5;
        //Rey 
        Juego_Actual[0][4]=6;
        
        
        //FICHAS BLANCAS
        //Peones 
        Juego_Actual[6][0]=7;
        Juego_Actual[6][1]=7;
        Juego_Actual[6][2]=7;
        Juego_Actual[6][3]=7;
        Juego_Actual[6][4]=7;
        Juego_Actual[6][5]=7;
        Juego_Actual[6][6]=7;
        Juego_Actual[6][7]=7;
        //Torres
        Juego_Actual[7][0]=8;
        Juego_Actual[7][7]=8;
        //Caballos
        Juego_Actual[7][1]=9;
        Juego_Actual[7][6]=9;
        //Arfiles
        Juego_Actual[7][2]=10;
        Juego_Actual[7][5]=10;
        //Reina
        Juego_Actual[7][3]=11;
        //Rey 
        Juego_Actual[7][4]=12;
        //Campos Vacios
        for(int i=0;i>=7;i++){
            for(int j=2;i>=5;j++){
                Juego_Actual[i][j]=0;
            }
        }
        Juego_Actual[2][1]=11;
        
        /// Negras
        //ActionEvent actionEvent = new ActionEvent();

        bt8A.setGraphic(new ImageView(TorreN));
        bt8B.setGraphic(new ImageView(CaballoN));
        bt8C.setGraphic(new ImageView(ArfilN));
        bt8D.setGraphic(new ImageView(ReinaN));
        bt8E.setGraphic(new ImageView(ReyN));
        bt8F.setGraphic(new ImageView(ArfilN));
        bt8G.setGraphic(new ImageView(CaballoN));
        bt8H.setGraphic(new ImageView(TorreN));

        bt7A.setGraphic(new ImageView(PeonN));
        bt7B.setGraphic(new ImageView(PeonN));
        bt7C.setGraphic(new ImageView(PeonN));
        bt7D.setGraphic(new ImageView(PeonN));
        bt7E.setGraphic(new ImageView(PeonN));
        bt7F.setGraphic(new ImageView(PeonN));
        bt7G.setGraphic(new ImageView(PeonN));
        bt7H.setGraphic(new ImageView(PeonN));

        //// Blancas
        bt1A.setGraphic(new ImageView(TorreB));
        bt1B.setGraphic(new ImageView(CaballoB));
        bt1C.setGraphic(new ImageView(ArfilB));
        bt1D.setGraphic(new ImageView(ReinaB));
        bt1E.setGraphic(new ImageView(ReyB));
        bt1F.setGraphic(new ImageView(ArfilB));
        bt1G.setGraphic(new ImageView(CaballoB));
        bt1H.setGraphic(new ImageView(TorreB));

        bt2A.setGraphic(new ImageView(PeonB));
        bt2B.setGraphic(new ImageView(PeonB));
        bt2C.setGraphic(new ImageView(PeonB));
        bt2D.setGraphic(new ImageView(PeonB));
        bt2E.setGraphic(new ImageView(PeonB));
        bt2F.setGraphic(new ImageView(PeonB));
        bt2G.setGraphic(new ImageView(PeonB));
        bt2H.setGraphic(new ImageView(PeonB));

    }

    @FXML
    private void btSiguienteTurno(ActionEvent event) {
    }

    @FXML
    private void btVolver(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Stage stage = new Stage();
        stage.getIcons().addAll(new Image(Menu.class.getResourceAsStream("icon_ajedrez.png")));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("!!Menu - Ajedrez!!");
        stage.show();
    }

    @FXML
    private void btSalirJuego(ActionEvent event) {
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void bt1A(ActionEvent event) {

    }

    @FXML
    private void bt1B(ActionEvent event) {
    }

    @FXML
    private void bt1C(ActionEvent event) {
    }

    @FXML
    private void bt1D(ActionEvent event) {
    }

    @FXML
    private void bt1E(ActionEvent event) {
    }

    @FXML
    private void bt1F(ActionEvent event) {
    }

    @FXML
    private void bt1G(ActionEvent event) {
    }

    @FXML
    private void bt1H(ActionEvent event) {
    }

    @FXML
    private void bt2A(ActionEvent event) {
        //bt2A.setGraphic(null);
        //bt4A.setGraphic(new ImageView(PeonB));
       Peon p = new Peon();
       boolean[][] PosiblesJugadas = p.posiblePosicionPeon(1, 0, Juego_Actual);
       if(PosiblesJugadas[2][1]==true){
           bt3B.setEffect(new SepiaTone());
       }
        //bt3A.setEffect(new SepiaTone());
        //bt4A.setEffect(new SepiaTone());

        /*bt3A.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                bt3A.setGraphic(new ImageView(PeonB)); // pone la imagen
                bt2A.setGraphic(null);// quita la imagen
                bt3A.setEffect(null);// quita el efecto
                bt4A.setEffect(null);// quita el efecto
                bandera[3][0] = true;
            }
        });
        if (bandera[3][0] = false) {
            bt4A.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent t) {
                    bt4A.setGraphic(new ImageView(PeonB)); // pone la imagen    
                    bt2A.setGraphic(null); // quita la imagen 
                    bt3A.setEffect(null); // quita el efecto
                    bt4A.setEffect(null);// quita el efecto
                    bandera[2][0] = true;
                    bandera[1][0] = true;
                    bt3A.setDisable(true);
                }
            });
        }
        if (bandera[2][0] = false) {
            bt3A.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent t) {
                    bt3A.setGraphic(new ImageView(PeonB)); // pone la imagen
                    bt2A.setGraphic(null);// quita la imagen
                    bt3A.setEffect(null);// quita el efecto
                    bt4A.setEffect(null);// quita el efecto
                    bandera[3][0] = true;
                    bt4A.setDisable(true);
                }
            });
        }
        bt2A.setDisable(true);*/

    }

    @FXML
    private void bt2B(ActionEvent event) {
        bt3B.setEffect(new SepiaTone());
        bt4B.setEffect(new SepiaTone());

        bt3B.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                bt3B.setGraphic(new ImageView(PeonB));
                bt2B.setGraphic(null);
                bt4B.setGraphic(null);
                bt2B.setEffect(null);
                bt4B.setEffect(null);
                bandera[2][1] = true;

            }
        });

        if (bandera[2][1] = false) {
            bt4B.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent t) {
                    bt4B.setGraphic(new ImageView(PeonB));
                    bt2B.setGraphic(null);
                    bt3B.setGraphic(null);
                    bt2B.setEffect(null);
                    bt3B.setEffect(null);

                }
            });
        }
    }

    @FXML
    private void bt2C(ActionEvent event) {
        bt3C.setEffect(new SepiaTone());
        bt4C.setEffect(new SepiaTone());
    }

    @FXML
    private void bt2D(ActionEvent event) {
        bt3D.setEffect(new SepiaTone());
        bt4D.setEffect(new SepiaTone());
    }

    @FXML
    private void bt2E(ActionEvent event) {
        bt3E.setEffect(new SepiaTone());
        bt4E.setEffect(new SepiaTone());
    }

    @FXML
    private void bt2F(ActionEvent event) {
        bt3F.setEffect(new SepiaTone());
        bt4F.setEffect(new SepiaTone());
    }

    @FXML
    private void bt2G(ActionEvent event) {
        bt3G.setEffect(new SepiaTone());
        bt4G.setEffect(new SepiaTone());
    }

    @FXML
    private void bt2H(ActionEvent event) {
        bt3H.setEffect(new SepiaTone());
        bt4H.setEffect(new SepiaTone());
    }

    @FXML
    private void bt3A(ActionEvent event) {
    }

    @FXML
    private void bt3B(ActionEvent event) {
    }

    @FXML
    private void bt3C(ActionEvent event) {
    }

    @FXML
    private void bt3D(ActionEvent event) {
    }

    @FXML
    private void bt3E(ActionEvent event) {
    }

    @FXML
    private void bt3F(ActionEvent event) {
    }

    @FXML
    private void bt3G(ActionEvent event) {
    }

    @FXML
    private void bt3H(ActionEvent event) {
    }

    //Boolean Bo_bt4A = bt4A(actionEvent);
    @FXML
    private void bt4A(ActionEvent event) {

    }

    @FXML
    private void bt4B(ActionEvent event) {
    }

    @FXML
    private void bt4C(ActionEvent event) {
    }

    @FXML
    private void bt4D(ActionEvent event) {
    }

    @FXML
    private void bt4E(ActionEvent event) {
    }

    @FXML
    private void bt4F(ActionEvent event) {
    }

    @FXML
    private void bt4G(ActionEvent event) {
    }

    @FXML
    private void bt4H(ActionEvent event) {
    }

    @FXML
    private void bt5A(ActionEvent event) {
    }

    @FXML
    private void bt5B(ActionEvent event) {
    }

    @FXML
    private void bt5C(ActionEvent event) {
    }

    @FXML
    private void bt5D(ActionEvent event) {
    }

    @FXML
    private void bt5E(ActionEvent event) {
    }

    @FXML
    private void bt5F(ActionEvent event) {
    }

    @FXML
    private void bt5G(ActionEvent event) {
    }

    @FXML
    private void bt5H(ActionEvent event) {
    }

    @FXML
    private void bt6A(ActionEvent event) {
    }

    @FXML
    private void bt6B(ActionEvent event) {
    }

    @FXML
    private void bt6C(ActionEvent event) {
    }

    @FXML
    private void bt6D(ActionEvent event) {
    }

    @FXML
    private void bt6E(ActionEvent event) {
    }

    @FXML
    private void bt6F(ActionEvent event) {
    }

    @FXML
    private void bt6G(ActionEvent event) {
    }

    @FXML
    private void bt6H(ActionEvent event) {
    }

    @FXML
    private void bt7A(ActionEvent event) {
        bt6A.setEffect(new SepiaTone());
        bt5A.setEffect(new SepiaTone());
    }

    @FXML
    private void bt7B(ActionEvent event) {
        bt6B.setEffect(new SepiaTone());
        bt5B.setEffect(new SepiaTone());
    }

    @FXML
    private void bt7C(ActionEvent event) {
        bt6C.setEffect(new SepiaTone());
        bt5C.setEffect(new SepiaTone());
    }

    @FXML
    private void bt7D(ActionEvent event) {
        bt6D.setEffect(new SepiaTone());
        bt5D.setEffect(new SepiaTone());
    }

    @FXML
    private void bt7E(ActionEvent event) {
        bt6E.setEffect(new SepiaTone());
        bt5E.setEffect(new SepiaTone());
    }

    @FXML
    private void bt7F(ActionEvent event) {
        bt6F.setEffect(new SepiaTone());
        bt5F.setEffect(new SepiaTone());
    }

    @FXML
    private void bt7G(ActionEvent event) {
        bt6G.setEffect(new SepiaTone());
        bt5G.setEffect(new SepiaTone());
    }

    @FXML
    private void bt7H(ActionEvent event) {
        bt6H.setEffect(new SepiaTone());
        bt5H.setEffect(new SepiaTone());
    }

    @FXML
    private void bt8A(ActionEvent event) {
    }

    @FXML
    private void bt8B(ActionEvent event) {
    }

    @FXML
    private void bt8C(ActionEvent event) {
    }

    @FXML
    private void bt8D(ActionEvent event) {
    }

    @FXML
    private void bt8E(ActionEvent event) {
    }

    @FXML
    private void bt8F(ActionEvent event) {
    }

    @FXML
    private void bt8G(ActionEvent event) {
    }

    @FXML
    private void bt8H(ActionEvent event) {
    }

}
