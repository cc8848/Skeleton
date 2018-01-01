package com.nepxion.skeleton.springcloud.generator.client.java;

/**
 * <p>Title: Nepxion Skeleton</p>
 * <p>Description: Nepxion Skeleton For Freemarker</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

import com.nepxion.skeleton.engine.constant.SkeletonConstant;
import com.nepxion.skeleton.engine.generator.SkeletonJavaGenerator;
import com.nepxion.skeleton.engine.property.SkeletonProperties;

public class ClientRpcTestClassGenerator extends SkeletonJavaGenerator {
    public ClientRpcTestClassGenerator(String generatePath, String projectType, String prefixTemplatePath, String reducedTemplatePath, SkeletonProperties skeletonProperties) {
        super(generatePath, projectType, prefixTemplatePath, reducedTemplatePath, ClientRpcTestClassGenerator.class, skeletonProperties);
    }

    @Override
    protected String getPackage() {
        return super.getPackage() + ".test";
    }

    @Override
    protected String getClassName() {
        return "ClientRpcTest";
    }

    @Override
    protected String getTemplateName() {
        return "ClientRpcTest.java.template";
    }

    @Override
    protected boolean isMainCode() {
        return true;
    }

    @Override
    protected Object getDataModel() {
        Map<String, Object> dataModel = new HashMap<String, Object>();
        dataModel.put(SkeletonConstant.PACKAGE, getPackage());
        dataModel.put(SkeletonConstant.BASE_PACKAGE, super.getPackage());

        return dataModel;
    }
}