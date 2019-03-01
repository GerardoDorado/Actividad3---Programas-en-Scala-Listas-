import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object Ejercicio3_EliminarPalabra {
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
    
    println("Lista original")
    mostrarLista(palabras)
    
    eliminarPalabras(palabras)
  }
  
  def eliminarPalabras(palabras:ListBuffer[String]):Unit={
    var bandera=false
    var contador=0
    var posicion=0
    
    println("----------------------------")
    println("Ingresa la palabra a cambiar de la lista: ")
    var palabraEliminar=readLine()
    
    for(e<-palabras){
      if (e.equals(palabraEliminar)){
        posicion=contador
        bandera=true
      }
      
      contador+=1
    }
    
    if(bandera!=false){
      palabras.remove(posicion)
      println("----------------------------")
      println("Lista Modificada")
      mostrarLista(palabras)
    }else{
      println("--------------------------------------------------------")
      println("¡Lo sentimos esta palabra "+palabraEliminar+" no se encuentra!")
      mostrarLista(palabras)
    }
  }
  
  def mostrarLista(palabras:ListBuffer[String]):Unit={
    palabras.foreach(println)
  }
}