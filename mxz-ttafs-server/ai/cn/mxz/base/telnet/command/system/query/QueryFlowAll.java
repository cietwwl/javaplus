package cn.mxz.base.telnet.command.system.query;

import java.util.Collection;

import org.springframework.stereotype.Component;

import cn.mxz.base.telnet.command.system.AbstractQueryFlow;
import cn.mxz.base.world.World;
import cn.mxz.city.City;

/**
 * 查询所有玩家的流量使用情况
 * @author 林岑
 *
 */
@Component("telnetCommand:queryflow")

public class QueryFlowAll extends AbstractQueryFlow {

	@Override
	protected Collection<City> getCitys(World world) {

		return world.getAll();
	}

}
