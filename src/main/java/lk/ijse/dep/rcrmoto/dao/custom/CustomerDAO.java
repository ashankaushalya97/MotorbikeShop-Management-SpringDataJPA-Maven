package lk.ijse.dep.rcrmoto.dao.custom;

import lk.ijse.dep.rcrmoto.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerDAO extends JpaRepository<Customer,String> {

    String getLastCustomerId()throws Exception;

    List<Customer> searchCustomers(String text)throws Exception;
}
