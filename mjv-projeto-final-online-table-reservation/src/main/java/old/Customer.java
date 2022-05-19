package old;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Torna a classe um entidade conectada a uma tabela no banco de dados
@Table(name = "customer") //Necessário quando o nome da entidade difere do nome da tabela
public class Customer {
	@Id //Determina que o atributo representa a chave primária no banco de dados
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Determina a geração da chave primária
	private Integer id;
	private String name;
	private String phone;
	private String email;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
}
