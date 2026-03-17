package com.ashu.Assignment4_Spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"service","repository","com.ashu"})
public class SpringConf {

}