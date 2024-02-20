package com.example.harboureats.repository;

import com.example.harboureats.model.Quest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestRepository extends JpaRepository<Quest, Long> {
}
