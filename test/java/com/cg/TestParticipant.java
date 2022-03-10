package com.cg;


import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import com.cg.beans.Participants;
import com.cg.repo.ParticipantsRepository;




@RunWith(SpringRunner.class)
@SpringBootTest
public class TestParticipant {
	
	
	@Autowired
	private ParticipantsRepository participantRepo;
	
	



	@Test
	public void testaddParticipant() {
		Participants p = new Participants();
		p.setId(1L);
		p.setFirstName("kajal");
		p.setLastName("paygude");
		participantRepo.save(p);


		Assertions.assertThat(participantRepo.existsById(1L)).isNotNull();

		
	}

	
	@Test
	public void testgetAllParticipant() {
		
		Participants p1 = new Participants();
		p1.setId(2);
		p1.setFirstName("Ravi");
		p1.setLastName("paygude");
		participantRepo.save(p1);
		Participants p2 = new Participants();
		p2.setId(3);
		p2.setFirstName("geeta");
		p2.setLastName("paygude");
		participantRepo.save(p2);
		
		List<Participants> pList= new ArrayList<>();
		pList.add(p1);
		pList.add(p2);
		
		participantRepo.saveAll(pList);

		Assertions.assertThat(participantRepo.findAll()).isNotEmpty();
	}

	


	
}
