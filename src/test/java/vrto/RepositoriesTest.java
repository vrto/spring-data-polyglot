package vrto;

import org.hamcrest.core.IsNot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DbConfig.class})
public class RepositoriesTest {

    @Autowired
    JavaRepo javaRepo;

    @Autowired
    GroovyRepo groovyRepo;

    @Test
    public void usersExists() {
        assertThat(javaRepo.findByParams(1L, "Michal", "Vrtiak"), IsNot.not(nullValue()));
        assertThat(groovyRepo.findByParams(1L, "Michal", "Vrtiak"), IsNot.not(nullValue()));
    }
}
