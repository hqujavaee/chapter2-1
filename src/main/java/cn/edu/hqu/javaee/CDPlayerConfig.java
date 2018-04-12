package cn.edu.hqu.javaee;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import cn.edu.hqu.javaee.domain.cd.CompactDisc;

@Configuration
//根包
//默认情况：扫描本包及其子包
//1.通过basePackages指定所要扫描根包
//2.通过basePackageClasses指定所要扫描根包内的一个类，用于说明所要扫描的包
@ComponentScan(basePackageClasses= {CompactDisc.class})
public class CDPlayerConfig {

}
