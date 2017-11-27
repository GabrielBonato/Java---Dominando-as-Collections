import java.util.ArrayList;
import java.util.Collections;

public class TestendoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		// add adiciona um objeto nesse caso um ArrayList de String
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		// o java chama o toString() dos obejtos aula1, aula2 e aula3
		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		// customisar a sente�a
		// como � q se le o foreach?
		// para cada string aula dentro de aulas, fa�a o seguinte
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		// o metodo get pode requisitar a em qual posi��o deseja pegar a informa��o
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula � " + primeiraAula);

		// --------size � utilizado para lista e lenght para array
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}

		System.out.println(aulas.size());

		// metodo forEach, para cada objeto o fa�a (chamado recurso lambida)
		aulas.forEach(aula -> {
			System.out.println("Percorrendo: ");
			System.out.println("Aula - " + aula);
		});

		//adicionando um elemento para ajudar na ordena��o
		aulas.add("Aumenando nosso conhecimento");
		System.out.println(aulas);
		//ordena��o alfabetica por default
		Collections.sort(aulas);
		System.out.println("Depois de ordenado: "+ aulas);
						
	}
}
