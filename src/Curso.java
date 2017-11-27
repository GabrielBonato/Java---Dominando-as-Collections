import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();

	// List é uma interface, o vantagem de usar o List é o encapisulamento das aulas

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		// somente leitura, não permite modificação
		return Collections.unmodifiableList(aulas);
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void adciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		// int tempoTotal = 0;
		// for (Aula aula : aulas) {
		// tempoTotal += aula.getTempo();
		// }
		// return tempoTotal;

		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", aluas: " + this.aulas + "]";
	}

}
