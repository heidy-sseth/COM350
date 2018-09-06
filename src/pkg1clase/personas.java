
package pkg1clase;

import java.util.ArrayList;

public class personas {
    private String ci;
    private String nombre;
    private String appaterno;
    private String apmaterno;
    private String fechan;
    private String lugarn;
   ArrayList<personas>  perso=new ArrayList<personas>();

personas(String ci, String nombre, String appaterno,String apmaterno,String fechan,String lugarn){
this.ci=ci;
this.nombre=nombre;
this.appaterno=appaterno;
this.apmaterno=apmaterno;
this.fechan=fechan;
this.lugarn=lugarn;
}

personas(){
}

String getci(){
    return this.ci;
}

String getnombre(){
    return this.nombre;
}

String getapp(){
    return this.appaterno;
}

String getapm(){
    return this.apmaterno;
}

String getfechan(){
    return this.fechan;
}

String getlugarn(){
    return this.lugarn;
}
void insertar(personas pe){
    perso.add(pe);
}
personas buscar(String ci){
    personas res=new personas("NaN","NaN","NaN","NaN","NaN","NaN");
    for(personas per:perso){
        if(per.getci().equals(ci)){
            res=per;
        }
    }
    return res;
}

void eliminar(String ci){
    personas res=buscar(ci);
    perso.remove(res);
}

void editar(personas ed){
    personas res=buscar(ed.getci());
    res.nombre=ed.getnombre();
    res.appaterno=ed.getapp();
    res.apmaterno=ed.getapm();
    res.fechan=ed.getfechan();
    res.lugarn=ed.getlugarn();
}

}
