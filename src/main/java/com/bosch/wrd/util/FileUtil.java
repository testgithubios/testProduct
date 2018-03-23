package com.bosch.wrd.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.channels.FileChannel;
import java.util.List;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;

@SuppressWarnings("deprecation")
public final class FileUtil {

	/**
	 * PDF.
	 */
	public static final String PROJECT_REVIEW_IN = "project_review.pdf";
	public static final String PROJECT_REVIEW_OUT = "project_review_out.pdf";
	public static final String STEERING_COMMITTEE_IN = "steering_committee.pdf";
	public static final String STEERING_COMMITTEE_OUT = "steering_committee_out.pdf";

	/**
	 * XLSX.
	 */
	public static final String LESSONS_LEARNED = "lessons_learned.xlsx";
	public static final String TESTING_CAPACITY = "testing_capacity.xlsx";
	public static final String SELECTED_RELEASES = "selected_releases.xlsx";
	public static final String PORTFOLIO = "portfolio.xlsx";
	public static final String MILESTONE = "milestone.xlsm";

	public FileUtil() {
	}

	/**
	 * Helper method to get a filename without its extension
	 * 
	 * @param fileName
	 *            String
	 * @return String
	 */
	public static String getFileNameWithoutExtension(String fileName) {
		String name = fileName;

		int index = fileName.lastIndexOf('.');
		if (index != -1) {
			name = fileName.substring(0, index);
		}

		return name;
	}

	/**
	 * Transfer from output stream to input stream is happening here
	 * 
	 * @param fos
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public static FileInputStream transferOutToIn(FileOutputStream fos, String fileName) throws IOException {
		FileChannel outputChannel = fos.getChannel();

		FileInputStream fis = new FileInputStream(fileName);
		FileChannel inputChannel = fis.getChannel();

		outputChannel.transferTo(0, inputChannel.size(), inputChannel);

		inputChannel.close();
		fis.close();

		outputChannel.close();
		fos.close();
		return fis;
	}

	/**
	 * Build the PDF paragraph.
	 * 
	 * @param htmlText
	 * @param x1
	 * @param x2
	 * @param y1
	 * @param y2
	 * @param cb
	 * @throws IOException
	 * @throws DocumentException
	 */
	public static void buildParagraph(String htmlText, float x1, float x2, float y1, float y2, PdfContentByte cb)
			throws IOException, DocumentException {
		if (htmlText == null)
			htmlText = "";

		Paragraph paragraph = new Paragraph();
		List<Element> elements = HTMLWorker.parseToList(new StringReader(htmlText), null);
		elements.forEach(e -> {
			paragraph.add(e);
		});
		Font font = new Font(FontFamily.TIMES_ROMAN, 12.6f);
		paragraph.setFont(font);

		ColumnText ct = new ColumnText(cb);
		ct.setSimpleColumn(x1, x2, y1, y2);
		ct.addElement(paragraph);
		ct.go();
	}
}
