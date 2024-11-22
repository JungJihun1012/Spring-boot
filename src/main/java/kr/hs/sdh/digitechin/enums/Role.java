package kr.hs.sdh.digitechin.enums;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUST("ROLE_GUEST", "Guest"),
    USER("ROLE_USER", "Common User");

    private final String key;
    private final String title;



}
