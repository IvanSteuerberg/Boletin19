package boletin19;

import javax.swing.JOptionPane;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Boletin19 {

    public static void main(String[] args) {
int[][]goles=new int[20][36];
Metodos obx = new Metodos();
String[]equipos={"VCF","ATM","MLL","ALV","BAR","GTF","VIL","LUD","GRA","VLL","SFC","ESP","LEG","RBB",
"EIB","RSO","ATH","OSA","RMA","CEL"};
obx.ordenarGolesEquipos(equipos);
String[]equiposOrdenados={"VCF","ATM","MLL","ALV","BAR","GTF","VIL","LUD","GRA","VLL","SFC","ESP","LEG","RBB",
"EIB","RSO","ATH","OSA","RMA","CEL"};
String[]xornadas=new String[36];
xornadas=obx.crearXornadas(xornadas);
int opcion;
do{
opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1--> crear matriz"
+"\n2--> amosar \n3--> amosar todo\n4-->Media Alumnos\n5-->Media Modulos \n6--> Sair \n Teclea a opcion"));
switch(opcion){
 case 1:
    goles= obx.crearMatriz(goles);
    break;
 case 2:
    obx.amosar(goles);
    break;
 case 3:
     obx.amosarTodo(goles,equipos,xornadas);
     break;
 case 4:
     obx.ordencrecenteArrays(goles,equiposOrdenados);
     break;
 case 5:

     break;
 case 6:
    obx.sair();
 }
}while(opcion<6);
        
}
    
}