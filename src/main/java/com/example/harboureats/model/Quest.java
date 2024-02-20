
package com.example.harboureats.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class Quest {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String questName;

    private String questDescription;

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

}
