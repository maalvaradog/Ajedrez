package Clases_Java;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.87CDB9B6-C2FC-BE63-E60F-F4F51C14E0D5]
// </editor-fold> 
public class Peon {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5D206854-C877-EE31-C380-CBFDC6C86F4F]
    // </editor-fold> 
    public String Color = null;

    /*// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.57E70A42-2589-BBBF-80F9-854A8D7F9EEB]
    // </editor-fold> 
    public void Movimiento ();*/
    public boolean[][] posiblePosicionPeon(int fila, int columna, int recibeMatriz[][]) {
        boolean[][] bandera = new boolean[8][8];
        for (int i = 0; i >= 7; i++) {
            for (int j = 2; i >= 7; j++) {
                bandera[i][j] = false;
            }
        }
        if (recibeMatriz[fila][columna] == 1) {
            if (fila == 1) {
                //Revisa si las dos de adelante estan vacias
                if (recibeMatriz[2][columna] == 0) {
                    bandera[2][columna] = true;
                if (recibeMatriz[3][columna] == 0) {
                    bandera[3][columna] = true;
                }
                } 
                //revisa si las columnas diagonales estan vasias
                //revisa borde Izquierdo
                if(columna==0){
                    if(recibeMatriz[2][1]>=7&&recibeMatriz[2][1]<=12){
                          bandera[2][1] = true;
                    }
                }else if (columna==7){//revisa borde Derecho
                    if(recibeMatriz[2][6]>=7&&recibeMatriz[2][6]<=12){ // revisa si alguna ficha del otro jugador esta para matar
                          bandera[2][6] = true;
                    }
                }else{//revisa lo de la mitad
                    if(recibeMatriz[2][columna+1]>=7&&recibeMatriz[2][columna+1]<=12){// revisa si alguna ficha del otro jugador esta para matar
                          bandera[2][columna+1] = true;
                    }
                    if(recibeMatriz[2][columna-1]>=7&&recibeMatriz[2][columna-1]<=12){// revisa si alguna ficha del otro jugador esta para matar
                          bandera[2][columna-1] = true;
                    }
                }
            }
        } else if (fila == 6) {

        }
        return bandera;
    }

}
