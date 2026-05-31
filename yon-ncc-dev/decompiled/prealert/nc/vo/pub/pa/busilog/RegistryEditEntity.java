/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.uap.ml.DataMultiLangAccessor
 *  nc.vo.ml.LanguageVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.vo.pub.pa.busilog;

import java.util.ArrayList;
import java.util.List;
import nc.itf.uap.ml.DataMultiLangAccessor;
import nc.vo.ml.LanguageVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.busilog.AbstractPABusiLogEntity;
import nc.vo.pub.pa.busilog.RegistryBusiLogEntity;

public class RegistryEditEntity
extends RegistryBusiLogEntity {
    private List<FieldComparator> comparatorList;
    private AlertregistryVO originRegistry;

    public RegistryEditEntity(AlertregistryVO originRegistry, AlertregistryVO updatedRegistry) {
        super(updatedRegistry, "87a67ffe-3699-4846-a6d9-51c17163656f");
        this.originRegistry = originRegistry;
        this.comparatorList = new ArrayList<FieldComparator>();
        this.comparatorList.add(new NameComparator());
        this.comparatorList.add(new FileNameComparator());
        this.comparatorList.add(new ActiveComparator());
        this.comparatorList.add(new TriggerModeComparator());
    }

    @Override
    public String buildLogmsg() throws BusinessException {
        StringBuffer sb = new StringBuffer();
        sb.append(RegistryEditEntity.getCategoryString(this.getRegistry().getRegistrytype()));
        sb.append(", ");
        sb.append(RegistryEditEntity.getAlertTypeNameString(this.getRegistry().getPk_alerttype()));
        sb.append(", ");
        sb.append(RegistryEditEntity.getRegistryNameString(this.getRegistry()));
        sb.append(", ");
        for (FieldComparator c : this.comparatorList) {
            if (c.isEqual(this.originRegistry, this.getRegistry())) continue;
            sb.append(c.getCompareResultString(this.originRegistry, this.getRegistry()));
            sb.append(", ");
        }
        if (sb.length() > 0) {
            return sb.substring(1);
        }
        return sb.toString();
    }

    class TriggerModeComparator
    implements FieldComparator {
        private String result;

        TriggerModeComparator() {
        }

        @Override
        public boolean isEqual(AlertregistryVO oldRegistry, AlertregistryVO newRegistry) {
            UFBoolean oldTm = oldRegistry.getIstiming();
            UFBoolean newTm = newRegistry.getIstiming();
            if (oldTm == null) {
                oldTm = UFBoolean.TRUE;
            }
            if (newTm == null) {
                newTm = UFBoolean.TRUE;
            }
            if (oldTm.equals((Object)newTm)) {
                return true;
            }
            String text = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryEditEntity-000008");
            String oldStr = oldTm.toString();
            String newStr = newTm.toString();
            this.result = AbstractPABusiLogEntity.getFormattedString(text, oldStr, newStr);
            return false;
        }

        @Override
        public String getCompareResultString(AlertregistryVO oldRegistry, AlertregistryVO newRegistry) {
            return this.result;
        }
    }

    class ActiveComparator
    implements FieldComparator {
        private String result = null;

        ActiveComparator() {
        }

        @Override
        public boolean isEqual(AlertregistryVO oldRegistry, AlertregistryVO newRegistry) {
            UFBoolean oldStatus = oldRegistry.getEnabled();
            UFBoolean newStatus = newRegistry.getEnabled();
            if (oldStatus == null) {
                oldStatus = UFBoolean.TRUE;
            }
            if (newStatus == null) {
                newStatus = UFBoolean.TRUE;
            }
            if (oldStatus.equals((Object)newStatus)) {
                return true;
            }
            String text = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryEditEntity-000004");
            String oldStr = oldStatus.booleanValue() ? NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryEditEntity-000005") : NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryEditEntity-000006");
            String newStr = newStatus.booleanValue() ? NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryEditEntity-000005") : NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryEditEntity-000006");
            this.result = AbstractPABusiLogEntity.getFormattedString(text, oldStr, newStr);
            return false;
        }

        @Override
        public String getCompareResultString(AlertregistryVO oldRegistry, AlertregistryVO newRegistry) {
            return this.result;
        }
    }

    class FileNameComparator
    implements FieldComparator {
        private String result;

        FileNameComparator() {
        }

        @Override
        public boolean isEqual(AlertregistryVO oldRegistry, AlertregistryVO newRegistry) {
            String newValue;
            String oldValue = String.valueOf(oldRegistry.getFilename());
            if (oldValue.equals(newValue = String.valueOf(newRegistry.getFilename()))) {
                return true;
            }
            String text = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "RegistryEditEntity-000003");
            this.result = AbstractPABusiLogEntity.getFormattedString(text, oldValue, newValue);
            return false;
        }

        @Override
        public String getCompareResultString(AlertregistryVO oldRegistry, AlertregistryVO newRegistry) {
            return this.result;
        }
    }

    class NameComparator
    implements FieldComparator {
        private String result = null;

        NameComparator() {
        }

        @Override
        public boolean isEqual(AlertregistryVO oldRegistry, AlertregistryVO newRegistry) {
            LanguageVO[] langvos = DataMultiLangAccessor.getInstance().getAllLangVOs();
            StringBuffer sb = new StringBuffer();
            for (LanguageVO lang : langvos) {
                String modifiedName;
                String originName;
                String suffix = "";
                int langseq = lang.getLangseq();
                if (langseq != 1) {
                    suffix = suffix + langseq;
                }
                if ((originName = String.valueOf(oldRegistry.getAttributeValue("alertname" + suffix))).equals(modifiedName = String.valueOf(newRegistry.getAttributeValue("alertname" + suffix)))) continue;
                String text = NCLangRes4VoTransl.getNCLangRes().getStrByID("prealertres", "AlertQueryDefEditDialog-000002");
                sb.append(", ");
                sb.append(AbstractPABusiLogEntity.getFormattedString(text + suffix, originName, modifiedName));
            }
            if (sb.length() == 0) {
                return false;
            }
            this.result = sb.substring(1);
            return true;
        }

        @Override
        public String getCompareResultString(AlertregistryVO oldRegistry, AlertregistryVO newRegistry) {
            return this.result;
        }
    }

    static interface FieldComparator {
        public boolean isEqual(AlertregistryVO var1, AlertregistryVO var2);

        public String getCompareResultString(AlertregistryVO var1, AlertregistryVO var2);
    }
}

