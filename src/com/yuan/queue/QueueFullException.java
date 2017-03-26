package com.yuan.queue;

/**
 * Created by Yuan on 2017/3/26,15:19.
 * Description:
 */
public class QueueFullException extends RuntimeException {
    public QueueFullException(String message) {
        super(message);
    }
}
