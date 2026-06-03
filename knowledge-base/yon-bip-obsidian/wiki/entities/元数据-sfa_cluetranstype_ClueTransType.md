---
tags: [BIP, 元数据, 数据字典, sfa.cluetranstype.ClueTransType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 线索交易类型 (`sfa.cluetranstype.ClueTransType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_cluetranstype` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`c4765e10-4ba0-49c8-9d06-d5e40d456ab6`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 线索交易类型 |
| 物理表 | `sfa_cluetranstype` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 33 个 |
| 子表 | 3 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `clueTransTypeRoleList` | `sfa.cluetranstype.ClueTransTypeRole` | composition |
| `clueTransTypeOrgList` | `sfa.cluetranstype.ClueTransTypeOrg` | composition |
| `clueTransTypeDeptList` | `sfa.cluetranstype.ClueTransTypeDept` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `transtype_id` | `transtype.bd_billtyperef` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 13字段)

- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `remark` | `remark` | `remark` | 备注 |
| `hasbusioppo_checked` | `hasbusioppo_checked` | `hasBusiOppoChecked` | 包含商机选中 |
| `haslinkman_checked` | `haslinkman_checked` | `hasLinkManChecked` | 包含联系人选中 |
| `isCloseAudit` | `isCloseAudit` | `isCloseAudit` | 线索关闭是否需要审核 |
| `transcustomer_checked` | `transcustomer_checked` | `transCustomerChecked` | 转化对象(客户)选中 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `transtype_id` | `transtype_id` | `transType` | 交易类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 枚举字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `hascustomer` | `hascustomer` | `hasCustomer` | 是否包含客户 |
| `transcustomer` | `transcustomer` | `transCustomer` | 转化对象(客户) |
| `hasbusioppo` | `hasbusioppo` | `hasBusiOppo` | 是否包含商机 |
| `haslinkman` | `haslinkman` | `hasLinkMan` | 是否包含联系人 |
| `isbringaction` | `isbringaction` | `isBringAction` | 是否自动带入 |
| `isAutoAppoval` | `isAutoAppoval` | `isAutoAppoval` | 是否自动提交审批 |
| `isBringRelatePerson` | `isBringRelatePerson` | `isBringRelatePerson` | 线索的团队人员默认带入转化对象中 |
| `isShowConfirm` | `isShowConfirm` | `isShowConfirm` | 是否显示确认窗 |
| `transoppo` | `transoppo` | `transOppo` | 转化对象(商机) |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `clueTransTypeDeptList` | 线索交易类型适用部门 |
| `` | `` | `clueTransTypeOrgList` | 线索交易类型适用销售组织 |
| `` | `` | `clueTransTypeRoleList` | 线索交易类型适用角色 |
