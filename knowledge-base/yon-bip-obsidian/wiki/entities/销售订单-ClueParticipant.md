---
tags: [BIP, 元数据, 数据字典, 销售订单, SCMSA, voucher.order.ClueParticipant]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
parent_entity: voucher.order.Order
---

# 参与人 (`voucher.order.ClueParticipant`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP 供应链（SCMSA）模块销售订单的子实体元数据字典。
> 物理表：`cust_relateperson` | 所属应用：`SCMSA`
> 父实体：[[销售订单元数据]] (`voucher.order.Order`)

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 参与人 |
| 描述 |  |
| 物理表 | `cust_relateperson` |
| 所属应用 | `SCMSA` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 数据权限场景 | `` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键ID |

## 部署信息

- **部署时间**: 2026-05-22 22:09:33:000
- **安装来源**: `/app/iuap-metadata-base-common/iuap-metadata-base/metadata-bootstrap/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-metadata-base/0010_iuap_common/DML/0270_iuap_metadata/202604/202604161115_metadata_ucfbase-ucfbaseItf.zip`
- **安装人**: mongoTools

## 术语标记

`BusinessData`, `participantFlag`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

---

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| 3 | IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

### IAuditInfo (`IAuditInfo`)
> URI: `base.itf.IAuditInfo` | 版本: 340

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `createDate` (创建日期) | `create_date` | `date` | `Date` |
| `createTime` (创建时间) | `create_time` | `timestamp` | `Timestamp` |
| `creator` (创建人) | `` | `text` | `String` |
| `creatorId` (创建人ID) | `` | `quote` | `base.user.User` |
| `modifier` (修改人) | `` | `text` | `String` |
| `modifierId` (修改人ID) | `` | `quote` | `base.user.User` |
| `modifyDate` (修改日期) | `modify_date` | `date` | `Date` |
| `modifyTime` (修改时间) | `modify_time` | `timestamp` | `Timestamp` |

### ITenant (`ITenant`)
> URI: `base.itf.ITenant` | 版本: 73

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `tenant` (tenant) | `tenant_id` | `quote` | `base.tenant.Tenant` |

### IYTenantExt (`IYTenantExt`)
> URI: `ucfbase.ucfbaseItf.IYTenantExt` | 版本: 24

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `ytenant` (租户) | `ytenant_id` | `quote` | `yht.tenant.YhtTenant` |

---

## 全部直接属性（共 14 个）

> 含直接映射数据库列的字段。类型为 UUID 的为外键引用（详见关联属性节）。

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 | URI |
|---|--------|--------|---------|------|---------|------|------|-----|
| 1 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true | `base.itf.IAuditInfo.createDate` |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true | `base.itf.IAuditInfo.createTime` |
| 3 | `creator` | 创建人 | `creator` | String | `text` |  | true | `base.itf.IAuditInfo.creator` |
| 4 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true | `base.itf.IAuditInfo.creatorId` |
| 5 | `id` | 主键ID | `id` | Long | `long` |  | true | `base.entity.BizObject.id` |
| 6 | `modifier` | 修改人 | `modifier` | String | `text` |  | true | `base.itf.IAuditInfo.modifier` |
| 7 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true | `base.itf.IAuditInfo.modifierId` |
| 8 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true | `base.itf.IAuditInfo.modifyDate` |
| 9 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true | `base.itf.IAuditInfo.modifyTime` |
| 10 | `person` | person | `person` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true | `voucher.order.ClueParticipant.person` |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true | `base.entity.BizObject.pubts` |
| 12 | `relateObject` | 关联对象 | `relate_object_id` | c7c0beb4-f830-486d-83e1-51072b319fd2 | `quote` |  | true | `voucher.order.ClueParticipant.relateObject` |
| 13 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true | `base.itf.ITenant.tenant` |
| 14 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true | `ucfbase.ucfbaseItf.IYTenantExt.ytenant` |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` | 外键引用 |  |  | Service |  |
| 2 | `person` | person | `bd.staff.Staff` | `person` | 外键引用 |  |  | Service |  |
| 3 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键引用 |  |  | Service |  |
| 4 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键引用 |  |  | Service |  |
| 5 | `relateObject` | 关联对象 | `voucher.order.Order` | `relate_object_id` | clueParticipantList → relateObject | 0..n | Y | None |  |
| 6 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键引用 |  |  | Service |  |

### Composition（子表）

- **关联对象**: `relateObject` → `voucher.order.Order` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `person` (person) | `bd.staff.Staff` | `person` |
| `creatorId` (创建人ID) | `base.user.User` | `creatorId` |
| `modifierId` (修改人ID) | `base.user.User` | `modifierId` |
| `tenant` (tenant) | `base.tenant.Tenant` | `tenant_id` |

---

## 使用示例

```sql
-- 查询 参与人 数据
SELECT create_date, create_time, creator, creatorId, id, modifier, modifierId, modify_date, modify_time, person
FROM cust_relateperson
```

### 通过 API 获取元数据

```bash
python bip_metadata_query.py voucher.order.ClueParticipant
```
