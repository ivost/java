package com.acme;

import com.pff.*;

import java.io.File;
import java.util.Vector;

import static java.lang.System.out;

class PstReader {
    int depth = -1;

    boolean read(File file) {
        out.println("reading " + file.getAbsolutePath());
        try {
            PSTFile pstFile = new PSTFile(file);
            PSTMessageStore store = pstFile.getMessageStore();
            out.println(store.getDisplayName());
            out.println("isPasswordProtected: " + store.isPasswordProtected());

           processFolder(pstFile.getRootFolder());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

    public void processFolder(final PSTFolder folder) throws PSTException, java.io.IOException {
        this.depth++;
        // the root folder doesn't have a display name
        if (this.depth > 0) {
            this.printDepth();
            out.println(folder.getDisplayName());
        }

        // go through the folders...
        if (folder.hasSubfolders()) {
            final Vector<PSTFolder> childFolders = folder.getSubFolders();
            for (final PSTFolder childFolder : childFolders) {
                this.processFolder(childFolder);
            }
        }

        // and now the emails for this folder
        if (folder.getContentCount() > 0) {
            this.depth++;
            PSTMessage email = (PSTMessage) folder.getNextChild();
            while (email != null) {
                this.printDepth();
                out.println("Email: " + email.getDescriptorNodeId() + " - " + email.getSubject());
                email = (PSTMessage) folder.getNextChild();
            }
            this.depth--;
        }
        this.depth--;
    }

    public void printDepth() {
        for (int x = 0; x < this.depth - 1; x++) {
            out.print(" | ");
        }
        out.print(" |- ");
    }



}
