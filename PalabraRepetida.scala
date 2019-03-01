import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object PalabraRepetida {
  def main(args: Array[String]): Unit = {
    crearLista()
  }
  
  def crearLista():Unit={
    println("Ingresa el tamaño deseado de la lista: ")
    var numero = readInt()
    
    var palabras=new ListBuffer[String]()
    
    while(numero!=0){
      println("Ingresa una palabra: ")
      palabras+=readLine()
      
      numero-=1
    }
    
    print(buscarPalabras(palabras)+" veces")
  }
  
  def buscarPalabras(palabras:ListBuffer[String]):Int={
    var contador=0
    
    println("----------------------------")
    println("Ingresa la palabra a buscar: ")
    var palabraBuscar=readLine()
    
    for(e<-palabras if e.equals(palabraBuscar)){
      contador+=1
    }
    
    print("La palabra "+palabraBuscar+" se encuentra: ")
    
    return contador
  }
}