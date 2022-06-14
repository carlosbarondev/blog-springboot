package com.sistema.blog.servicio;

import java.util.List;

import com.sistema.blog.dto.PublicacionDTO;

public interface PublicacionServicio {

	public PublicacionDTO crearPublicacion(PublicacionDTO publicacionDTO);

	public List<PublicacionDTO> obtenerTodasLasPublicaciones();

	public PublicacionDTO obtenerPublicacionPorId(long id);

	public PublicacionDTO actualizarPublicacion(PublicacionDTO publicacionDTO, long id);

	public void eliminarPublicacion(long id);

}