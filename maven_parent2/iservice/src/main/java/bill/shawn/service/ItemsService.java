package bill.shawn.service;

import bill.shawn.domain.Items;

/*
* 操作商品信息
* */
public interface ItemsService  {

    /*
    * 通过id查询商品信息
    * */
    public Items findById(Integer id);

}
