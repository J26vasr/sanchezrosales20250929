
package sanchezrosales_20250929;

// ESTA CLASE SE CONVERTIRA EN UN OBJETO DE MEMORIA RAM EN LA COMPUTADORA
public class BusquedaBinaria {
    
    //------------------------metodo para realizar una busqueda binaria de un arreglo unidimensional--------------------
    //clase tipo de dato
    public int buscarEnteroArray(int[] arreglo, int valorBuscado){
        
        //SE DECLARAN VARIABLES DE INICIO Y FIN
        int inicio = 0;
        int fin = arreglo.length;
        
        
        //SE REALIZA LA EJECUCUION DE BUSQUEDA MIENTRAS EL ARREGLO TENGA AL MENOS UN ELEMENTO
        //al menos un valor exista en la regla
        while(inicio <= fin){
        
            
            //SE OBTIENE LA POSICION DEL CENTRO DEL ARREGLO
            int medio = (inicio + fin)/2;
            //posicion encontrada
            
            //SE EVALUA SI EL ELEMENTO EN LA POSICION MEDIA ES IGUAL AL VALOR BUSCADO
            if(arreglo[medio] == valorBuscado){
            
                return medio;
            }
            else if(arreglo[medio]< valorBuscado){
            
                //SE EVALUA SI EL ELEMENTO EN LA POSICION MEDIA ES MENOR QUE EL VALOR BUSCADO
                inicio = medio + 1;
            }
            else{
            
                //SE DEDUCE QUE EL ELEMENTO ES MAYOR, POR LO TANTO EL FIN CAMBIA
                fin = medio -1;
            }
        }
    //SE DEVUELVE -1 CUANDO NO HAY VALORES ENCONTRADOS 
        return -1;
    }
    
    //METODO PARA BUSCAR UN VALOR EN UNA MATRIZ
    public void buscarEnterosMatriz(int[][]matriz, int objetivo){

        //se declaran las filas y las columnas para conocer la dimension de la matriz
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        //se establece el inicio y el fin de la matriz
        int inicio = 0;
        //cantidad total de elementos en la matriz
        int fin = (filas * columnas)-1;
        
        //bandera que indica si el valor fue encontrado o no en la matriz
        boolean encontrado = false;
        
        //se realiza una repeticion mientras la matriz posea al menos un elemento
        while(inicio <=fin){
        
            //se deduce el punto medio de la matriz
            int medio = (inicio + fin)/2;
            //se simula el arreglo bidimensional como un arreglo unidimensional
            int f = medio/columnas;// ¿cual fila es? (cuantas filas completas existen antes del punto medio)
            int c = medio % columnas;//¿cual columna es? (posicion exacta de la columna)
            
            //se  evalua si el valor buscado se encuentra en la posicion media
            if(matriz[f][c] == objetivo){
            
                System.out.println("En la matriz, el elemento encontrado esta en la posicion ["+f+"]["+ c +"]");
                
                //se establece la bandera como verdadera debido a que se encontro el valor buscado
                encontrado = true;
                
                break;
            }else if(matriz[0][c] < objetivo){
                //se evalua si si el valor del punto medio es menor que el valor buscado
            
                inicio = medio +1;
            }else{
            
                //entonces el valor del punto medio encontrado es mayor
                fin = medio -1;
            }
            
        }
        //se evalua la bandera por si a caso no se encontro ningun valor
        if(encontrado == false){
        //se imprime la salida en consola
            System.out.println("El elemento buscado no ha sido encontrado en la matriz");
        }

    }//fin del metodo buscarEnterosMatriz
}


