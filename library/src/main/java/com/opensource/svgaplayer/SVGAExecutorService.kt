package com.opensource.svgaplayer

import java.util.concurrent.Executor

/**
 * Created by huangzhilong on 2019-07-23.
 * 设置线程池,没设置则new thread（原来逻辑）
 */

class SVGAExecutorService {

    companion object {

        private var mExecutorService: Executor? = null

        fun setExecutorService(executorService: Executor?) {
            mExecutorService = executorService
        }

        fun executorTask(runnable: Runnable) {
            mExecutorService?.execute(runnable) ?: (Thread { runnable }.start())
        }
    }
}