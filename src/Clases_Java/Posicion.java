package Clases_Java;



// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.40E9411D-A6D4-9CF7-7B9A-6442486E125F]
// </editor-fold> 
public abstract class Posicion  implements Piezas {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.541C6984-0EB5-BD25-6974-B319AC1995F6]
    // </editor-fold> 
    private int posicionX;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6F337EB6-81BC-2F8E-DB2E-CF4F26623F03]
    // </editor-fold> 
    private int posicionY;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5B2B18CF-ED04-5DBC-3501-50CD535FE0D8]
    // </editor-fold> 
    private String Color;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9D863787-E258-FE49-71F8-FA651F6ADEA2]
    // </editor-fold> 
    public Posicion () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BE0FC168-E66D-73BE-38BE-1774AC5E9731]
    // </editor-fold> 
    public void Colocar_Pieza () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1477E4EF-3466-7D86-C241-FB21CB00357F]
    // </editor-fold> 
    public String getColor () {
        return Color;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E4FE5052-A886-4245-3D82-52A0D53D4FC3]
    // </editor-fold> 
    public void setColor (String val) {
        this.Color = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.23E0A2D8-95E8-3FC9-C540-10DD78C8B01A]
    // </editor-fold> 
    public int getPosicionX () {
        return posicionX;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FB3474E6-D49E-DC17-C25C-2169600D12FC]
    // </editor-fold> 
    public void setPosicionX (int val) {
        this.posicionX = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.566E7A0F-C6FF-8EDA-0E45-141C8FCA4F12]
    // </editor-fold> 
    public int getPosicionY () {
        return posicionY;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A0B22F00-D8A2-B902-B961-9AC66E5C8AF2]
    // </editor-fold> 
    public void setPosicionY (int val) {
        this.posicionY = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.89F5DD37-DBF6-55F2-7046-663FCF437FB3]
    // </editor-fold> 
    public void Mover () {
    }

}

