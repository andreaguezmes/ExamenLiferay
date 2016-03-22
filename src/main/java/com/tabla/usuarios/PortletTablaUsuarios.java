package com.tabla.usuarios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.tabla.usuarios.*;

/**
 * Portlet implementation class PortletTablaUsuarios
 */
public class PortletTablaUsuarios extends MVCPortlet {
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {

		List<Persona> personas = new ArrayList<Persona>();

		
		personas.add(new Persona(1111, "Andrea Güezmes", "andrea", "andrea@andrea", "Juego de Tronos"));
		personas.add(new Persona(2222, "José Luis Martínez", "jose", "jose@jose", "El Señor de los Anillos"));
		personas.add(new Persona(3333, "Ana González", "ana", "ana@ana", "La Historia Interminable"));
		personas.add(new Persona(4444, "Iker Babace", "iker", "iker@iker", "Harry Potter"));
		personas.add(new Persona(5555, "Estefanía Novales", "estefania", "estefania@estefania", "Corazon de Tormenta"));
		personas.add(new Persona(6666, "Aroa Llorente", "aroa", "aroa@aroa", "La Sombra del viento"));		
		personas.add(new Persona(7777, "Izan Santana", "izan", "izan@izan", "Los Pilares de la Tierra"));	


		String personasJSON = JSONFactoryUtil.serialize(personas);

		resourceResponse.getWriter().print(personasJSON);
	}

}
