package boletin19;

import java.util.Arrays;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Metodos{

public int[][] crearMatriz(int[][] taboa){
    for (int f=0;f<taboa.length;f++){
      for(int c=0;c<taboa[f].length;c++){
      taboa[f][c]=(int)(Math.random()*3);
      }    
    }
    System.out.println("Array Creado");    
return taboa;
}
public String[] crearXornadas(String[]xornadas){
for(int i=0;i<xornadas.length;i++){
xornadas[i]="x"+(i+1);    
}
return xornadas;    
}

public void amosar(int[][]taboa){
for (int f=0;f<taboa.length;f++){
    System.out.println("\n");
      for(int c=0;c<taboa[f].length;c++){
          System.out.print(taboa[f][c]+"  ");
      }    
    }
}

public void amosarTodo(int[][]taboa,String[]equipos,String[]xornadas){
    System.out.print("\n  ");
    for(int i=0;i<xornadas.length;i++){
     if(i<10)   
    System.out.print("   "+xornadas[i]);    
    else
    System.out.print("  "+xornadas[i]);      
    }
  for (int f=0;f<taboa.length;f++){
    System.out.print("\n "+equipos[f]);
      for(int c=0;c<taboa[f].length;c++){
          System.out.print("  "+taboa[f][c]+"  ");
      }    
    }
    
}

public void sair(){
System.exit(0);
}

public void ordencrecenteArrays(int[][]taboa,String[]equiposOrdenados){
int[]totalGoles= new int[taboa.length];
 for (int f=0;f<taboa.length;f++){
      for(int c=0;c<taboa[f].length;c++){
         totalGoles[f]=totalGoles[f]+taboa[f][c];  
         
      }
      
    }
 
int aux;
String auxEqu;
for (int i=0;i<totalGoles.length-1;i++){
    for(int j=i+1;j<equiposOrdenados.length;j++){
    if(totalGoles[i]>totalGoles[j]){
    aux = totalGoles[i];
    totalGoles[i]=totalGoles[j];
    totalGoles[j]=aux;
    auxEqu = equiposOrdenados[i];
    equiposOrdenados[i]=equiposOrdenados[j];
    equiposOrdenados[j]=auxEqu;
    }
    }    
}
    System.out.println("\n\nTotal de goles marcados en orde ascendente:");   
for (int j=0;j<equiposOrdenados.length;j++){
    System.out.println(equiposOrdenados[j]+"  "+totalGoles[j]);    
}


}

public void ordenarGolesEquipos(String[] equipos){
Arrays.sort(equipos);
}

public void maximoGoleadorXornada(int[][]taboa,String[]xornadas,String[]equipos){
for(int i=0;i<taboa.length;i++){
   for(int f=i;i<taboa.length;f++){
       
   }    
}



    
}



}