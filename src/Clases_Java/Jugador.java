package Clases_Java;



// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.6C7F1B97-D1B7-A933-1823-1204D4D2B5F1]
// </editor-fold> 
public class Jugador {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.28E83134-B04F-DC22-3264-BF8BEF7409B5]
    // </editor-fold> 
    public int ID;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8EC15177-237A-B50F-6210-04A3876315B8]
    // </editor-fold> 
    public String Nombre;
    
    public String Apellido;
    
    public int Edad;
    
    public String Carrera;



    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.892F2935-1599-8930-C561-828CB2C93E99]
    // </editor-fold> 
    public void Mover_Ficha () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AB2526BA-7E5A-F4C5-9FCF-6BC7E041E4D1]
    // </editor-fold> 
    public void Finalizar_Jugada () {
        System.out.println("Es: "+this.ID);
    }

    public Jugador(int idUsuarios, String Nombre, String Apellido, int Edad, String Carrera) {
        this.ID = idUsuarios;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Carrera =Carrera; 

    }

}

