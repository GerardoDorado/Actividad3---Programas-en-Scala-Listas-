
import scala.collection.mutable.ListBuffer

object Ejercicio8_ObtenerCapicuas {
  def main(args: Array[String]): Unit = {
    var lista=ListBuffer[Int](456, 254, 22, 1234, 456, 1111, 37373, 7483, 234567)
    
    println(lista)
    println(obtenerCapicuas(lista))
  }
  
  def obtenerCapicuas(lista:ListBuffer[Int]):ListBuffer[Int]={
    var listaFinal=ListBuffer[Int]()
    
    for(e<-lista){
      var faltante=e
      var numeroInvertido=0
      var restante=0
      
      while(faltante!=0){
        restante = faltante%10;
        numeroInvertido = numeroInvertido*10+restante;
        faltante = faltante/10;        
      }
      
      if(numeroInvertido==e){
        listaFinal+=numeroInvertido
      }
    }
    
    listaFinal
  }
}