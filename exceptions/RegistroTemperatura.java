package exceptions;
import java.util.ArrayList;

public class RegistroTemperatura {

    ArrayList<Integer> temperatura = new ArrayList<>();

    public void registarTemperatura(int registro) throws TemperaturaInvalidaException{
        if (registro<-30 || registro>55) {
            throw new TemperaturaInvalidaException("La temperatura es invalida.");
        }
        temperatura.add(registro);
    }

    public void verTemperatura(){
        System.out.println("Temperaturas: " + temperatura);
    }

}