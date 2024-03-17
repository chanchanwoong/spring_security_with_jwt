package com.chanwoong.springsecurywithjwt.controller;

import com.chanwoong.springsecurywithjwt.dto.JoinDto;
import com.chanwoong.springsecurywithjwt.service.JoinService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class JoinController {
    private final JoinService joinService;

    @Operation(summary = "회원가입", description = "회원가입", tags = {"User Sign"})
    @PostMapping("/join")
    public String joinProcess(JoinDto joinDto) {
        joinService.joinProcess(joinDto);
        return "ok";
    }
}
