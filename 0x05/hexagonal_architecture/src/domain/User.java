package domain;

public class User {
	
	private String id;
	
	private String name;
	
	public User(String id, String nome) {
		super();
		this.id = id;
		this.name = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}
	
	

}
