package dao.Custom;

import dao.CrudDAO;
import db.DBConnection;
import model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface OrderDetailsDAO extends CrudDAO<OrderDetailDTO,String> {
   /* public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;*/
}
