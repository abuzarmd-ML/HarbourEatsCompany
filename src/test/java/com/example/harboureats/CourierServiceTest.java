package com.example.harboureats;

import com.example.harboureats.model.CourierJoinRequest;
import com.example.harboureats.model.QuestDetailsResponse;
import com.example.harboureats.service.CourierService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class CourierServiceTest {

    @Mock
    private Map<String, List<QuestDetailsResponse>> courierOngoingQuests;

    @InjectMocks
    private CourierService courierService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testJoinQuest() {
        String courierId = "testCourierId";
        CourierJoinRequest joinRequest = new CourierJoinRequest();

        courierService.joinQuest(courierId, joinRequest);

        // Verify that the quest was added to ongoing quests for the courier
        List<QuestDetailsResponse> ongoingQuests = courierService.getOngoingQuests(courierId);
        assertEquals(1, ongoingQuests.size());
        assertEquals("Joined Quest", ongoingQuests.get(0).getQuestName());
        assertEquals("Description", ongoingQuests.get(0).getQuestDescription());
    }

    @Test
    void testGetActiveQuests() {
        String courierId = "testCourierId";

        // Mock the behavior of courierOngoingQuests map
        List<QuestDetailsResponse> expectedQuests = Collections.singletonList(new QuestDetailsResponse());
        when(courierOngoingQuests.getOrDefault(anyString(), any())).thenReturn(expectedQuests);

        // Call the method under test
        List<QuestDetailsResponse> activeQuests = courierService.getActiveQuests(courierId);

        // Verify that the method returns the expected quests
        assertEquals(expectedQuests, activeQuests);
    }

    // Similarly, write tests for other methods like getQuestHistory and getOngoingQuests
}
