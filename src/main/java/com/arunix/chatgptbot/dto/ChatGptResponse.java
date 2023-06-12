package com.arunix.chatgptbot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatGptResponse {
    private List<Choice> choices;
    public class Choice {
        private int index;
        private Message message;
    }

}
