import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object Ejercicio6_FuncionNumeros {
  def main(args: Array[String]): Unit = {
    var lista = ListBuffer[Int](1, 2, 3, 4, 5)
    
    println(lista)
    println(sumaAcumulada(lista))
  }
  
  def sumaAcumulada(lista:ListBuffer[Int]):ListBuffer[Int]={
    var listaNueva=ListBuffer[Int]()
    var suma=0
    
    for(e<-lista){
      suma+=e
      listaNueva+=suma
    }
    
    listaNueva
  }
}