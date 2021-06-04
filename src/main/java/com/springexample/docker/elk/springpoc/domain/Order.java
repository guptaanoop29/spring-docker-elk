/**
 * 
 */
package com.springexample.docker.elk.springpoc.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * @author anoop.kumargupta
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	protected Long id;

    protected String details;

    protected String totalCost;

    protected OffsetDateTime orderDateTime;
	
}
