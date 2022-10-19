package com.six.ms.member;

import com.six.ms.entity.Member;
import com.six.ms.entity.MemberPoint;
import com.six.ms.repository.MemberPointRepository;
import com.six.ms.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MemberSaveTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberPointRepository memberPointRepository;


    @Test
    public void memberResistTest() {
        MemberPoint memberPoint = new MemberPoint();
        memberPoint.setPoint(0);

        memberPointRepository.save(memberPoint);

        Member member = new Member("aaa", "aaa", memberPoint);

        memberRepository.save(member);

    }


}
