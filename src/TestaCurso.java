import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Gabriel");
		List<Aula> aulas = javaColecoes.getAulas();
		// System.out.println(aulas);

		// aulas.add(new Aula("Trabalhando com ArrayList", 21));
		// javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adciona(new Aula("Trabalhando com ArrayList", 21));
		// javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adciona(new Aula("Modelando com coleções", 22));

		// System.out.println(aulas);

		System.out.println(javaColecoes.getAulas());

		// javaColecoes e aulas se referenciam para o mesmo objeto
		// System.out.println(aulas == javaColecoes.getAulas());

	}

}
