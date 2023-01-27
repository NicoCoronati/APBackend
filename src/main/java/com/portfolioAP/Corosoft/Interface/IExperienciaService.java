package com.portfolioAP.Corosoft.Interface;

import com.portfolioAP.Corosoft.Entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    //Traer educacion
    public List<Experiencia> getExperiencia();

    //Guardar objeto educacion
    public void saveExperiencia(Experiencia experiencia);

    //Borrar objeto educacion por id
    public void deleteExperiencia(Long id);

    //Buscar experiencia por id
    public Experiencia findExperiencia(Long id);
}

