package com.nepxion.discovery.plugin.strategy.condition;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;

import com.nepxion.discovery.plugin.strategy.context.StrategyContextHolder;

public abstract class AbstractStrategyCondition implements StrategyCondition {
    @Autowired
    protected StrategyContextHolder strategyContextHolder;

    public StrategyContextHolder getStrategyContextHolder() {
        return strategyContextHolder;
    }
}