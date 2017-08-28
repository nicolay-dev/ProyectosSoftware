package run;

import logic.AutomaticWeapon;
import logic.Operator;


/**
 * probar las anotaciones creando un operador y se le asigne un arma para probar
 * @author jonig
 */
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final AutomaticWeapon weapon = new AutomaticWeapon(30);
		final Operator operator = new Operator();
		operator.operate(weapon);
	}

}
