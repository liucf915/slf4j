package org.slf4j;

/**
 * @author liuchangfu@easyretailpro.com
 * @version 1.0
 * @date 2021/1/21 17:56
 */
public class Demo {
  public static void main(String[] args) {
    //工厂类的静态方法获取日志对象的一个实例("demo")
    Logger logger = LoggerFactory.getLogger(Demo.class);
    logger.info("Hello SLF4J.............");
    System.out.println("============================");
  }
}
