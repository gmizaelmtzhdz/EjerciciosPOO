package Tarea1;
class  TapePlayer  {  

//  variables  de  instancia  

private  boolean  record  =  false;  

private  boolean  play  =  true;  

//  metodo  playTape  

public  void  playTape()  {  

       System.out.println("tape playing");
}  

//  metodo  recordTape  

public  void  recordTape()  {  

       System.out.println("tape recording");  

}  
//Comentario: rewindTape
public void rewindTape()
{
    System.out.println("tape rewindTape");
}
//Comentario: falta crear métodos 'get/set' para las variables de instancia 'record' & 'play'
    public boolean isRecord() {
        return record;
    }

    public void setRecord(boolean record) {
        this.record = record;
    }

    public boolean isPlay() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

}  

public  class  TapePlayerTest  {  //Comentario: el nombre del archivo debe ser 'TapePlayerTest.java'

public  static  void  main  (String  args[])  {  
        System.out.println("TAREA #1: Programación Orientada a Objetos");
       //Comentario: Falta declarar la variable de referencia t, del tipo 'TapePlayer'
       TapePlayer t=new TapePlayer();
       //Comentario: llamar al método setRecord(..)
       //t.record =  true;  
       t.setRecord(true);
        
        //Comentario: llamar el método isRecord()
        //if (t.record ==  true)  { 
        if(t.isRecord()==true){
               t.recordTape(); 
        //Comentario: llamar al método isPlay()
        //}  else  if (t.play ==  true)  {  
        }  else if (t.isPlay() ==  true)  {  
               t.playTape(); 

        }  else  {  
               
               //Comentario: a la clase 'TapePlayer' le falta crearle el método 'rewindTape'
               t.rewindTape(); 

        }  

}  

}