package com.example.harboureats.service;

import com.example.harboureats.model.CourierJoinRequest;
import com.example.harboureats.model.QuestDetailsResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourierService {

    // Placeholder data structures for simulation
    private final Map<String, List<QuestDetailsResponse>> courierQuestHistory = new HashMap<>();
    private final Map<String, List<QuestDetailsResponse>> courierOngoingQuests = new HashMap<>();

    public void joinQuest(String courierId, CourierJoinRequest joinRequest) {
        // Placeholder logic to simulate joining a quest
        QuestDetailsResponse joinedQuest = createDummyQuest("Joined Quest", "Description");
        addToOngoingQuests(courierId, joinedQuest);
    }

    public List<QuestDetailsResponse> getActiveQuests(String courierId) {
        // Placeholder logic to simulate retrieving active quests
        return courierOngoingQuests.getOrDefault(courierId, Collections.emptyList());
    }

    public List<QuestDetailsResponse> getQuestHistory(String courierId) {
        // Placeholder logic to simulate retrieving quest history
        return courierQuestHistory.getOrDefault(courierId, Collections.emptyList());
    }

    public List<QuestDetailsResponse> getOngoingQuests(String courierId) {
        // Placeholder logic to simulate retrieving ongoing quests
        return courierOngoingQuests.getOrDefault(courierId, Collections.emptyList());
    }

    private QuestDetailsResponse createDummyQuest(String name, String description) {
        // Placeholder logic to create a dummy quest
        QuestDetailsResponse quest = new QuestDetailsResponse();
        quest.setQuestName(name);
        quest.setQuestDescription(description);
        return quest;
    }

    private void addToOngoingQuests(String courierId, QuestDetailsResponse quest) {
        courierOngoingQuests.computeIfAbsent(courierId, k -> new ArrayList<>()).add(quest);
    }
}
