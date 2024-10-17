//class Exception
class ValorInvalidoException extends Exception {
	public ValorInvalidoException(String message) {
		super(message);
	}
}
//class Filme
class Filme {
	private String titulo;
	private String genero;
	private int duraçao;
//Construtores dos atributos, com os parametros definidos	
	public Filme (String titulo, String genero, int duraçao) throws ValorInvalidoException {
		this.setTitulo(titulo);	
		this.setDuraçao(duraçao);
		this.setGenero(genero);

//metodo de acesso do titulo	
	}
	public String getTitulo(){
		return titulo;
	}
//metodo para verificar o titulo e apresentar o throws em caso de nao seguir o parametro
	public void setTitulo (String titulo) throws ValorInvalidoException {
		if (titulo == null || titulo.trim().isEmpty()) {
			throw new ValorInvalidoException ("O titulo não pode estar vazio");
		}
	this.titulo = titulo;
	}
//metodo de acesso da duraçao	
	public int getDuraçao() {
		return duraçao;
	}
//metodo para verificar a duraçao e apresentar o throws em caso de nao seguir o parametro  	
	public void setDuraçao (int duraçao) throws ValorInvalidoException  {
		if (duraçao <=0) {
			throw new ValorInvalidoException ("Duração deve ser maior que zero");
		}
	this.duraçao = duraçao;
	}
//metodo para acesso do genero	
	public String getGenero() {
		return genero;
	}
//metodo para verificar os generos e apresentar o throws em caso de nao seguir o parametro	
	public void setGenero (String genero) throws ValorInvalidoException {
		if (genero == null || (!genero.equalsIgnoreCase("Romance") &&
							   !genero.equalsIgnoreCase("Terror") &&
							   !genero.equalsIgnoreCase("Comedia"))) {
			throw new ValorInvalidoException ("O genero deve ser romance, terror e comedia");
			}
	this.genero = genero;
	}
//metodo para retornar os valores 	
	public String toString() {
		return "Titulo: " + titulo + ", Genero: " + genero + ", Duração: " + duraçao + "";
	}
	
}
