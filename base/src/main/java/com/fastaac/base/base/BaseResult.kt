package com.fastaac.base.base

import java.io.Serializable

/**
 * author : wutao
 * e-mail : wutao@himango.cn
 * time   : 2019/07/30
 * desc   :
 * version: 1.0
 */
class BaseResult<T> : Serializable {
    var errorCode = 0
    var errorMsg: String? = null
    var data: T? = null

    constructor()
    constructor(errorCode: Int) {
        this.errorCode = errorCode
    }


    companion object {
        const val SUCCESS_CODE = 0
        private const val serialVersionUID = 5213230387175987834L
    }
}