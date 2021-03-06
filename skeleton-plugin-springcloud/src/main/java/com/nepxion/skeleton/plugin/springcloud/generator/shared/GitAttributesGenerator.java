package com.nepxion.skeleton.plugin.springcloud.generator.shared;

/**
 * <p>Title: Nepxion Skeleton</p>
 * <p>Description: Nepxion Skeleton For Freemarker</p>
 * <p>Copyright: Copyright (c) 2017-2020</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import com.nepxion.skeleton.engine.context.SkeletonContext;
import com.nepxion.skeleton.engine.generator.SkeletonFileGenerator;
import com.nepxion.skeleton.engine.property.SkeletonProperties;

public class GitAttributesGenerator extends SkeletonFileGenerator {
    public GitAttributesGenerator(SkeletonContext skeletonContext, SkeletonProperties skeletonProperties, String projectType) {
        super(skeletonContext.clone(projectType, GitAttributesGenerator.class), skeletonProperties);
    }

    @Override
    protected String getFileName() {
        return ".gitattributes";
    }

    @Override
    protected String getTemplateName() {
        return "file.gitattributes.template";
    }

    @Override
    protected Object getDataModel() {
        return null;
    }
}