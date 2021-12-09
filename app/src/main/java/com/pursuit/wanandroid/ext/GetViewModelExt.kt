package com.pursuit.wanandroid.ext

import java.lang.reflect.ParameterizedType

/**
 * @Description:
 * @Author:      sh
 * @Date:        2021/12/9
 */

/**
 * 获取当前类绑定的泛型ViewModel-clazz
 */
@Suppress("UNCHECKED_CAST")
fun <VM> getVmClazz(obj:Any):VM{
    return (obj.javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as VM
}