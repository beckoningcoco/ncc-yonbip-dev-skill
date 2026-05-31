/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaAdapter
 */
package nc.vo.arap.pub;

import java.util.HashMap;
import java.util.Map;
import nc.vo.pub.IVOMeta;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaAdapter;

public class VOMetaFactory {
    private static VOMetaFactory instance = new VOMetaFactory();
    private Map<String, IVOMeta> nameIndex = new HashMap<String, IVOMeta>();

    private VOMetaFactory() {
    }

    public static VOMetaFactory getInstance() {
        return instance;
    }

    public IVOMeta getVOMeta(String entityName) {
        IVOMeta voMeta = this.nameIndex.get(entityName);
        if (voMeta == null) {
            VOMetaAdapter tool = new VOMetaAdapter();
            voMeta = tool.loadFromModel(entityName);
            this.nameIndex.put(entityName, voMeta);
        }
        return voMeta;
    }
}

