package dao.Custom;

import dao.CrudDAO;
import db.DBConnection;
import model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO extends CrudDAO<ItemDTO,String> {
   /* public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;

    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException;

    public boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;

    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;
    public boolean existItem(String code) throws SQLException, ClassNotFoundException ;
    public String generateNewCode() throws SQLException, ClassNotFoundException ;

    public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException ;*/
}
