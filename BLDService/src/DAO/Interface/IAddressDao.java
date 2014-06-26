package DAO.Interface;

import DataBase.Address;

public interface IAddressDao extends IBaseHibernateDAO<Address> {
	Address getAddressByID(String ID);
	Address getAddressByName(String Name);
	Address getAddressByPhone(String Phone);
	boolean saveAddress(Address temp);
	boolean updateAddress(Address domain);
	
}
