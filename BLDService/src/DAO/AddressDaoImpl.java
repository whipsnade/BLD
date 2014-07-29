package DAO;

import java.util.List;

import DAO.Interface.IAddressDao;
import DataBase.Address;
import DataBase.Classid;
import DataBase.User;

public class AddressDaoImpl extends BaseHibernateDAO<Address> implements IAddressDao {

	public Address getAddressByID(String ID) {
		// TODO Auto-generated method stub
		return (Address) super.findByProperty("ID",ID);
	}

	public Address getAddressByName(String Name) {
		// TODO Auto-generated method stub
		return (Address) super.findByProperty("name",Name);
	}

	public Address getAddressByPhone(String Phone) {
		// TODO Auto-generated method stub
		return (Address) super.findByProperty("phone",Phone);
	}

	public boolean saveAddress(Address temp) {
		// TODO Auto-generated method stub
		return super.save(temp);
	}

	public boolean updateAddress(Address domain) {
		// TODO Auto-generated method stub
		return super.update(domain);
	}

	public boolean delete(Address domain) {
		// TODO Auto-generated method stub
		return super.delete(domain);
	}

	public List<Address> findAll(String orderby, boolean isAsc) {
		// TODO Auto-generated method stub
		return super.findAll(orderby,isAsc);
	}

	public List<Address> findAll(int firstResult, int size,String orderby, boolean isAsc) {
		// TODO Auto-generated method stub
		return super.findAll(firstResult, size,orderby,isAsc);
	}

	public List<Address> findByExample(Address domain) {
		// TODO Auto-generated method stub
		return super.findByExample(domain);
	}

	
	public List<Address> findByProperty(String[] propertyNames, Object[] values) {
		// TODO Auto-generated method stub
		return super.findByProperty(propertyNames, values);
	}

}
