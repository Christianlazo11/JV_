package POO.Basic.Ex02;

import java.util.ArrayList;

public class Cohete {

    private ArrayList <Propulsor> propulsores = new ArrayList<>();

    public Cohete(){}

    public void agregarPropulsor(Propulsor propulsor) {
        this.propulsores.add(propulsor);
        System.out.println("Propulsor agregado");
    }

    public void eliminarPropulsor(Propulsor propulsor) {
        for(int i = 0; i <  this.propulsores.size(); i++){
            if(propulsores.get(i).getNombre().equals(propulsor.getNombre())) {
                propulsores.remove(i);
                System.out.println("Elemento eliminado!!!");
                break;
            }
        }
    }

    public ArrayList<Propulsor> obtenerPropulsores() {
        return propulsores;
    }

    public void verPropulsores() {
        for(Propulsor n :  this.propulsores){
            System.out.println(n);
        }
    }

}
