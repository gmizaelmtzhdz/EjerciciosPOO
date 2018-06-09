package Tarea2;

public class Gato extends Animal{

    @Override
    public String comer() {
        return "come croquetas cat chao";
    }

    @Override
    public String habitar() {
        return "es un animal doméstico";
    }

    @Override
    public String dormir() {
        return "un adulto duerme entre 12 y 16 horas diarias";
    }
    
}
