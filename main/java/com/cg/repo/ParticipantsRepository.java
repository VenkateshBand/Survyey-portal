package com.cg.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cg.beans.Participants;

@Repository
public interface ParticipantsRepository extends JpaRepository<Participants,Long>{


}
