package com.inti.TD1Rest.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.inti.TD1Rest.repository.EcoleRepository;
import com.inti.TD1Rest.repository.EtudiantRepository;

@WebMvcTest(EcoleController.class)
public class EcoleControllerTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private EtudiantRepository etudiantRepository;
	
	@MockBean
	private EcoleRepository ecoleRepository;
	
	@Test
	public void testGetScholByNomAndPrenom() {
		try
		{
			mockMvc.perform(get("/schoolByNomAndPrenom/{nom}/{prenom}", "Jean", "Pierre"))
				.andExpect(status().isOk());
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
