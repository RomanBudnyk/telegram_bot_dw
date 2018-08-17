package com.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

public class Bot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {

    }

    public void onUpdatesReceived(List<Update> updates) {

    }

    public String getBotUsername() {
        return null;
    }

    public String getBotToken() {
        return null;
    }
}
