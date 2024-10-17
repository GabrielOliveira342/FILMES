
public class Main {

		public static void main(String[] args) {
			try { //uso do try com os parametros do titulo 
				Filme filme1 = new Filme("Senhor dos aneis", "Terror", 180); 
				System.out.println(filme1);
			
				Filme filme2 = new Filme("", "Romance", 180);	
			} catch (ValorInvalidoException e) { //catch para caso de erro
				System.err.println("Erro: " + e.getMessage()); //system para apresentar o erro 
			}
			try { //uso do try com os parametros da duraçao 
				Filme filme3 = new Filme ("Duro de matar", "Comedia", -20);
				System.out.println(filme3);
			} catch (ValorInvalidoException e) { //catch para caso de erro
				System.err.println("Erro: "+ e.getMessage()); //system para apresentar o errp 
			}
			try { //uso do try com os parametros do genero
				Filme filme4 = new Filme("Tanto faz", "Ação", 200);
			} catch (ValorInvalidoException e ) { //catch para caso de erro 
				System.err.println("Erro: "+ e.getMessage()); //syste para apresentar o erro 
			}
		}
}


