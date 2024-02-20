package com.example.harboureats.model;

public class QuestDetailsResponse {
    private String questId;
    private String questName;
    private String questDescription;
    private int currentTier;
    private int ordersLeftInTier;

    // Add getters and setters

    public String getQuestId() {
        return questId;
    }

    public void setQuestId(String questId) {
        this.questId = questId;
    }

    public String getQuestName() {
        return questName;
    }

    public void setQuestName(String questName) {
        this.questName = questName;
    }

    public String getQuestDescription() {
        return questDescription;
    }

    public void setQuestDescription(String questDescription) {
        this.questDescription = questDescription;
    }

    public int getCurrentTier() {
        return currentTier;
    }

    public void setCurrentTier(int currentTier) {
        this.currentTier = currentTier;
    }

    public int getOrdersLeftInTier() {
        return ordersLeftInTier;
    }

    public void setOrdersLeftInTier(int ordersLeftInTier) {
        this.ordersLeftInTier = ordersLeftInTier;
    }
}
