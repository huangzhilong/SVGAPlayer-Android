package com.opensource.svgaplayer

import java.util.concurrent.ExecutorService

/**
 * Created by huangzhilong on 2019-07-23.
 * 设置线程池,没设置则new thread（原来逻辑）
 */

class SVGAExecutorService {

    companion object {

        private var mExecutorService: ExecutorService? = null

        fun setExecutorService(executorService: ExecutorService) {
            mExecutorService = executorService
        }

        fun executorTask(runnable: Runnable) {
            mExecutorService?.execute(runnable) ?: Thread { runnable }.start()
        }
    }
}