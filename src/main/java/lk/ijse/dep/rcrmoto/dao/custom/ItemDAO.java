package lk.ijse.dep.rcrmoto.dao.custom;

import lk.ijse.dep.rcrmoto.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemDAO extends JpaRepository<Item,String> {

    String getLastItemId() throws Exception;

    List<Item> searchItems(String text)throws Exception;

}
