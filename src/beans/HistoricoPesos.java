package beans;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Session Bean implementation class HistoricoPesos
 */
public class HistoricoPesos {

    /**
     * Default constructor. 
     */
    public HistoricoPesos() {
        // TODO Auto-generated constructor stub
    }

    private class Year {
    	protected LinkedList<MedidaPeso> pesos;
    	Iterator<MedidaPeso> it = pesos.iterator();
    }
}
