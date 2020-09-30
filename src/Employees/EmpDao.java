package Employees;

import java.util.List;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;    
import Employees.EmpPojo;    
public class EmpDao {
	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int save(EmpPojo p){    
		
	    String sql="insert into Employees(ENAME,EDES,SAL) values('"+p.getEname()+"','"+p.getEdes()+"','"+p.getSal()+"')";    
	    return template.update(sql);    
	}    
	public int update(EmpPojo p){    
	    String sql="update Employees set Ename='"+p.getEname()+"',Edes='"+p.getEdes()+"', Sal= '"+p.getSal()+"' where id="+p.getId()+"";    
	    return template.update(sql);    
	}    
	public int delete(int id){    
	    String sql="delete from Employees where id="+id+"";    
	    return template.update(sql);    
	}    
	public EmpPojo getEmpById(int id){    
	    String sql="select * from Employees where id=?";    
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<EmpPojo>(EmpPojo.class));    
	}    
	public List<EmpPojo> getEmployees(){    
	    return template.query("select * from Employees",new RowMapper<EmpPojo>(){    
	        public EmpPojo mapRow(ResultSet rs, int row) throws SQLException {    
	            EmpPojo e=new EmpPojo();    
	            e.setId(rs.getInt(1));    
	            e.setEname(rs.getString(2));    
	            e.setEdes(rs.getString(3));    
	            e.setSal(rs.getInt(4));    
	            return e;    
	        }    
	    });    
	}    

}
