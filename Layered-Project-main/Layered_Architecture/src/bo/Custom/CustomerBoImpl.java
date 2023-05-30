package bo.Custom;

import Bo1.CustomerBo;
import dao.Custom.CustomerDAO;
import dao.Custom.Impl.CustomerDAOImpl;
import dao.DAOFactory;
import model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBoImpl implements CustomerBo{
   //CustomerDAO customerDAO=new CustomerDAOImpl();
    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    @Override
    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException {
        return customerDAO.getAll();
    }

    @Override
    public boolean addCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        // dto.setName(dto.getName()+dto.getAddress());
        return customerDAO.add(dto);
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return customerDAO.update(dto);
    }

    @Override
    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException {
        return  customerDAO.exist(id);
    }

    @Override
    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.delete(id);
    }

    @Override
    public String generateNewCustomerID() throws SQLException, ClassNotFoundException {
        return  customerDAO.generateNewId();
    }
   /* CustomerDAO customerDAO=new CustomerDAOImpl();
    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException {
        return customerDAO.getAll();
    }
    public boolean SaveCustomer(CustomerDTO dto ) throws SQLException, ClassNotFoundException {
        // dto.setName(dto.getName()+dto.getAddress());
        return customerDAO.add(dto);
    }
    public boolean UpdateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return customerDAO.update(dto);
    }
    public boolean existsCustomer(String id) throws SQLException, ClassNotFoundException {
        return  customerDAO.exist(id);
    }
    public String generateNewId() throws SQLException, ClassNotFoundException {
        return  customerDAO.generateNewId();
    }
    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.delete(id);
    }
    public CustomerDTO SearchCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        return customerDAO.search(customerDTO.getId());

    }*/

}
