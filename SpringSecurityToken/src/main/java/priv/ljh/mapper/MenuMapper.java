package priv.ljh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import priv.ljh.utils.Menu;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu> {

    List<String> selectPermsByUserId(Long userid);
}
