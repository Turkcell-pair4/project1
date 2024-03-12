package com.turkcell.pairproject1.core.Services.concretes;

import com.turkcell.pairproject1.core.Services.abstracts.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {



    @Override
    public String message(String key) {
        return null;
    }

    @Override
    public String getMessageWithArgs(String key, Object... args) {
        return null;
    }
}
