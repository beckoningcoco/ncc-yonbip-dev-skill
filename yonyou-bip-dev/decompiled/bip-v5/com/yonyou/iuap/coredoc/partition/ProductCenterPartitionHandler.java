/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.mdf.query.core.partition.BasePartitionHandler
 *  com.yonyou.ucf.mdf.query.core.partition.PartitionHandler
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.model.Entity
 *  org.imeta.core.model.Property
 *  org.imeta.core.model.PropertyListMap
 *  org.imeta.orm.base.PartitionContext
 */
package com.yonyou.iuap.coredoc.partition;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.mdf.query.core.partition.BasePartitionHandler;
import com.yonyou.ucf.mdf.query.core.partition.PartitionHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.model.Entity;
import org.imeta.core.model.Property;
import org.imeta.core.model.PropertyListMap;
import org.imeta.orm.base.PartitionContext;

public class ProductCenterPartitionHandler
extends BasePartitionHandler
implements PartitionHandler {
    private final Map<String, PartitionStrategy> partitionHandlers = this.initializePartitionHandlers();
    private static final String DR_COLUMN = "dr";
    private static final String YTENANT_COLUMN = "ytenant_id";

    private Map<String, PartitionStrategy> initializePartitionHandlers() {
        HashMap<String, PartitionStrategy> handlers = new HashMap<String, PartitionStrategy>();
        handlers.put("ytenant", p -> super.defaultTenantPartition(Objects.requireNonNull((Entity)p.owner())));
        handlers.put("shop", new ShopStrategy());
        handlers.put("tenant", p -> "*");
        handlers.put(DR_COLUMN, p -> 0);
        handlers.put("isDeleted", p -> 0);
        handlers.put("isPotential", p -> 0);
        return handlers;
    }

    public PartitionContext explainPartitions(List<Entity> entities) {
        PartitionContext partitionContext = new PartitionContext();
        entities.forEach(entity -> {
            PropertyListMap partitionAttrMap = entity.partitionAttrMap();
            partitionAttrMap.forEach(partitionName -> {
                PartitionStrategy strategy = this.partitionHandlers.get(partitionName);
                for (Property property : partitionAttrMap.get(partitionName)) {
                    if (YTENANT_COLUMN.equals(property.columnName())) {
                        partitionContext.put((Object)property.fullname(), this.defaultTenantPartition((Entity)entity));
                        continue;
                    }
                    if (DR_COLUMN.equals(property.columnName())) {
                        partitionContext.put((Object)property.fullname(), (Object)0);
                        continue;
                    }
                    if (strategy == null) continue;
                    Optional.ofNullable(strategy.apply(property)).ifPresent(value -> partitionContext.put((Object)property.fullname(), value));
                }
            });
        });
        return partitionContext;
    }

    private static interface PartitionStrategy {
        public Object apply(Property var1);
    }

    private static class ShopStrategy
    implements PartitionStrategy {
        private ShopStrategy() {
        }

        @Override
        public Object apply(Property property) {
            return this.getShopId();
        }

        private Long getShopId() {
            Boolean isSingleOrg = InvocationInfoProxy.isSingleOrg();
            UserType userType = this.getUserType();
            String docId = InvocationInfoProxy.getDocId();
            if (null != isSingleOrg && isSingleOrg.booleanValue()) {
                if (userType == UserType.ShopAdminUser || userType == UserType.ShopUser) {
                    return docId == null ? -1L : Long.parseLong(docId);
                }
                if (userType == UserType.TenantAdmin || userType == UserType.TenantEmployee) {
                    return -1L;
                }
            } else {
                return -1L;
            }
            return null;
        }

        private UserType getUserType() {
            String userType = InvocationInfoProxy.getUserType();
            if (StringUtils.isBlank((CharSequence)userType) || "null".equalsIgnoreCase(userType)) {
                return UserType.TenantEmployee;
            }
            Integer v = Integer.parseInt(userType);
            UserType usertypeEnum = UserType.find(v);
            return null == usertypeEnum ? UserType.TenantEmployee : usertypeEnum;
        }

        private static enum UserType {
            PlatForm("\u5e73\u53f0\u7ba1\u7406\u5458", -1),
            TenantAdmin("\u79df\u6237\u7ba1\u7406\u5458", 0),
            TenantEmployee("\u5458\u5de5", 1),
            TenantShopuser("\u5ba2\u6237\u7ba1\u7406\u5458", 2),
            JoinUser("\u5ba2\u6237\u4e1a\u52a1\u5458", 3),
            ShopAdminUser("\u5546\u5bb6\u7ba1\u7406\u5458", 4),
            ShopUser("\u5546\u5bb6\u4e1a\u52a1\u5458", 5),
            ExternalParticipants("\u5916\u90e8\u53c2\u4f1a\u4eba\u5458", 6),
            VendorUser("\u4f9b\u5e94\u5546", 7),
            Define1User("\u7528\u6237\u7c7b\u578b\u9884\u75591", 8),
            Define2User("\u7528\u6237\u7c7b\u578b\u9884\u75592", 9),
            Define3User("\u7528\u6237\u7c7b\u578b\u9884\u75593", 10),
            Define4User("\u7528\u6237\u7c7b\u578b\u9884\u75594", 11),
            Define5User("\u7528\u6237\u7c7b\u578b\u9884\u75595", 12);

            private final String name;
            private final short value;
            private static final Map<Short, UserType> map;

            private UserType(String name, short value) {
                this.name = name;
                this.value = value;
            }

            public String getName() {
                return this.name;
            }

            public short getValue() {
                return this.value;
            }

            public static UserType find(Number value) {
                if (value == null) {
                    return null;
                }
                return map.get(value.shortValue());
            }

            static {
                map = Collections.unmodifiableMap(new HashMap<Short, UserType>(){
                    {
                        UserType[] items;
                        for (UserType item : items = UserType.values()) {
                            this.put(item.getValue(), item);
                        }
                    }
                });
            }
        }
    }
}

