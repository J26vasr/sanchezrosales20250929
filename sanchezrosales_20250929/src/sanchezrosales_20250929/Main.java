
package sanchezrosales_20250929;


public class Main {

    
    public static void main(String[] args) {
        //INSTANCIAS LA VARIABLE (REFERENCIA O PUNTERO)
        BusquedaBinaria buscar = new BusquedaBinaria();
        //SE ESTABLECE UN ARREGLO UNIDIMENSIONAL
        int[] arreglo = {17,19,21,23,25,27,29,31};
        
         int[][] matriz ={
        
            {  1,  3,  5},
            {  7,  9,  11},
            {  13, 15, 17}
        };
         
         
        //SE ESTABLECE UN VALOR A BUSCAR
        int a_buscar = 28;
        //SE IMPLEMENTA EL METODO CORRESPONDIENTE A LA BUSQUEDA DE VALORES EN
        //ARREGLOS UNIDIMENSIONALES  YMEDIANTE LA JHERENCIA SE REALIZA
        // LA EJECUCUION DEL METODO buscarEnteroArray, ENVIANDO LOS PARAMETROS NECESARIOS
        int posicion = buscar.buscarEnteroArray(arreglo, a_buscar);
        
        //SE EVALUA EL RESULTADO DEVUELTO POR EL METODO
        if(posicion != -1){
            //SE ENCONTRO EL VALOR
            System.out.println("El valor: "+a_buscar+" esta en la posicion: "+posicion);
    
    
        }
        else{
        //NO SE ENCONTRO EL VALOR  
            System.out.println("No se encontro el valor de "+a_buscar);
        }
       buscar.buscarEnterosMatriz(matriz, a_buscar);
    }
    
}
