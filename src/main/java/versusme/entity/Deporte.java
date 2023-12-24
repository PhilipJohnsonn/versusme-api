package versusme.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Deportes")
public class Deporte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDeporte;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "JugadoresMax")
	private Integer jugadoresMax;
	
	public Deporte() {
		super();
	}

	public Deporte(String nombre, Integer jugadoresMax) {
		super();
		this.nombre = nombre;
		this.jugadoresMax = jugadoresMax;
	}

	public Long getIdDeporte() {
		return idDeporte;
	}

	public void setIdDeporte(Long idDeporte) {
		this.idDeporte = idDeporte;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getJugadoresMax() {
		return jugadoresMax;
	}

	public void setJugadoresMax(Integer jugadoresMax) {
		this.jugadoresMax = jugadoresMax;
	}
	
}
