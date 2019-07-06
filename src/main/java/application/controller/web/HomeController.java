package application.controller.web;

import application.model.viewmodel.home.BannerVM;
import application.model.viewmodel.home.HomeLandingVM;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;


@Controller
public class HomeController extends BaseController {

    @GetMapping(value = "/")
    public String home(Model model){

        HomeLandingVM vm = new HomeLandingVM();

        vm.setLayoutHeaderVM(this.getLayoutHeaderVM());

        ArrayList<BannerVM> listBanners = new ArrayList<>();
        listBanners.add(new BannerVM("", "Text 1","https://forums.oscommerce.com/uploads/monthly_04_2016/post-336856-0-18918000-1459704022.jpg"));
        listBanners.add(new BannerVM("", "Text 2","http://bisnis.pnb.ac.id/skins/Standard/img/alila/03.jpg"));

        vm.setBannerVMS(listBanners);
        model.addAttribute("vm",vm);

        return "home";
    }


}
