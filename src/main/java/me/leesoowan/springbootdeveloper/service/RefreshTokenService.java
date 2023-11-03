package me.leesoowan.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.leesoowan.springbootdeveloper.domain.RefreshToken;
import me.leesoowan.springbootdeveloper.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow((() -> new IllegalArgumentException("Unexpected token")));
    }
}
