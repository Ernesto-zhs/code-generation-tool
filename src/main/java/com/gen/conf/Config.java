package com.gen.conf;

/**
 * Created by caowei on 2017/8/31.
 */
public interface Config {

    /**
     * 生成的接口根uri
     */
    String parentUri = "/admin";
    /**
     * 项目基本包名
     */

    String basePackage = "com.shadow";

    /**
     * 异常名称
     */
    String exceptionName = "Exception";

    /**
     * 项目路径
     */
    String projectName = "shadow-api";
    String projectPath = "F:/CodeGeneratePath/";

    /**
     * 项目名称
     */

    /**
     * 操作人
     */
    String optName = "曾怀松";

    /**
     * dao模块名称
     */
    String daoModuleName = projectName + "-dao";

    /**
     * domain模块名称
     */
    String domainModuleName = projectName + "-domain";

    /**
     * service模块名称
     */
    String serviceModuleName = projectName + "-service";

    /**
     * web模块名称
     */
    String webModuleName = projectName + "-web";


    /**
     * 异常类所在包
     */
    String exceptionPackage = basePackage + ".domain.exception";

    /**
     * 返回的包装类名称
     */
    String responseEntityName = "ResponseEntity";

    /**
     * 返回的包装类路径
     */
    String responseEntityPackage = basePackage + ".response";

    /**
     * 代码路径
     */
    String javaPath = "/src/main/java/";

    /**
     * 资源路径
     */
    String resourcePath = "/src/main/resources/";

    /**
     * Po包名
     */
    String poPackage = basePackage + ".domain.po";

    /**
     * Condition包名
     */
    String conditionPackage = basePackage + ".domain.condition";

    /**
     * Form包名
     */
    String formPackage = basePackage + ".form";


    /**
     * Mapper.java包名
     */
    String mapperJavaPackage = basePackage + ".dao.mapper";

    /**
     * Service.java包名
     */
    String servicePackage = basePackage + ".service";

    /**
     * ServiceImp.java包名
     */
    String serviceImplPackage = servicePackage + ".impl";

    /**
     * Vo包名
     */
    String voPackage = basePackage + ".vo";

    /**
     * Controller包名
     */
    String controllerPackage = basePackage + ".controller";


    /**
     * Mapper.xml路径
     */
    String mapperXMLPath = projectPath + daoModuleName + resourcePath + mapperJavaPackage.replaceAll("\\.", "/") + "/";

    /**
     * Mapper.java文件路径
     */
    String mapperJavaPath = projectPath + daoModuleName + javaPath + mapperJavaPackage.replaceAll("\\.", "/") + "/";

    /**
     * Service.java文件路径
     */
    String servicePath = projectPath + serviceModuleName + javaPath + servicePackage.replaceAll("\\.", "/") + "/";

    /**
     * ServiceImp.java文件路径
     */
    String serviceImplPath = servicePath + "impl/";

    /**
     * Controller.java文件路径
     */
    String controllerPath = projectPath + webModuleName + javaPath + controllerPackage.replaceAll("\\.", "/") + "/";



}
