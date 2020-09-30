package Employees;
import java.util.List;    
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.PathVariable;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Employees.EmpPojo;    
import Employees.EmpDao;    

@Controller    
public class EmpController {
	
	@Autowired    
    EmpDao dao;
     
 
    @RequestMapping(value="/empform",method=RequestMethod.GET)
	public ModelAndView Showform()
	{
		return new ModelAndView("empform","command",new EmpPojo());
	}
    
    
    
    @RequestMapping(value="/save",method = RequestMethod.GET)    
    public String save(@ModelAttribute("emp") EmpPojo emp){    
        dao.save(emp);    
        return "redirect:/viewemp";   
    }    
    
    @RequestMapping("/viewemp")    
    public String viewemp(Model m){    
        List<EmpPojo> list=dao.getEmployees();    
        m.addAttribute("list",list);  
        return "viewemp";    
    }    
      
    @RequestMapping(value="/editemp/{id}")    
    public String edit(@PathVariable int id, Model m){    
        EmpPojo emp=dao.getEmpById(id);    
        m.addAttribute("command",emp);  
        return "empeditform";    
    }    
     
    @RequestMapping(value="/editsave",method = RequestMethod.GET)    
    public String editsave(@ModelAttribute("emp") EmpPojo emp){    
        dao.update(emp);    
        return "redirect:/viewemp";    
    }    
    
    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        dao.delete(id);    
        return "redirect:/viewemp";    
    }     

}
