package com.example.demo.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.InventoryUtil;
import com.example.demo.Product;
import com.example.demo.ProductRepository;

@Controller
public class GreetingController {
    @Autowired
    private ProductRepository productRepository;

	@RequestMapping(value="/", method = RequestMethod.GET)  
	public String index(){  
		return "index";  
	}  
	
	@RequestMapping(value = "/uploadInventory", method = RequestMethod.GET)
	public ModelAndView uploadInventory(){  
		return new ModelAndView("uploadInventory", "command", new Product());
	}
	
	@RequestMapping(value="/uploadComplete", method = RequestMethod.POST)  
	public String uploadComplete(@RequestParam("file") MultipartFile file, Model model) { 
		final String type = "text/csv";
		//final String[] headers = { "Id", "Title", "Description", "Published" };
		List<Product> productList = new ArrayList<>();
		if(InventoryUtil.hasCSVFormat(file, type)) {
		try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(file.getInputStream(), "UTF-8"));
		      CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {
			      Iterable<CSVRecord> csvRecords = csvParser.getRecords();
			      for (CSVRecord csvRecord : csvRecords) {
			    	  String test = csvRecord.get(0);
			    	  Product product = new Product(
		              //Integer.parseInt(csvRecord.get("id")),
		              csvRecord.get(0),
		              csvRecord.get(1),
		              new BigDecimal(csvRecord.get(2)),
		              Integer.parseInt(csvRecord.get(3)),
		              Integer.parseInt(csvRecord.get(4)),
		              csvRecord.get(5)
	    			  );
	
			    	  productList.add(product);
			      }	
			      productRepository.saveAll(productList);
	    } catch (IOException e) {
	      throw new RuntimeException("fail to store CSV file: " + e.getMessage());
	    }
			productList = productRepository.findAll();
			model.addAttribute("productList", productList);
			
			return "uploadComplete"; 
		}else {
			return "uploadFail";
		}
	}
	
	@RequestMapping(value = "/searchInventory", method = RequestMethod.GET)
	public ModelAndView searchInventory(){  
		return new ModelAndView("searchInventory", "command", new Product());
	}
	
	@RequestMapping(value = "/inventoryList", method = RequestMethod.POST)
	public String inventoryList(@ModelAttribute Product product, Model model) { 
		System.out.println(product.getProductId());
		List<Product> products = productRepository.findByProductId(product.getProductId());
		System.out.println("Product: "+ products);
		model.addAttribute("product", products);
		
		return "inventoryList";  
	}
	
	@RequestMapping(value = "/updateInventoryForm", method = RequestMethod.GET)
	public ModelAndView updateInventory(){  
		return new ModelAndView("updateForm", "command", new Product());
	}
	
	@RequestMapping(value = "/updateComplete", method = RequestMethod.POST)
	public String updateComplete(@ModelAttribute Product product, Model model) { 
		System.out.println(product.getProductId());
		String productId = product.getProductId();
		int quantity = product.getQuantity();
		String location = product.getLocation();
		List<Product> products = productRepository.findByProductId(productId);
		System.out.println("Product: "+ products);
		for(Product item:products) {
			item.setQuantity(quantity);
			item.setLocation(location);
			productRepository.save(item);
		}
		List<Product> productsNew = productRepository.findByProductId(productId);
		model.addAttribute("product", productsNew);
		return "updateComplete";  
	}
}