package pl.sampakdev.EcommerceShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import pl.sampakdev.EcommerceShop.models.Item;
import pl.sampakdev.EcommerceShop.repository.ItemRepository;

@Configuration
public class DBinit implements CommandLineRunner {

    @Autowired
    ItemRepository itemRepository;



    @Override
    public void run(String... args) throws Exception {
//        itemRepository.save(new Item("test", 100));
    }
}
