package com.jun.lottery.domain.award.service.goods.impl;

import com.jun.lottery.common.Constants;
import com.jun.lottery.domain.award.model.req.GoodsReq;
import com.jun.lottery.domain.award.model.res.DistributionRes;
import com.jun.lottery.domain.award.service.goods.DistributionBase;
import com.jun.lottery.domain.award.service.goods.IDistributionGoods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @description: 描述类商品，以文字形式展示给用户
 * @author: 小傅哥，微信：fustack
 * @date: 2021/9/4
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Component
@Slf4j
public class DescGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }


}
