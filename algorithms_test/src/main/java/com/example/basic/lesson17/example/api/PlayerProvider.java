package com.example.basic.lesson17.example.api;

import java.util.ServiceLoader;

public interface PlayerProvider {
    Player player();

    public static Player providePlayer() {
        return ServiceLoader.load(PlayerProvider.class)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("沒有服務提供者"))
                .player();
    }
}
