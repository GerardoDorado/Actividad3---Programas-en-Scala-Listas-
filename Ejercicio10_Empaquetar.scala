
import scala.collection.mutable.ListBuffer

object Ejercicio10_Empaquetar {
  def main(args: Array[String]): Unit = {
    var palabraRepetida=ListBuffer[String]("magia","magia","luz","programacion","funcional","magia","funcional")
    
    var listaFinal=empaquetar(palabraRepetida)
    
    for(e<-listaFinal){
      for(x<-e){
        print(x+" ")
      }
      println()
    }
  }
  
  def empaquetar(lista:ListBuffer[String]):ListBuffer[ListBuffer[String]]={
    var listaFinal=ListBuffer[ListBuffer[String]]()
    var listaX=ListBuffer[String]()
    
    for(e<-lista){
      if(!listaX.isEmpty){
        var bandera=false
        var contador=0;
        
        for(e1<-listaX if e.equals(e1)){
          bandera=true  
        }
        
        if(bandera==false){
          for(e2<-lista if e.equals(e2)){
            contador+=1
          }
          listaX+=e
          listaFinal+=ListBuffer[String](e, contador+"")
        }
      }else{
        var contador=0
        listaX+=e
        for(e2<-lista if e.equals(e2)){
            contador+=1
        }
        
        listaFinal+=ListBuffer[String](e, contador+"")
      }
      
    }
    
    listaFinal
  }
}