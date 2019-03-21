package bill.shawn.web;

import bill.shawn.domain.Items;
import bill.shawn.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/itemsController")
public class ItemsController {
///itemsController/findDetail
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findDetail")
    public String findDetail(Model model){
        Items item = itemsService.findById(1);
         model.addAttribute("item",item);
        return "itemDetail";
    }


}
