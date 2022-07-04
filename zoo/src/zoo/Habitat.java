package zoo;

import java.util.*;
import java.util.List;

public class Habitat extends Animals{

    Habitat(String nombre, String habitat, String descripcion) {
        super(nombre, habitat, descripcion);
        Animals paloma = new Animals("paloma","Aves","descripcion paloma");
        Animals aguila = new Animals("Aguila", "Aves", "descripcion aguila");
        Animals canario = new Animals("Aguila", "Aves", "descripcion canario");
        Animals globo = new Animals("Pez Globo", "Peces", "descripcion Pez Globo");
        Animals payaso = new Animals("Pez Payaso", "Peces", "descripcion Pez Payaso");
        Animals dorado = new Animals("Pez Dorado", "Peces", "descripcion Pez Dorado");
        ArrayList<Animals> list = new ArrayList<>();
        list.add(paloma);
        list.add(aguila);
        list.add(canario);
        list.add(globo);
        list.add(payaso);
        list.add(dorado);
    }

    static void Lista_habitat( ArrayList list ) {

        for( int i = 0; i < list.size(); i++ ){
            //validacion de la propiedad habitat
            //guardarse en un nuevo array e imprimir
        }
    }



}
