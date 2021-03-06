package com.example.sport.service.impl;

import com.example.sport.model.Sport;
import com.example.sport.mapper.SportMapper;
import com.example.sport.service.SportService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 运动表 服务实现类
 * </p>
 *
 * @author XuShu
 * @since 2022-03-24
 */
@Service
public class SportServiceImpl extends ServiceImpl<SportMapper, Sport> implements SportService {

}
