// AdminQuestRequest.java
package com.example.harboureats.model;

public class AdminQuestRequest {
    private String questId;
    public String questName;
    public String questDescription;
    private int progress;
    private int tierOrderCount;
    private double tierReward;

    // Constructors, getters, and setters

    // Other fields and methods ...

    public String getQuestId() {
        return questId;
    }

    public void setQuestId(String questId) {
        this.questId = questId;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getTierOrderCount() {
        return tierOrderCount;
    }

    public void setTierOrderCount(int tierOrderCount) {
        this.tierOrderCount = tierOrderCount;
    }

    public double getTierReward() {
        return tierReward;
    }

    public void setTierReward(double tierReward) {
        this.tierReward = tierReward;
    }

    // Other getters and setters ...
}
