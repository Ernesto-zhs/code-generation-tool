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
public class ServiceImplGenerator {

	
	public String generate(DatabaseTableInfo dbTableInfo) throws SQLException {

		String poClassName=dbTableInfo.getPo().getClassName();
		String conditionClassName=dbTableInfo.getCondition().getClassName();

		StringBuffer data = new StringBuffer();

		data.append("package " + Config.serviceImplPackage + ";\r\n\r\n")
				.append("import " + dbTableInfo.getPo().getPackageName() + "." + poClassName + ";\r\n")
				.append("import " + dbTableInfo.getCondition().getPackageName() + "." + conditionClassName + ";\r\n")
				.append("import " + Config.mapperJavaPackage + "." + dbTableInfo.getMapperClassName() + ";\r\n");
		if (!Config.serviceImplPackage.equals(Config.servicePackage)) {
			data.append("import " + Config.servicePackage + "." + dbTableInfo.getServiceClassName() + ";\r\n");
		}

		data.append("import org.springframework.stereotype.Service;\r\n\r\n");
		data.append("/**\n");
		data.append(" * " + dbTableInfo.getTableComment() + "业务逻辑接口实现\n");
		data.append(" * Created by " + Config.optName + " on " + DateFormatUtils.format(new Date(), "yyyy-MM-dd") + ".\n");
		data.append(" */\n");
		data.append("@Service\r\n")
				.append("public class " + dbTableInfo.getServiceImplClassName() + " extends BaseServiceImpl<" + poClassName + ", " + conditionClassName + ", " + dbTableInfo.getMapperClassName() + "> implements " + dbTableInfo.getServiceClassName() + " {\r\n\r\n")

		.append("}");

		return data.toString();
	}



}
