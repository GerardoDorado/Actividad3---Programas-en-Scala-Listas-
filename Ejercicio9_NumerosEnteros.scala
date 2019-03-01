
import scala.collection.mutable.ListBuffer

object Ejercicio9_NumerosEnteros {
  def main(args: Array[String]): Unit = {
    var numeros=ListBuffer[Int](1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    
    println(numeros)
    println("Numeros primos: "+obtenerNumerosPrimeros(numeros))
    sumatoriaPromedio(numeros)
    println("Factorial: "+factorial(numeros))
  }
  
  def obtenerNumerosPrimeros(numeros:ListBuffer[Int]):ListBuffer[Int]={
    var listaPrimos=ListBuffer[Int]()
    
    for(e<-numeros){
      var i=2
      var bandera=false
      
      if(e!=1){
        while(i!=e){
          if(e%i==0){
            bandera=true
          }
          
          i+=1
        }  
      }
      
      if(bandera==false && e!=1){
        listaPrimos+=e
      }
    }
    
    listaPrimos
  }
  
  def sumatoriaPromedio(numeros:ListBuffer[Int]):Unit={
    println("Sumatorias de cada numero: ")
    for(e<-numeros){
      var sumatoria=0
      var i=1
      
      while(i!=e){
        sumatoria+=i
        i+=1
      }
      
      print(sumatoria+" ")
    }
    var suma=0
    numeros.foreach(suma+=_)
    
    println("\npromedio: "+suma/numeros.length)
  }
  
  def factorial(numeros:ListBuffer[Int]):ListBuffer[Long]={
    var lista=ListBuffer[Long]()
    
    for(e<-numeros){
      var factorial=1
      var i=1
      
      while(i!=e){
        factorial+=factorial*i
        i+=1
      }
      
      lista+=factorial
    }
    
    lista
  }
}