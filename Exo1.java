public class Exo1{
	public static void main(String[] args){
		if(args.length < 2){
			System.out.println("Vous devez mettre votre nom Complet en argument");
			return;
		}
		System.out.println("Bonjour" + " " + args[0] + " " + args[1]);
	}
}