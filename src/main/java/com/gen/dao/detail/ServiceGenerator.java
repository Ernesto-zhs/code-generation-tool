package com.gen.dao.detail;

import com.gen.conf.Config;
import com.gen.dao.DatabaseTableInfo;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.sql.SQLException;
import java.util.Date;


/**
 * 生成Service.java
 *
 * Created by caowei on 2017/8/31.
 */
public class ServiceGenerator {



	
	public String generate(DatabaseTableInfo dbTableInfo) throws SQLException {

		String poClassName=dbTableInfo.getPo().getClassName();
		String conditionClassName=dbTableInfo.getCondition().getClassName();

		StringBuffer data = new StringBuffer();

		data.append("package " + Config.servicePackage + ";\r\n\r\n")
				.append("import " + dbTableInfo.getPo().getPackageName() + "." + poClassName + ";\r\n")
				.append("import " + dbTableInfo.getCondition().getPackageName() + "." + conditionClassName + ";\r\n\n")
				.append("/**\n")
				.append(" * " + dbTableInfo.getTableComment() + "业务逻辑接口\n")
				.append(" * Created by " + Config.optName + " on " + DateFormatUtils.format(new Date(), "yyyy-MM-dd") + ".\n")
				.append(" */\n")
				.append("public interface " + dbTableInfo.getServiceClassName() + " extends BaseService<" + poClassName + ", " + conditionClassName + "> {\r\n\r\n")

		.append("}");

		return data.toString();
	}



}
