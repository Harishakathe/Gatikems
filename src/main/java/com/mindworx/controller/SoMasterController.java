package com.mindworx.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mindworx.model.ConsigneeMaster;
import com.mindworx.model.CustomOption;
import com.mindworx.model.IntfstgInbso;
import com.mindworx.model.PoHead;
import com.mindworx.model.SoHead;
import com.mindworx.service.IntfstgInbsoService;

@Controller
public class SoMasterController {
	
	protected Log log = LogFactory.getLog(this.getClass());
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	@Autowired
	private IntfstgInbsoService intfstgInbsoService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {	    
	    dateFormat.setLenient(false);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping(value = "/so-master", method = RequestMethod.GET)	  
	public ModelAndView soForm() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("so-form");
		List<CustomOption> sku_list = intfstgInbsoService.getSkuByCompId("GKW0000006");
		modelAndView.addObject("sku_list", sku_list);
		List<CustomOption> uom_list = intfstgInbsoService.getUomByCompId("GKW0000006");
		modelAndView.addObject("uom_list", uom_list);
		return modelAndView;
	}
	
	@RequestMapping(value = "/so-master", method = RequestMethod.POST)	  
	public String soFormProcess(@ModelAttribute("soHead")@Valid SoHead soHead, BindingResult result,Model model,Errors errors) {
		log.info("Submit soFormProcess:"+soHead.toString());
		if(result.hasErrors()){			
			log.info("Error in Form Submission"+result.toString());		
			return "so-form";
		}else{
			model.addAttribute("soHead",soHead);
			return "so-form-confirm";
		}
	}
	
	@RequestMapping(value = "/so-masterdo", method = RequestMethod.POST)	  
	public String soFormProcessDo(@ModelAttribute("soHead")@Valid SoHead soHead, BindingResult result,RedirectAttributes redirectAttributes) {
		log.info("Submit soFormProcess:"+soHead.toString());
		if(result.hasErrors()){			
			redirectAttributes.addFlashAttribute("success", "false");			
		}else{
			intfstgInbsoService.create(soHead);
			redirectAttributes.addFlashAttribute("success", "true");
			redirectAttributes.addFlashAttribute("massage", "Order No:<b>"+soHead.getOrdNo()+"</b> is Generated Successfully.");
		}
		return "redirect:so-master";
	}
	
	@RequestMapping(value = "/getSoDetails", method = RequestMethod.POST)
    public ResponseEntity<String> getSoDetails(@RequestParam String so_no) {
		if(intfstgInbsoService.getSoHead(so_no)!=null){
			return new ResponseEntity<String>(intfstgInbsoService.getSoHead(so_no).toString(), HttpStatus.OK);
		}
    	return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }
	
	@RequestMapping(value = "/getConsigneeList", method = RequestMethod.GET)
	public ResponseEntity<List<ConsigneeMaster>> getConsigneeList(@RequestParam("query") String query) {
		
		List<ConsigneeMaster> list = intfstgInbsoService.getConsigneeList(query);
		
		if(list!=null){
			return new ResponseEntity<List<ConsigneeMaster>>(list, HttpStatus.OK);
		}
    	return new ResponseEntity<List<ConsigneeMaster>>(HttpStatus.BAD_REQUEST);
    }
	
	@RequestMapping(value = "/getSoNoList", method = RequestMethod.POST)
	public ResponseEntity<List<SoHead>> getSoNoList( @RequestParam String fromDate, @RequestParam String toDate) throws ParseException {
		
		List<SoHead> list = intfstgInbsoService.getSoNoList(dateFormat.parse(fromDate),dateFormat.parse(toDate));
		
		if(list!=null){
			return new ResponseEntity<List<SoHead>>(list, HttpStatus.OK);
		}
    	return new ResponseEntity<List<SoHead>>(HttpStatus.BAD_REQUEST);
    }
	
	@RequestMapping(value = "/getSkuList", method = RequestMethod.GET)
	public ResponseEntity<List<CustomOption>> getSkuList(){
		
		List<CustomOption> list = intfstgInbsoService.getSkuByCompId("GKW0000006");
		
		if(list!=null){
			return new ResponseEntity<List<CustomOption>>(list, HttpStatus.OK);
		}
    	return new ResponseEntity<List<CustomOption>>(HttpStatus.BAD_REQUEST);
    }
		
}
