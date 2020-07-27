package com.test.generator.service.impl;

import com.test.generator.entity.TbEmployee;
import com.test.generator.mapper.TbEmployeeMapper;
import com.test.generator.service.ITbEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lin
 * @since 2020-07-26
 */
@Service
public class TbEmployeeServiceImpl extends ServiceImpl<TbEmployeeMapper, TbEmployee> implements ITbEmployeeService {

}
