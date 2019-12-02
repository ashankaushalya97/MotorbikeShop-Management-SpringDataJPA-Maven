package lk.ijse.dep.rcrmoto.dao.custom;

import lk.ijse.dep.rcrmoto.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersDAO extends JpaRepository<Orders,String> {

    String getLastOrderId()throws Exception;
}
