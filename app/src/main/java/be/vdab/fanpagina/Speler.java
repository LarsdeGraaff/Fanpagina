package be.vdab.fanpagina;

import java.net.URL;

/**
 * Created by jeansmits on 4/09/15.
 */
public class Speler {
    private String Name;
    private String Position;
    private String foto;


    public Speler(String name, String position, String Foto) {
        Name = name;
        Position = position;
        foto=Foto;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
