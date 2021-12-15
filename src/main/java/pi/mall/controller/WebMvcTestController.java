package pi.mall.controller;
import pi.mall.entity.SaleGoods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebMvcTestController {
  @RequestMapping("/test/type/conversion")
  public void typeConversionTest(String goodsName, float weight, int type, Boolean onSale) {
    System.out.println("goodsName:" + goodsName);
    System.out.println("weight:" + weight);
    System.out.println("type:" + type);
    System.out.println("onSale:" + onSale);
  }

  @RequestMapping(value = "/test/httpmessageconverter", method = RequestMethod.POST)
  @ResponseBody
  public SaleGoods httpMessageConverterTest(@RequestBody SaleGoods saleGoods) {
    System.out.println(saleGoods.toString());
    saleGoods.setType(saleGoods.getType() + 1);
    saleGoods.setGoodsName("商品名：" + saleGoods.getGoodsName());
    return saleGoods;
  }
}
