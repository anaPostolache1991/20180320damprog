package examen.ejercicio4;

import java.util.HashMap;
import java.util.Map;

public class ej4 {

	public Map<String, Integer> contar(String[] strings) {

        Map<String, Integer> mapa = new HashMap<String, Integer>();

        for (String s : strings) {
            if (!mapa.containsKey(s)) {
                mapa.put(s, 1);
            } else {
                int count = mapa.get(s);
                mapa.put(s, count + 1);
            }
        }
        return mapa;

    }
	

}
