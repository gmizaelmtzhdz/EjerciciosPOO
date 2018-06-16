package Tarea3;

public  class  Alcance  {

    //  variable  de  instancia

    private  int  i  =  1;

    //  primer  metodo

    public  void  primerMetodo()  {
        //Comentario: la variable local i, se le debe asignar un valor
        int  i=0;

        int  j  =  5;

        this.i  =  i  +  j;

       System.out.println("this.i =  "  +  this.i);

       System.out.println("i =  "  +  i);

        segundoMetodo(this.i);

}  

    //  segundo  metodo

    public  void  segundoMetodo(int  i)  {

        int  j  =  8;

        i  =  i  +  j;

       System.out.println("this.i =  "  +  this.i);

       System.out.println("i =  "  +  i);

    }  

    public  int  getVariable()  {

        return  i;

    }    
}
