// AdminQuestService.java
package com.example.harboureats.service;

import com.example.harboureats.model.AdminQuestRequest;
import com.example.harboureats.model.Quest;
import com.example.harboureats.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AdminQuestService {

    private final Map<String, AdminQuestRequest> questMap = new HashMap<>();
    private final QuestRepository questRepository;

    @Autowired
    public AdminQuestService(QuestRepository questRepository) {
        this.questRepository = questRepository;
    }

    public void createQuest(AdminQuestRequest questRequest) {
        String questId = generateQuestId();
        questRequest.setQuestId(questId);
        questRequest.setProgress(0); // Initial progress
        questMap.put(questId, questRequest);

        Quest entity = new Quest();
        entity.setQuestName(questRequest.questName);
        entity.setQuestDescription(questRequest.questDescription);
        questRepository.save(entity);
    }

    public void launchQuest(String questId) {
        // Implement quest launch logic, if needed
        // For simplicity, we assume that launching a quest starts the duration countdown
    }

    public void deliverOrder(String questId) {
        AdminQuestRequest questRequest = questMap.get(questId);
        if (questRequest != null) {
            int currentProgress = questRequest.getProgress();
            int newProgress = currentProgress + 1;
            questRequest.setProgress(newProgress);

            checkAndHandleTiers(questRequest); // Check if a tier is completed
        }
    }

    private void checkAndHandleTiers(AdminQuestRequest questRequest) {
        int currentProgress = questRequest.getProgress();
        int tierOrderCount = questRequest.getTierOrderCount();
        double tierReward = questRequest.getTierReward();

        int currentTier = currentProgress / tierOrderCount;
        int remainingOrdersInTier = (currentTier + 1) * tierOrderCount - currentProgress;

        if (remainingOrdersInTier == 0) {
            // Tier completed, provide reward or perform necessary actions
            double reward = (currentTier + 1) * tierReward;
            System.out.println("Tier " + (currentTier + 1) + " completed! Reward: " + reward);
        }
    }

    private String generateQuestId() {
        // For simplicity, you can use a UUID or any other method to generate unique quest IDs
        return "Q" + System.currentTimeMillis();
    }
}
