package com.cg.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Participants;
import com.cg.exceptions.ParticipantNotFoundException;
import com.cg.repo.ParticipantsRepository;

@Service
public class ParticipantsService {
	@Autowired
	private ParticipantsRepository prepository;
	

	public Participants updateParticipant(long id, Participants p) {
		try {
			if(!prepository.existsById(id)) {
				throw new ParticipantNotFoundException();
			}
		}catch(ParticipantNotFoundException e) {
			throw e;
		}
		
		return prepository.save(p);
	}
	public Participants addParticipant(Participants p) {
		return prepository.save(p);
	}
	
	

	 
}
