package exercicios;
import java.util.Scanner;
public class exerciciomediafinal {
	public static void main(String[] args) {
	// Declarando o Scanner e as variaveis
    Scanner leitor = new Scanner(System.in);
    int ac1, ac2, ag, af;
    double peso1, peso2, pesog, pesof, mediafinal; 
    //imprimindo perguntas para saber qual a nota do aluno em cada avaliacao
    System.out.println("Qual foi a sua nota da AC1:");
    ac1 = leitor.nextInt();
    System.out.println("Qual foi a sua nota da AC2:");
    ac2 = leitor.nextInt();
    System.out.println("Qual foi a sua nota da AG:");
    ag = leitor.nextInt();
    System.out.println("Qual foi a sua nota da AF:");
    af = leitor.nextInt();
   //calculo de cada prova por seus respectivos pesos
    peso1 = (0.15 * ac1);
    peso2 = (0.3 * ac2);
    pesog = (0.1 * ag);
    pesof = (0.45 * af);
   //caculo da media final e imprimindo o resultado da media final do aluno
    mediafinal = peso1 + peso2 + pesog + pesof;
    System.out.println("media final do aluno: " + mediafinal);
}
}