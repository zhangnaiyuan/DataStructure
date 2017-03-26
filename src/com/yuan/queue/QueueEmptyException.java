package com.yuan.queue;

/**
 * Created by Yuan on 2017/3/26,15:19.
 * Description:
 */
public class QueueEmptyException extends RuntimeException {
    public QueueEmptyException(String message) {
        super(message);
    }
}
