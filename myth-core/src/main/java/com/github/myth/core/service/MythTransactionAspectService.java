/*
 *
 * Copyright 2017-2018 549477611@qq.com(xiaoyu)
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.github.myth.core.service;

import com.github.myth.common.bean.context.MythTransactionContext;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author xiaoyu
 */
@FunctionalInterface
public interface MythTransactionAspectService {

    /**
     * myth事务切面服务
     *
     * @param mythTransactionContext myth事务上下文对象
     * @param point                 切点
     * @return object
     * @throws Throwable 异常信息
     */
    Object invoke(MythTransactionContext mythTransactionContext, ProceedingJoinPoint point) throws Throwable;
}
