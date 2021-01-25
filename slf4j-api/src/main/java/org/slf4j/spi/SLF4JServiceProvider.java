package org.slf4j.spi;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.LoggerFactory;

/**该接口基于ServiceLoader(SPI)规范
 * This interface based on {@link java.util.ServiceLoader} paradigm. 
 * 
 * <p>It replaces the old static-binding mechanism used in SLF4J versions 1.0.x to 1.7.x.
 *
 * @author Ceki G&uml;lc&uml;
 * @since 1.8
 */
public interface SLF4JServiceProvider {

    
    /**
     * Return the instance of {@link ILoggerFactory} that 
     * {@link org.slf4j.LoggerFactory} class should bind to.
     * 返回ILoggerFactory的实现类
     * 用于LoggerFactory类的绑定
     * @return instance of {@link ILoggerFactory}   ILoggerFactory的实现类
     */
    public ILoggerFactory getLoggerFactory();
    
    /**
     * Return the instance of {@link IMarkerFactory} that 
     * {@link org.slf4j.MarkerFactory} class should bind to.
     * 用于标记的
     * @return instance of {@link IMarkerFactory} 
     */
    public IMarkerFactory getMarkerFactory();
    
    /**
     * Return the instnace of {@link MDCAdapter} that
     * {@link MDC} should bind to.
     * 获得一条日子从开始到结束整个日志的唯一标识识别器
     * @return instance of {@link MDCAdapter} 
     */
    public MDCAdapter getMDCAdapter();
    
    public String getRequesteApiVersion();
    
    /**
     * Initialize the logging back-end.
     * 初始化，实现类中一般用于初始化ILoggerFactory等
     * <p><b>WARNING:</b> This method is intended to be called once by 
     * {@link LoggerFactory} class and from nowhere else. 
     * 
     */
    public void initialize();
}
