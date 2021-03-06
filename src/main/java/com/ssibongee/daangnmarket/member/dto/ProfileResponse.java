package com.ssibongee.daangnmarket.member.dto;

import com.ssibongee.daangnmarket.member.domain.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@RequiredArgsConstructor
public class ProfileResponse {

    private final String email;
    private final String nickname;

    public static ProfileResponse of(Member member) {
        return ProfileResponse.builder()
                .email(member.getEmail())
                .nickname(member.getNickname())
                .build();
    }
}
