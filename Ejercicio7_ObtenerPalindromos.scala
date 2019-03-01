import scala.collection.mutable.ListBuffer
import scala.collection.mutable.StringBuilder

object Ejercicio7_ObtenerPalindromos {
  def main(args: Array[String]): Unit = {
    var lista = ListBuffer[String]("radar", "oro", "rajar", "dorado", "funcional", "rallar", "jerez", "somos", "zacatecas")
    
    println(lista)
    println(obtenerPalindromos(lista))
  }
  
  def obtenerPalindromos(lista:ListBuffer[String]):ListBuffer[String]={
    var listaPalindromos=ListBuffer[String]()
    
    for(e<-lista){
      var cadena = new StringBuilder(e)
      var cadenaComparar=cadena.reverse.toString
      
      if(e.equals(cadenaComparar)){
        listaPalindromos+=e
      }
    }
    
    listaPalindromos
  }
}