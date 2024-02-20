// AdminQuestController.java
package com.example.harboureats.controller;

import com.example.harboureats.model.AdminQuestRequest;
import com.example.harboureats.service.AdminQuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/quests")
public class AdminQuestController {

    private final AdminQuestService adminQuestService;

    @Autowired
    public AdminQuestController(AdminQuestService adminQuestService) {
        this.adminQuestService = adminQuestService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createQuest(@RequestBody AdminQuestRequest questRequest) {
        adminQuestService.createQuest(questRequest);
        return ResponseEntity.ok("Quest created successfully");
    }

    @PostMapping("/launch/{questId}")
    public ResponseEntity<String> launchQuest(@PathVariable(name = "questId") String questId) {
        adminQuestService.launchQuest(questId);
        return ResponseEntity.ok("Quest launched successfully");
    }

    @PostMapping("/deliverOrder/{questId}")
    public ResponseEntity<String> deliverOrder(@PathVariable(name = "questId") String questId) {
        adminQuestService.deliverOrder(questId);
        return ResponseEntity.ok("Order delivered successfully");
    }
}
