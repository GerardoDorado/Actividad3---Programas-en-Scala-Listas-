import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object Ejercicio2_sustitucionPalabras {
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
    
    modificarPalabras(palabras)
  }
  
  def modificarPalabras(palabras:ListBuffer[String]):Unit={
    var contador=0
    var posicion=0
    var bandera=false
    
    println("----------------------------")
    println("Ingresa la palabra a cambiar de la lista: ")
    var palabraBuscar=readLine()
    
    println("Ingresa la palabra a sustituir")
    var palabraSustituta=readLine()
    
    for(e<-palabras){
      if (e.equals(palabraBuscar)){
        bandera=true
        posicion=contador
      }
      
      contador+=1
    }
    
    if(bandera!=false){
      palabras.update(posicion, palabraSustituta)
      println("----------------------------")
      println("Lista Modificada")
      mostrarLista(palabras)
    }else{
      println("¡Lo sentimos esta palabra "+palabraBuscar+" no se encuentra!")
    }
  }
  
  def mostrarLista(palabras:ListBuffer[String]):Unit={
    palabras.foreach(println)
  }
}