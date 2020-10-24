package exercicioLogicaProgramacao4;

public class ExercicioQuatroBhaskara {
	public int a;
	public int b;
	public int c;
	
	public void calculaDelta(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		if(a == 0 || b == 0 || c == 0) {
			System.out.println("Valor 0 não é permitido.");
		} else {
			int delta = (b*b - 4*a*c);			
			calculaRaizDeDelta(delta);
		}
	}
	
	public void calculaRaizDeDelta(int delta) {
		int raizDelta = (int) Math.sqrt(delta);
		calculaX(raizDelta);
	}
	
	public void calculaX(int raizDelta) {
		double xLinha = (-b - raizDelta) / (2*a);		
		double xDuasLinhas = (-b + raizDelta) / (2*a);
		imprimeSolucao(xLinha, xDuasLinhas);
	}
	
	public void imprimeSolucao(double xLinha, double xDuasLinhas) {
		System.out.println(xLinha);
		System.out.println(xDuasLinhas);
	}
}