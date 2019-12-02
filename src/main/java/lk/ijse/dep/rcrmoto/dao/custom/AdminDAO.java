package lk.ijse.dep.rcrmoto.dao.custom;

import lk.ijse.dep.rcrmoto.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDAO extends JpaRepository<Admin,String> {

    boolean authentication(Admin admin)throws Exception;
}
