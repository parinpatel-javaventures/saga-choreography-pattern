package com.example.commons.event;

import com.example.commons.dto.OrderRequestDto;
import com.example.commons.dto.PaymentRequestDto;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class PaymentEvent implements Event{

    private UUID eventId = UUID.randomUUID();
    private Date date = new Date();
    private PaymentRequestDto paymentRequestDto;
    private PaymentStatus paymentStatus;

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public UUID getEventId() {
        return eventId;
    }

    public PaymentEvent(PaymentRequestDto orderRequestDto, PaymentStatus orderStatus) {
        this.paymentRequestDto = orderRequestDto;
        this.paymentStatus = orderStatus;
    }
}
