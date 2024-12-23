package com.linkedin.backend.configuration;

import com.linkedin.backend.features.authentication.model.AuthenticationUser;
import com.linkedin.backend.features.authentication.repository.AuthenticationUserRepository;
import com.linkedin.backend.features.authentication.utils.Encoder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabaseConfiguration {

    private final Encoder encoder;

    public LoadDatabaseConfiguration(Encoder encoder) {
        this.encoder = encoder;
    }

    @Bean
    public CommandLineRunner initDatabase (AuthenticationUserRepository authenticationUserRepository) {
        return args -> {
            AuthenticationUser authenticationUser = new AuthenticationUser("nihad@nihadtest.com", encoder.encode("nihadly"), true);
            authenticationUserRepository.save(authenticationUser);
        };
    }
}
