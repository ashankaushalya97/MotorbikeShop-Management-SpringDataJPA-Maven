package lk.ijse.dep.rcrmoto.dao.custom;

import lk.ijse.dep.rcrmoto.entity.Delivery;
import lk.ijse.dep.rcrmoto.entity.DeliveryPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeliveryDAO extends JpaRepository<Delivery, DeliveryPK> {

    String getLastDeliveryId()throws Exception;

    List<Delivery> searchDelivery(String text)throws Exception;
}
