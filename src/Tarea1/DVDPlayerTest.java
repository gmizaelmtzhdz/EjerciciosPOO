package Tarea1;

class  DVDPlayer  {  

//  variables  de  instancia  

private  boolean  play  =  false;  
//Comentario: definir la variable de instancia 'record'
private boolean record = false;

//constructor que recibe como parámetro un String 
public DVDPlayer(String parametro)
{
    System.out.println("parámetro recibido desde el constructor: "+parametro);
}
//  metodo  recordDVD  

public  void  recordDVD()  {  
    
    //Comentario: le faltaba el punto y coma
    System.out.println("DVD recording");

}  
//Comentario: crearle métodos 'get/set' para la variable de instancia
public boolean isPlay() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public boolean isRecord() {
        return record;
    }

    public void setRecord(boolean record) {
        this.record = record;
    }

    //Comentario: falta crearle el método público 'playDVD()'
    public void playDVD()
    {
        System.out.println("dentro del método playDVD()");
    }
}  

public  class  DVDPlayerTest  {  

public  static  void  main  (String  args[])  {  
        System.out.println("TAREA #1: Programación Orientada a Objetos");
        //Comentario: falta crearle un constructor a la clase 'DVDPlayer' que reciba como parámetro un String
        DVDPlayer  d  =  new  DVDPlayer("Samsung");  
        
        
        //Comentario: mandar llamar al método 'setRecord()'
        //d.record  =  true;  
        d.setRecord(true);
        
        
        //Comentario: mandar llamar al método 'isRecord()'
        //if  (d.record  ==  true)  {  
        if(d.isRecord()==true){
               d.recordDVD(); 
        
        //Comentario: mandar llamar al método 'isPlay()'
        //}  else  if (d.play ==  true)  {  
        }  else  if (d.isPlay() ==  true)  {  
               d.playDVD(); 
        }  
}  

}