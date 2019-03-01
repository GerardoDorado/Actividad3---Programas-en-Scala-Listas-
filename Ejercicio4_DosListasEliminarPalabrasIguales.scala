import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object Ejercicio4_DosListasEliminarPalabrasIguales {
  def main(args: Array[String]): Unit = {
    crearListas()
  }
  
  def crearListas():Unit={
    println("Ingresa el tamaño deseado de la primer lista: ")
    var numero = readInt()
    
    println("Primer Lista")
    var palabras=crearListaDinamica(numero)
    
    println("----------------------------------------------")
    println("Ingresa el tamaño deseado de la segunda lista: ")
    var numero2 = readInt()
    
    println("Segunda Lista")
    var palabras2=crearListaDinamica(numero2)
    
    println("-----------------")
    println("Lista original #1")
    mostrarLista(palabras)
    
    println("-----------------")
    println("Lista original #2")
    mostrarLista(palabras2)
    
    eliminarPalabrasRepetidas(palabras, palabras2)
  }
  
  def crearListaDinamica(numero:Int):ListBuffer[String]={
    var palabras=new ListBuffer[String]()
    var x=numero
    
    while(x!=0){
      println("Ingresa una palabra: ")
      palabras+=readLine()
      
      x-=1
    }
    
    palabras
  }
  
  def eliminarPalabrasRepetidas(palabras:ListBuffer[String], palabras2:ListBuffer[String]):Unit={
    var bandera=false
    var contador=0
    
    for(e<-palabras){
      var bandera1=false
      for(e1<-palabras2 if e1.equals(e)){
        bandera1=true
        bandera=true
      }
      
      if(bandera1!=false){
        palabras.remove(contador)  
      }
      
      contador+=1
    }
    
    if(bandera!=false){
      println("----------------------------")
      println("Lista Modificada")
      mostrarLista(palabras)
    }else{
      println("--------------------------------------------------------")
      println("¡Lo sentimos no se encontraron palabras que considieran con las palabras de la segunda lista!")
      mostrarLista(palabras)
    }
  }
  
  def mostrarLista(palabras:ListBuffer[String]):Unit={
    palabras.foreach(println)
  }
}