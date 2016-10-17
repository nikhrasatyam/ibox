package edu.csupomona.cs585.ibox;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.csupomona.cs585.ibox.sync.GoogleDriveFileSyncManager;
import edu.csupomona.cs585.ibox.sync.GoogleDriveServiceProvider;

public class GoogleDriveFileSyncManagerIntegrationTest {

	private ByteArrayOutputStream outContent;

	GoogleDriveFileSyncManager driveFileSyncManager = new GoogleDriveFileSyncManager(
			GoogleDriveServiceProvider.get().getGoogleDriveClient());

	@Before
	public void setup() {

		// fileSyncManager = new GoogleDriveFileSyncManager(drive);
		// driveServiceProvider=new GoogleDriveServiceProvider(drive);
		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

	}

	@After
	public void cleanup() {
		System.setOut(null);
	}

	@Test
	public void testAddFile() throws IOException {

		java.io.File localFile = new java.io.File("C://s.txt");
		driveFileSyncManager.addFile(localFile);
	}

	@Test
	public void testGetFileId() {
		String value = driveFileSyncManager.getFileId("s");
		System.out.println(value);
	}

	@Test
	public void testDeleteFile() throws IOException {
		java.io.File localFile = new java.io.File("C://s.txt");
		driveFileSyncManager.deleteFile(localFile);

	}

	@Test
	public void testUpdateFile() throws IOException {
		java.io.File localFile = new java.io.File("C://s.txt");
		driveFileSyncManager.updateFile(localFile);
	}

}