package AzzahJSleepFN;

import java.util.HashMap;

public class Serializable
{
    public final int id;
    private static HashMap<Class<?>, Integer> mapCounter;

    protected Serializable (int id){
        //increment i
        this.id = id;
    }



    public int compareTo(Serializable serial){
        return this.id - serial.id;
    }


    public boolean equals(Object object){
        if(object instanceof Serializable){
            return this.id == ((Serializable)object).id;
        }
        return false;
    }


    public boolean equals(Serializable serial) {
        return this.id == serial.id;
    }


    public <T> Integer getClosingId(Class<T> class_srl){
        return mapCounter.get(class_srl);
    }

    public <T> Integer getClosingId(Class<T> kelas, int id){
        return mapCounter.put(kelas, id);
    }
}