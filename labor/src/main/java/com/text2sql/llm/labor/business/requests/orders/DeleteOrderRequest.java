package com.text2sql.llm.labor.business.requests.orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeleteOrderRequest {
	private int orderId;
}
