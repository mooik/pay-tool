package cn.tiui.paytool.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@SuppressWarnings("all")
public class PayException extends RuntimeException {
    private String msg;
}
