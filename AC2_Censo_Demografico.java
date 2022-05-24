//importar a classe scanner
import java.util.Scanner;

public class AC2_Censo_Demografico {

	public static void main(String[] args) {
		// declarando scanner para entrada de dados
		Scanner IBGE = new Scanner(System.in);
		// variaveis
		int  masculino = 0, feminino = 0, outros = 0, gen;
		float n, altura = 0, alturaf = 0, alturam = 0, alturao = 0, porcentagem = 0, idadef = 0, idadem = 0, idadeh = 0,
				idade = 0, idaden = 0, mig, maf, mim;
		// criando laco de repeticão
		for (n = 0; n <= 999; n++) {
			// exibir na tela a pergunta
			System.out.println(
					"Responda a pesquisa de acordo com suas informações\nGenero:\n0-Feminino\n1-Masculino\n2-Outros");
			// atribuindo valor digitado pelo usuario
			gen = IBGE.nextInt();
			// switch para armazenar os dados digitados
			switch (gen) {
			case 0:
				feminino++;
				System.out.println("Qual sua altura?");
				altura = IBGE.nextFloat();
				alturaf = alturaf + altura;
				System.out.println("Qual sua idade?");
				idade = IBGE.nextFloat();
				idadef = idadef + idade;
				if (idade >= 18 && idade <= 35)
					idaden++;
				break;
			case 1:
				masculino++;
				System.out.println("Qual sua altura?");
				altura = IBGE.nextFloat();
				alturam = alturam + altura;
				System.out.println("Qual sua idade?");
				idade = IBGE.nextFloat();
				idadem = idadem + idade;
				if (idade >= 18 && idade <= 35)
					idaden++;

				break;
			case 2:
				outros++;
				System.out.println("Qual sua altura?");
				altura = IBGE.nextFloat();
				alturao = alturao + altura;
				System.out.println("Qual sua idade?");
				idade = IBGE.nextFloat();
				idadeh = idadeh + idade;
				if (idade >= 18 && idade <= 35)
					idaden++;
				break;
			}

		}
		// inserindo variaveis com expressoes matematicas
		mig = (idadef + idadem + idadeh) / (feminino + masculino + outros);
		maf = alturaf / feminino;
		mim = idadem / masculino;
		porcentagem = idaden / (feminino + masculino + outros);
		// exibir na tela
		System.out.println("Media de Idade do grupo e de " + mig);
		System.out.println("\nMedia da altura das mulheres e " + maf);
		System.out.println("\nMedia da idade dos homens e " + mim);
		System.out.println("\nQuantidade de pessoas que identificaram como outros sao " + outros);
		System.out.println("\nPercentual de pessoas com idade entre 18 e 35 anos e " + (porcentagem * 100) + "%");

	}

}