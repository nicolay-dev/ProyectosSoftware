package logic;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import logic.MultipleInvocation;
import persistence.ArchivoLog;

/**
 * Esta clase va a hacer uso de la clase "AutomaticWeapon" y se encargara de escribir en un archivo de texto "log.txt"
 * cada uno de los llamados y el uso de la clase en tiempo real a traves de Reflection
 * @author jonig
 *
 */
public class Operator {

	private ArchivoLog log;
	
	/**
	 * Prueba la clase (La crea y prueba todos los metodos que existen en ella)
	 * @param weapon
	 */
	
	public void operate(AutomaticWeapon weapon) {
		Date date = new Date();
		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		log = new ArchivoLog();
        final String className = weapon.getClass().getName();
        log.escribir("Acceso a la Clase: -" + className + "- a las: " + hourdateFormat.format(date));
        log.escribir("Ubicada en: -" + weapon.getClass().getPackage() + "- a las: " + hourdateFormat.format(date));
        log.escribir("¿Es una clase local?: -" + weapon.getClass().isLocalClass() + "- a las: " + hourdateFormat.format(date));
        log.escribir("¿Class loader?: -" + weapon.getClass().getClassLoader() + "- a las: " + hourdateFormat.format(date));
        try {
            final Method[] methods = Class.forName(className).getMethods();
            for (final Method method : methods) {
            	date = new Date();
            	log.escribir("Acceso al metodo: -" + method.getName() + "- a las: " + hourdateFormat.format(date));
                invokeMethod(method, weapon);
            }
        } catch (final Exception e) {
            System.err.println("Hubo un error:" + e.getMessage());
        }
    }
	
	
	private void invokeMethod(Method method, AutomaticWeapon weapon)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
 
        final MultipleInvocation multipleInvocation = method.getAnnotation(MultipleInvocation.class);
 
        if (multipleInvocation != null) {
            final int timesToInvoke = multipleInvocation.timesToInvoke();
 
            for (int i = 0; i < timesToInvoke; i++) {
                method.invoke(weapon, (Object[])null);
            }
        }
 
    }
	
}
