/*When you pass a parameter that has one of the eight primitive types of method,
that parameter is passed by value. Any changes that the method makes to the value of
its parameter don't affect the value of the variables back in the calling code.
birth() method can apply ++ operator to cityPop,
however, ++ will not have any affect on the value of
smackoverARpop inside the main() method.
In the example, main() method calls birth() method.
Birth method has a parameter (int cityPop).
birth() method is also incrementing cityPop inside the method.
Main method's call to birth() method,
sends smackoverARpop as the value for parameterized value,
taking place of (int cityPop).
Once inside birth() method,
the value of smackoverARpop does not change by cityPop++ because,
smackoverARpop is of type int.
The value of smackoverARpop remains the same inside birth() method
because of java's pass by value rule. */
package Population;

public class PopulationCalculator {

    static int smackoverARpop = 2232;

    static int birth(int cityPop){
        return cityPop ++;
    }

    static int newBirth(int cityPop){
        return cityPop += 1;
    }

    public static void main(String[] args) {

        smackoverARpop = birth(smackoverARpop);
        System.out.println(smackoverARpop);

        System.out.println(newBirth(smackoverARpop));

        int newPopulation = 5000;
        System.out.println(birth(5000));
    }
}
/*What is happening here?
	 * We have a static method called birth().
	 * We have the main() method
	 * Inside main method, we first initialize smackoverARpop as a static variable with a value of 2232
	 * We are then calling the variable inside the main method. We are also assigning
	   smackoverARpop to take on the value from method birth.

	 * As you can see birth in static, parameterized and has a return
	 * Since birth() is parameterized, we must send a value.
	 *
	 * We could have written:
	 * smackoverARpop = birth(22);
	 *
	 * If we sent 22, birth(), method would take 22 back to birth(), outside of main().
	 * 22 would assigned to cityPop int variable inside the parameter.
	 * cityPop would also be incremented by 1 (since cityPop + 1)
	 * since birth() return, birth() takes 23 back to main() method, and replaces birth(22) with 23.
	 * smackoverARpop is then assigned the value of 23.
	 * out.println method then prints 23.
	 *
	 * Similarly, with smackoverARpop = birth(smackoverARpop);, we doing something similar to the += operators.
	 *
	 *
            `int a = 10;
	               a += 2;
	               System.out.print(a);

	               Output = 12;`

	We first defined smackoverARpop as 2232. We are then assigning smackoverARpop to take on the value we
	would get from birth(int cityPop). We are then sending smackoverARpop's current value of 2232.
	2232 goes inside birth() method and comes back with 2233 as then value.
	smackoverARpop is then printed by System.out.println() and we get an output of 2233.
	 *
	 *
	 *  Note, if you change cityPop + 1 to cityPop++, we will still see 2232 instead of 2233.
	    This is because of pass by value rule. By cityPop + 1, we are performing an operation, hence, the value
	 *  of smackoverARpop prints out as 2233*/

