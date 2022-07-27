package com.customer.customer.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.customer.customer.entity.Customerquries1;
import com.customer.customer.entity.Customer;
import com.customer.customer.service.Customerservice;
import com.customer.customer.service.customerquries;
@Controller
public class Customercontroller {
	@Autowired
	private customerquries queryService;
	@Autowired
	private Customerservice bservice;
	
	@RequestMapping("customerhome")
	public String getcustomerhome()
	{
		return "customerhome.jsp";
	}
	
	
	@RequestMapping("addcustomer")
	@ResponseBody
	public String addcustomer(Customer b)
	{
		return bservice.addcustomer(b);
	}
	
	@RequestMapping("viewcustomer")
	public ModelAndView viewcustomer(int customerid)
	{
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("displaycustomer.jsp");
		mvc.addObject("mode", "single");
		
		Customer b = bservice. viewcustomer( customerid);
		if(b != null)
		{
				mvc.addObject("flag", true);
				mvc.addObject("result",b);
				return mvc;
		}
		
		mvc.addObject("flag", false);
		mvc.addObject("result", "customer not found...");
		return mvc;
	}
	
	@RequestMapping("viewAllcustomer")
	public ModelAndView viewAllcustomer()
	{
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("displaycustomer.jsp");
		
		mvc.addObject("mode", "list");
		mvc.addObject("result",bservice.viewAllcustomer());
		return mvc;
	}
	
	@RequestMapping("updatecustomer")
	@ResponseBody
	public String updatecustomer(Customer b)
	{	
		return bservice.updatecustomer(b);	
	}
	
	@RequestMapping("deletecustomer")
	@ResponseBody
	public String deletecustomer(int customerid)
	{
		return bservice.deletcustomer(customerid);
	}
	
	@RequestMapping("addcustomerquries")
	@ResponseBody
	public String customerquries(Customerquries1 p)
	{
		return queryService.addCustomerquries(p);
	}

	@RequestMapping("viewQueries")
	public ModelAndView viewCustomerQueries()
	{
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("displayqueries.jsp");
		
		mvc.addObject("result",queryService.viewAllQueries());
		return mvc;
	}
	
}
	




