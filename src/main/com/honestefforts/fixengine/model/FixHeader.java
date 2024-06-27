package com.honestefforts.fixengine.model;

import com.honestefforts.fixengine.model.tags.BeginString;
import com.honestefforts.fixengine.model.tags.MessageType;

import java.time.Instant;

public class FixHeader {
    public final BeginString version;
    public final Integer checkSum;
    public final MessageType messageType;
    public final String senderCompID;
    public final String targetCompID;
    public final Integer msgSeqNum;
    public final Instant sendingTime;

    public FixHeader(BeginString version, Integer checkSum, MessageType messageType, String senderCompID, String targetCompID, Integer msgSeqNum, Instant sendingTime) {
        this.version = version;
        this.messageType = messageType;
        this.checkSum = checkSum;
        this.senderCompID = senderCompID;
        this.targetCompID = targetCompID;
        this.msgSeqNum = msgSeqNum;
        this.sendingTime = sendingTime;
    }
}
