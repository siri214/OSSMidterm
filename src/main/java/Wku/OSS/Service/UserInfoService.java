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

    public String logout(){

        System.out.println("logout");

        return "logout";
    }

    public String sayHello(){

        System.out.println("say Hello");
        System.out.println("fixed");
        return "";
    }

    public String datacheck(String data){

        if(data.trim().equals("success")){
            System.out.println("fail");

            return "fail";
        }

        return "success";
    }
}
