package ec.edu.ups.ppw63.facturacionTechShop.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "cli_codigo")
	private int codigo;
	
//	@Column(name = "cli_cedula", length = 15, nullable = true)
//	private String cedulaRuc;
	
	@Column(name = "cli_primer_nombre", length = 60, nullable = false)
	private String primerNombre;
	
	@Column(name = "cli_primer_apellido", length = 60, nullable = false)
	private String primerApellido;
	
//	@Column(name = "cli_segundo_nombre", length = 60, nullable = true)
//	private String segundoNombre;
//	
//	@Column(name = "cli_segundo_apellido", length = 60, nullable = true)
//	private String segundoApellido;
	
	@Column(name = "cli_correo", length = 100, nullable = false)
	private String correo;
	
	@Column(name = "cli_contrasenia", length = 100, nullable = false)
	private String contrasenia;
	
	@Column(name = "cli_celular", length = 15, nullable = true)
	private String celular;

	@ManyToOne
	@JoinColumn(name = "dir_codigo")
	Direcciones direcciones;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	List<CabeceraFacturas> caberasList;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

//	public String getCedulaRuc() {
//		return cedulaRuc;
//	}
//
//	public void setCedulaRuc(String cedulaRuc) {
//		this.cedulaRuc = cedulaRuc;
//	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

//	public String getSegundoNombre() {
//		return segundoNombre;
//	}
//
//	public void setSegundoNombre(String segundoNombre) {
//		this.segundoNombre = segundoNombre;
//	}
//
//	public String getSegundoApellido() {
//		return segundoApellido;
//	}
//
//	public void setSegundoApellido(String segundoApellido) {
//		this.segundoApellido = segundoApellido;
//	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Direcciones getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(Direcciones direcciones) {
		this.direcciones = direcciones;
	}

	public List<CabeceraFacturas> getCaberasList() {
		return caberasList;
	}

	public void setCaberasList(List<CabeceraFacturas> caberasList) {
		this.caberasList = caberasList;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", primerNombre=" + primerNombre + ", primerApellido=" + primerApellido
				+ ", correo=" + correo + ", contrasenia=" + contrasenia + ", celular=" + celular + ", direcciones="
				+ direcciones + ", caberasList=" + caberasList + "]";
	}
	
	
	
	
	
}
