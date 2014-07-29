package DAO;

import java.util.List;

import DAO.Interface.ILnkordertoproductDao;
import DataBase.Lnkordertoproduct;


public class LnkordertoproductDaoImpl extends BaseHibernateDAO<Lnkordertoproduct> implements ILnkordertoproductDao {

	public Lnkordertoproduct getLnkordertoproductByID(String ID) {
		// TODO Auto-generated method stub
		return (Lnkordertoproduct) super.findByProperty("ID",ID);
	}

	public Lnkordertoproduct getLnkordertoproductByName(String Name) {
		// TODO Auto-generated method stub
		return (Lnkordertoproduct) super.findByProperty("name",Name);
	}

	public Lnkordertoproduct getLnkordertoproductByPhone(String Phone) {
		// TODO Auto-generated method stub
		return (Lnkordertoproduct) super.findByProperty("phone",Phone);
	}

	public boolean saveLnkordertoproduct(Lnkordertoproduct temp) {
		// TODO Auto-generated method stub
		return super.save(temp);
	}

	public boolean updateLnkordertoproduct(Lnkordertoproduct domain) {
		// TODO Auto-generated method stub
		return super.update(domain);
	}

	public boolean delete(Lnkordertoproduct domain) {
		// TODO Auto-generated method stub
		return super.delete(domain);
	}

	public List<Lnkordertoproduct> findAll(String orderby, boolean isAsc) {
		// TODO Auto-generated method stub
		return super.findAll(orderby,isAsc);
	}

	public List<Lnkordertoproduct> findAll(int firstResult, int size,String orderby, boolean isAsc) {
		// TODO Auto-generated method stub
		return super.findAll(firstResult, size,orderby,isAsc);
	}

	public List<Lnkordertoproduct> findByExample(Lnkordertoproduct domain) {
		// TODO Auto-generated method stub
		return super.findByExample(domain);
	}

	
	public List<Lnkordertoproduct> findByProperty(String[] propertyNames, Object[] values) {
		// TODO Auto-generated method stub
		return super.findByProperty(propertyNames, values);
	}

}
