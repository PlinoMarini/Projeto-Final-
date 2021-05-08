
public class Usuario {
	private String login;
	private String senha;
	
	public Usuario(String login, String senha) {
		super();
		setLogin(login);
		setSenha(senha);
	}
	
	public Usuario(Usuario user) {
		this.setLogin(user.getLogin());
		this.setSenha(user.getSenha());
	}
	
	public String getLogin() {
		return login;
	}
	public boolean setLogin(String login) {
		if(!login.isBlank()) {
			this.login = login;
			return true;
		}
		else {
			this.login = null;
			return false;
		}
	}
	public String getSenha() {
		return senha;
	}
	public boolean setSenha(String senha) {
		if(senha.length() >= 8) {
			this.senha = senha;
			return true;
		}
		else {
			this.senha = null;
			return false;
		}
	}
	
	
}
