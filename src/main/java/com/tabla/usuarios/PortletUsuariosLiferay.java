package com.tabla.usuarios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class PortletUsuariosLiferay extends MVCPortlet {


@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {

		List<Persona2> personas = new ArrayList<Persona2>();
		
		try {

			List<User> personasLiferay = UserLocalServiceUtil.getUsers(0, UserLocalServiceUtil.getUsersCount());

			for (User user: personasLiferay){
				
				personas.add(new Persona2 (user.getUserId(), user.getScreenName()));
				

				}
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String personasJSON = JSONFactoryUtil.serialize(personas);

		resourceResponse.getWriter().print(personasJSON);

	}

}
