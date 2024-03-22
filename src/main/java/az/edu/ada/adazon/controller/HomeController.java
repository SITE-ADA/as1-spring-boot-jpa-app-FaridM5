package az.edu.ada.adazon.controller;

import az.edu.ada.adazon.product.InitialProductCountHolder;
import az.edu.ada.adazon.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    private final ProductService productService;

    @Autowired
    public HomeController(ProductService productService) {
        this.productService = productService;
    }

    @Autowired
    private InitialProductCountHolder initialProductCountHolder;

    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("initialProductCount", initialProductCountHolder.getInitialProductCount());
        System.out.println(initialProductCountHolder.getInitialProductCount());
        model.addAttribute("products", productService.findAllProducts());
        return "index";
    }
}








