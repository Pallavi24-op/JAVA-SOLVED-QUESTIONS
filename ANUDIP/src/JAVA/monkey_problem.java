package JAVA;

//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
//
//
//monkeyTrouble(true, true) → true
//monkeyTrouble(false, false) → true
//monkeyTrouble(true, false) → false
public class monkey_problem {
	public static boolean monkeysmile(boolean a,boolean b) {
		if(a && b) {
			return true;
		}
		if (!a && !b){
			return false;
		}
		return false;
	}
	
public static void main(String[] args) {
	System.out.println(monkeysmile(true,true));
	System.out.println(monkeysmile(true,false));
	System.out.println(monkeysmile(false,false));	
}
}
