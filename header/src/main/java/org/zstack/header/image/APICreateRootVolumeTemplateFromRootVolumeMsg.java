package org.zstack.header.image;

import org.zstack.header.message.APICreateMessage;
import org.zstack.header.message.APIParam;
import org.zstack.header.storage.backup.BackupStorage;
import org.zstack.header.storage.backup.BackupStorageVO;
import org.zstack.header.volume.VolumeVO;

import java.util.List;

public class APICreateRootVolumeTemplateFromRootVolumeMsg extends APICreateMessage {
    @APIParam(maxLength = 255)
    private String name;
    @APIParam(required = false, maxLength = 2048)
    private String description;
    private String guestOsType;
    @APIParam(required = false, nonempty = true, resourceType = BackupStorageVO.class)
    private List<String> backupStorageUuids;
    @APIParam(resourceType = VolumeVO.class)
    private String rootVolumeUuid;
    @APIParam(required = false, validValues = {"Linux", "Windows", "Other", "Paravirtualization"})
    private String platform;
    private boolean system;

    public boolean isSystem() {
        return system;
    }

    public void setSystem(boolean system) {
        this.system = system;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getGuestOsType() {
        return guestOsType;
    }
    public void setGuestOsType(String guestOsType) {
        this.guestOsType = guestOsType;
    }
    public String getRootVolumeUuid() {
        return rootVolumeUuid;
    }
    public void setRootVolumeUuid(String rootVolumeUuid) {
        this.rootVolumeUuid = rootVolumeUuid;
    }

    public List<String> getBackupStorageUuids() {
        return backupStorageUuids;
    }

    public void setBackupStorageUuids(List<String> backupStorageUuids) {
        this.backupStorageUuids = backupStorageUuids;
    }
}
