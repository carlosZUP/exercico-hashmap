package br.com.example.demo.postagem;

public class PostagemModel {

	private String usuario;
	private String postagem;

	public PostagemModel() {

	}

	public PostagemModel(String usuario, String postagem) {
		this.usuario = usuario;
		this.postagem = postagem;

	}

	public String getPostagem() {
		return postagem;
	}

	public void setPostagem(String postagem) {
		this.postagem = postagem;
	}

	public String getUsuario() {
		return usuario;
	}

	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();

		modelo.append("Usuario: " + this.usuario);
		modelo.append("Postagem: " + this.postagem);
		modelo.append("/n");

		return modelo.toString();
	}
}
