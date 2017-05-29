package petclinic.tests;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import petclinic.repositories.VetRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductionConfigurationTests {

    @Autowired
    private VetRepository vets;

    @Test
    public void testFindAll() throws Exception {
        vets.findAll();
        vets.findAll(); // served from cache
    }
}
