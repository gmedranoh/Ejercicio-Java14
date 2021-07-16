import java.util.Scanner;

public class UScanner {

	public static void main(String[] args) {
		/*
		System.out.println("Escribe tu nombre: ");
		Scanner consola = new Scanner(System.in); //variable consola para pedir informacion 
		String usuario = consola.nextLine();
		System.out.println("Escribe tu titulo");
		String cargo = consola.nextLine();
		System.out.println("Resultado " + usuario + " " + cargo);
		
		*/
		//////////
		/*
		System.out.println("Proporciona el titulo: ");
		Scanner libro = new Scanner(System.in);
		String titulo = libro.nextLine();
		System.out.println("Proporciona el autor");
		String autor = libro.nextLine();
		
		System.out.println(titulo + " fue escrito por " + autor);
		*/
		
		/***********OPERADORES**********/
		/*
		int a = 3, b = 2;
		 //operador de composicion
		a += 1; // se incrementa en 1
		System.out.println(a);
		
		a += 3;
		*/
		/***********OPERADORES UNARIOS**********/
		/*
		int a = 3;
		int b = -a;
		
		System.out.println("a " + a);
		System.out.println("b " + b);
		
		boolean c = true;
		boolean d = !c;
		
		System.out.println("c " + c);
		System.out.println("d " + d);
		
		//preincremento
		int e = 3;
		int f = ++e; //primero se incrementa la variable y despues se usa su valor
		System.out.println("e " + e);
		System.out.println("f " + f);
		
		//postincremento
		int g = 5;
		int h = g++;
		System.out.println("g " + g);
		System.out.println("h " + h);
*/
		/***********PRECEDENCIA DE OPERADORES**********/
		/*
		int x = 5;
		int y = 10;
		int z = ++x + y--;
		
		System.out.println("x= " + x);
		System.out.println("x= " + y);
		System.out.println("z= " + z);
		*/
		
		/***********PRECEDENCIA DE OPERADORES**********/
		System.out.println("Programa para calcular el area y perimetro de un rectangulo");
		Scanner datos = new Scanner(System.in);
		System.out.println("Ingresa el alto: ");
		int alto = datos.nextInt();
		System.out.println("Ingresa el ancho ");
		int ancho = datos.nextInt();
		
		int area = alto * ancho;
		int perimetro = (alto * ancho) * 2;
		
		System.out.println("El resultado del area: " + area);
		System.out.println("El perimetro es: " + perimetro);
		
		datos.close();
		/***********OTRA SOLUCION**********/
		/*
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			// Escribe tu solucion aqui

			System.out.println("Proporciona el alto:");

			int alto = Integer.parseInt(scanner.nextLine());

			System.out.println("Proporciona el ancho:");

			int ancho = Integer.parseInt(scanner.nextLine());

			int area = alto * ancho;

			int perimetro = (alto + ancho) * 2;

			System.out.println("Area: " + area);

			System.out.println("Perimetro: " + perimetro);
		*/
		
	}

}
