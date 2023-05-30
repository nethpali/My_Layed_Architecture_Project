package bo.Custom;

import Bo1.ItemBo;
import dao.Custom.CustomerDAO;
import dao.Custom.Impl.ItemDAOImpl;
import dao.Custom.ItemDAO;
import dao.DAOFactory;
import model.CustomerDTO;
import model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBoImpl implements ItemBo {
    //ItemDAO itemDAO =new ItemDAOImpl();
    ItemDAO itemDAO = (ItemDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ITEM);
    @Override
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }

    @Override
    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.delete(code);
    }

    @Override
    public boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        // dto.setName(dto.getName()+dto.getAddress());
        return itemDAO.add(dto);
    }

    @Override
    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.update(dto);
    }

    @Override
    public boolean existItem(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.exist(code);
    }

    @Override
    public String generateNewCode() throws SQLException, ClassNotFoundException {
        return  itemDAO.generateNewId();
    }
   /* ItemDAO itemDAO =new ItemDAOImpl();
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }
    public boolean SaveItem(ItemDTO dto ) throws SQLException, ClassNotFoundException {
        // dto.setName(dto.getName()+dto.getAddress());
        return itemDAO.add(dto);
    }
    public boolean UpdateItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.update(dto);
    }
    public boolean existsItem(String id) throws SQLException, ClassNotFoundException {
        return itemDAO.exist(id);
    }
    public String generateNewId() throws SQLException, ClassNotFoundException {
        return  itemDAO.generateNewId();
    }
    public boolean deleteItem(String id) throws SQLException, ClassNotFoundException {
        return itemDAO.delete(id);
    }
    public ItemDTO SearchItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.search(dto.getCode());

    }*/
}
