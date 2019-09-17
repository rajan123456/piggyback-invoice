package com.incentives.piggyback.invoice.service;

import com.incentives.piggyback.invoice.model.Invoice;
import com.incentives.piggyback.invoice.model.InvoiceRequest;

import org.springframework.http.ResponseEntity;


public interface InvoiceService {

	ResponseEntity<Invoice> getInvoiceById(Long id);

	ResponseEntity<Invoice> payInvoiceById(Long id, Invoice invoice);

	String emailInvoice(InvoiceRequest invoiceRequest);

}