package Wku.OSS.Service;

import Wku.OSS.Repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserInfoService {

    private final UserInfoRepository userInfoRepository;

    public String login(String id, String pw){

        System.out.println(id);
        System.out.println(pw);

        return "success";
    }
}
