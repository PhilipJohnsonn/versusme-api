package versusme.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nombre")
    private String nombre;
    
    @Column(name = "Apellido")
    private String apellido;
    
    @Column(name = "UbicacionLatitud")
    private Double ubicacionLatitud;
    
    @Column(name = "UbicacionLongitud")
    private Double ubicacionLongitud;

    @Column(name = "Email", unique = true)
    private String email;

    @Column(name = "Password")
    private String password;

    @Column(name = "Foto")
    private String foto;

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String apellido, Double ubicacionLatitud, Double ubicacionLongitud, String email,
			String password, String foto) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ubicacionLatitud = ubicacionLatitud;
		this.ubicacionLongitud = ubicacionLongitud;
		this.email = email;
		this.password = password;
		this.foto = foto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Double getUbicacionLatitud() {
		return ubicacionLatitud;
	}

	public void setUbicacionLatitud(Double ubicacionLatitud) {
		this.ubicacionLatitud = ubicacionLatitud;
	}

	public Double getUbicacionLongitud() {
		return ubicacionLongitud;
	}

	public void setUbicacionLongitud(Double ubicacionLongitud) {
		this.ubicacionLongitud = ubicacionLongitud;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
    
}
