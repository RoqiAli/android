/**
 * Nextcloud Android client application
 *
 * @author Andy Scherzinger
 * Copyright (C) 2016 Andy Scherzinger
 * Copyright (C) 2016 Nextcloud
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU AFFERO GENERAL PUBLIC LICENSE
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU AFFERO GENERAL PUBLIC LICENSE for more details.
 *
 * You should have received a copy of the GNU Affero General Public
 * License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.owncloud.android.datamodel;

import java.util.ArrayList;
import java.util.List;

/**
 * Business object representing a media folder with all information that are gathered via media queries.
 */
public class MediaFolder {
    /** name of the folder. */
    public String folderName;

    /** absolute path of the folder. */
    public String absolutePath;
    
    /** list of file paths of the folder's content */
    public List<String> filePaths = new ArrayList<>();

    /** total number of files in the media folder. */
    public long numberOfFiles;

    /** type of media folder. */
    public MediaFolderType type;
}
