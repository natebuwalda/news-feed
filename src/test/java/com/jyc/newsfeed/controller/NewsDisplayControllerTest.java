package com.jyc.newsfeed.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class NewsDisplayControllerTest {
    
    private final NewsDisplayController displayController = new NewsDisplayController();
    
    @Test
    public void shouldDisplaySummaryPage() {
        String viewName = displayController.displaySummary();
        assertEquals("newsSummary", viewName);
    }
}
