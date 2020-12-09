package com.clearminds.gmfp.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.clearminds.gmfp.dtos.Estudiante;
import com.clearminds.gmfp.excepciones.BDDException;

@Path("/estudiante")
public class RestEstudiantes {

	@Path("/ingresar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estudiante) {
		ServicioEstudiante servicioEstudiante = new ServicioEstudiante();
		try {
			servicioEstudiante.insertarEstudiante(estudiante);
		} catch (BDDException e) {
			e.printStackTrace();

		}

	}
	
	@Path("/actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void actualizar(Estudiante estudiante) {
		ServicioEstudiante servicioEstudiante = new ServicioEstudiante();
		try {
			servicioEstudiante.actualizarEstudiante(estudiante);
		} catch (BDDException e) {
			e.printStackTrace();

		}

	}

}
