package logic;

import javax.annotation.PostConstruct;

import logic.MultipleInvocation;

/**
 * Clase que se va a crear en tiempo de ejecución y que va actuar deacuerdo ala anotacion y lo que se "envia por parametros"
 * @author jonig
 *
 */
public class AutomaticWeapon {
	
	
	 private static final int BURST_FIRE_ROUNDS = 3;
	 
	    private static final int AUTO_FIRE_ROUNDS = 5;
	 
	    private int municion;
	 
	    /**
	     * Constructor
	     * @param ammo - > Cantidad de municion
	     */
	    
	    public AutomaticWeapon(int ammo) {
	        this.municion = ammo;
	    }
	    
	    /**
	     * Este metodo se ejecutara inmediatamnte despues de crear el arma es decir que se ignorara
	     * el parametro ingresado en el contructor 
	     * y la municion siempre sera 20
	     */
	    
	    @PostConstruct
	    public void initMethos() {
	    	this.municion = 100;
	    	System.out.println("Postcontructor");
	    }
	    
	 
	    /**
	     * Un solo disparo
	     */
	    @MultipleInvocation
	    public void singleFire() {
	        municion--;
	        System.out.println("Un solo disparo! Munición restante: " + municion);
	    }
	 
	    /**
	     * Rafaga de dsiparos
	     */
	    @MultipleInvocation(timesToInvoke = BURST_FIRE_ROUNDS)
	    public void burstFire() {
	        municion--;
	        System.out.println("Rafaga! Munición restante: " + municion);
	    }
	 
	    /**
	     * Disparo automatico
	     */
	    @MultipleInvocation(timesToInvoke = AUTO_FIRE_ROUNDS)
	    public void autoFire() {
	        municion--;
	        System.out.println("Fuego Automatico! Munición restante: " + municion);
	    }
	

}
