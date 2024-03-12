package com.turkcell.pairproject1.core.Services.abstracts;

public interface MessageService {
    String message(String key);
    String getMessageWithArgs(String key, Object... args);
}
