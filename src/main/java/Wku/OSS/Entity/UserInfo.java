package Wku.OSS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserInfo {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uid;

    private String content;
}
