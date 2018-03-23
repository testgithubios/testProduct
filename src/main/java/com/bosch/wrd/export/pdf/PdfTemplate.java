package com.bosch.wrd.export.pdf;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public abstract class PdfTemplate {

	protected static String FILE_PATH = "/export/pdf/";

	public abstract void beforeCreatePdf() throws IOException, FileNotFoundException, DocumentException;

	public abstract ByteArrayInputStream createPdf() throws IOException, DocumentException;
	
	private Document document = null;

	protected PdfWriter initDocument(String fileOut) throws DocumentException, IOException {
		document = new Document();
		File out = new File(fileOut);
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(out));
		document.open();
		document.add(new Chunk(""));
		return writer;
	}
	
	protected Document getDocument() {
		return document;
	}

	protected static void addEmptyLine(Paragraph paragraph, int number) {
		for (int i = 0; i < number; i++) {
			paragraph.add(new Paragraph(" "));
		}
	}

}
