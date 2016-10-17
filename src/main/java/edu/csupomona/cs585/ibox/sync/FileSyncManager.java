package edu.csupomona.cs585.ibox.sync;

import java.io.File;
import java.io.IOException;

public interface FileSyncManager {

	public abstract void addFile(File localFile) throws IOException;

	public void updateFile(File localFile) throws IOException;

	public void deleteFile(File localFile) throws IOException;
}
