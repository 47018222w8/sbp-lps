package com.wq.sbp.service;

/**
 * Dto转换为Do函数式接口
 * 
 *
 * @author zwq
 * @date 2017年10月18日
 */
@FunctionalInterface
public interface DtoToDoService<Souce, Taget> {

    /**
     * Dto转换为Do,保证名称类型一致
     * 
     * @param s 源文件
     * @return 目标文件
     *
     * @author zwq
     * @date 2017年10月18日
     */
    Taget dtoToDo(Souce s);
}
