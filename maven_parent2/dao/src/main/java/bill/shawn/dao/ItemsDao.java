package bill.shawn.dao;

import bill.shawn.domain.Items;
import org.springframework.stereotype.Repository;

/*
* 操作商品信息
* */
@Repository
public interface ItemsDao {
    /*
    * 根据id查询用户信息
    * */
    bill.shawn.domain.Items findById(Integer id);
}
