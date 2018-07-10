package io.pivotal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FortuneTests {

    @Test
    public void contextLoads(){}

    @Test
    public void fail(){
        assert 1 == 1;
    }

}
