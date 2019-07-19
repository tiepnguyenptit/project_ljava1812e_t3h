package application.controller.web;

import application.constant.CompanyConstant;
import application.data.model.Cart;
import application.data.service.CartService;
import application.data.service.UserService;
import application.model.viewmodel.common.HeaderMenuVM;
import application.model.viewmodel.common.LayoutHeaderVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BaseController {

    @Autowired
    private CartService cartService;

    @Autowired
    private UserService userService;

    public LayoutHeaderVM getLayoutHeaderVM() {
        LayoutHeaderVM vm = new LayoutHeaderVM();
        ArrayList<HeaderMenuVM> headerMenuVMArrayList = new ArrayList<>();
        headerMenuVMArrayList.add(new HeaderMenuVM("Home", "/"));
        headerMenuVMArrayList.add(new HeaderMenuVM("Contact", "/"));
        headerMenuVMArrayList.add(new HeaderMenuVM("Cart", "/cart"));

        vm.setHeaderMenuVMArrayList(headerMenuVMArrayList);
        vm.setCompanyName(CompanyConstant.NAME);

        return vm;
    }

}
