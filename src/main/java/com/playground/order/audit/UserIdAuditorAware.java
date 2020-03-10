package com.playground.order.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component("userIdAuditorAware")
public class UserIdAuditorAware implements AuditorAware<UUID> {

    /**
     * TODO : replace with logged user id after introducing authentication
     */
    private static final UUID LOGGED_USER_ID = UUID.randomUUID();

    @Override
    public Optional<UUID> getCurrentAuditor() {
        return Optional.of(LOGGED_USER_ID);
    }
}
