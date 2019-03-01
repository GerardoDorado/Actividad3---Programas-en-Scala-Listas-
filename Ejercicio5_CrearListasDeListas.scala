
import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object Ejercicio5_CrearListasDeListas {
  
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
    
    println("------------------------------------")
    println("Palabras repetidas de las dos listas")
    var palabrasRepetidas=formarListaPalabrasRepetidos(palabras, palabras2);
    mostrarLista(palabrasRepetidas)
    
    println("----------------------------------------------")
    println("Palabras que no aparecen en la segunda lista: ")
    var palabrasNoRepetidasPrimerLista=formarListaPalabrasQueNoSeRepitenLista(palabras, palabras2);
    mostrarLista(palabrasNoRepetidasPrimerLista)
    
    println("---------------------------------------------")
    println("Palabras que no aparecen en la primer lista: ")
    var palabrasNoRepetidasSegundarLista=formarListaPalabrasQueNoSeRepitenLista(palabras2, palabras);
    mostrarLista(palabrasNoRepetidasSegundarLista)
    
    println("-------------------------------------------")
    println("Palabras que aparecen en las dos listas: ")
    var palabrasCompletas=mostrarContenidoLista(palabras, palabras2);
    mostrarLista(palabrasCompletas)
  }
  
  def formarListaPalabrasQueNoSeRepitenLista(x:ListBuffer[String], y:ListBuffer[String]):ListBuffer[String]={
    var palabras=new ListBuffer[String]()
    
    for(e<-x){
      var bandera=false
      
      for(e1<-y if e.equals(e1)){
        bandera=true
      }
      
      if(bandera==false){
        palabras+=e
      }
    }
    
    return palabras
  }
  
  def mostrarContenidoLista(x:ListBuffer[String], y:ListBuffer[String]):ListBuffer[String]={
    var palabras=new ListBuffer[String]()
    
    for(e<-x){
      palabras+=e
    }
    
    for(e<-y){
      var bandera=false
      
      for(e1<-palabras if e1.equals(e)){
        bandera=true
      }
      
      if(bandera==false){
        palabras+=e
      }
    }
    
    palabras
  }
  
  def formarListaPalabrasRepetidos(x:ListBuffer[String], y:ListBuffer[String]):ListBuffer[String]={
    var palabras=new ListBuffer[String]()
    
    for(e<-x){
      for(e1<-y if e.equals(e1)){
        palabras+=e
      }  
    }
    
    return palabras
  }
  
  def crearListaDinamica(numero:Int):ListBuffer[String]={
    var palabras=new ListBuffer[String]()
    var x=numero
    
    while(x!=0){
      println("Ingresa una palabra: ")
      var palabra=readLine()
      
      if((validarLista(palabra, palabras)==false) && x!=numero){
        palabras+=palabra
      }else if(x==numero){
        palabras+=palabra
      }else{
        println("¡Por favor no ingrese palabras repetidas!")
        x+=1  
      }
      
      x-=1
    }
    
    palabras
  }
  
  def validarLista(palabra:String, palabras:ListBuffer[String]):Boolean={
    var bandera = false
    
    for(e<-palabras if e.equals(palabra)){
      bandera=true
    }
    
    return bandera
  }
  
  def mostrarLista(palabras:ListBuffer[String]):Unit={
    palabras.foreach(println)
  }
}
