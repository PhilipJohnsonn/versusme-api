package versusme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import versusme.entity.Sport;
import versusme.exception.ResourceNotFoundException;
import versusme.repository.DeporteRepository;

@RestController
@RequestMapping("/deportes/")
public class DeporteController {

	@Autowired
	private DeporteRepository deporteRepository;
	
	@GetMapping("/")
	public List<Sport> getAllDeportes(){
		return this.deporteRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Sport> getDeporteById(@PathVariable(value = "id") Long deporteId)
			throws ResourceNotFoundException {
		Sport deporte = deporteRepository.findById(deporteId)
				.orElseThrow(() -> new ResourceNotFoundException("Deporte no encontrado con el ID :: " + deporteId));
		return ResponseEntity.ok().body(deporte);
	}

	@PostMapping("/crear")
	public Sport createDeporte(@RequestBody Sport deporte) {
		return deporteRepository.save(deporte);
	}

//	@PutMapping("/deportes/{id}")
//	public ResponseEntity<Deporte> updateDeporte(@PathVariable(value = "id") Long deporteId, @RequestBody Deporte deporteDetails) throws ResourceNotFoundException {
//		Deporte deporte = deporteRepository.findById(deporteId)
//				.orElseThrow(() -> new ResourceNotFoundException("Deporte no encontrado con el ID :: " + deporteId));
//
//		deporte.setEmailId(deporteDetails.getEmailId());
//		deporte.setLastName(deporteDetails.getLastName());
//		deporte.setFirstName(deporteDetails.getFirstName());
//		final Deporte updatedDeporte = deporteRepository.save(deporte);
//		return ResponseEntity.ok(updatedDeporte);
//	}
//
//	@DeleteMapping("/deportes/{id}")
//	public Map<String, Boolean> deleteDeporte(@PathVariable(value = "id") Long deporteId)
//			throws ResourceNotFoundException {
//		Deporte deporte = deporteRepository.findById(deporteId)
//				.orElseThrow(() -> new ResourceNotFoundException("Deporte no encontrado con el ID :: " + deporteId));
//
//		deporteRepository.delete(deporte);
//		Map<String, Boolean> response = new HashMap<>();
//		response.put("deleted", Boolean.TRUE);
//		return response;
//	}
	
}
