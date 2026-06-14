---
tags: [BIP, 元数据, 数据字典, earap.apCooperation.APCooperation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应付单据协同设置 (`earap.apCooperation.APCooperation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_cooperation` | domain：`yonbip-fi-earapbill` | 应用：`EAP` | 业务对象ID：`1da01bbc-60f5-4f10-bc23-3bdf10bc587c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应付单据协同设置 |
| 物理表 | `arap_cooperation` |
| domain/服务域 | `yonbip-fi-earapbill` |
| schema | `fiearapbill` |
| 所属应用 | `EAP` |
| 直连字段 | 25 个 |
| 子表 | 3 个 |
| 关联引用 | 14 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ackRoleList` | `earap.apCooperation.APCooperation_ackRole` | composition |
| `recOrgList` | `earap.apCooperation.APCooperation_recOrg` | composition |
| `recRoleList` | `earap.apCooperation.APCooperation_recRole` | composition |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `send_bus_type_id` | `ucfbasedoc.bd_billtyperef` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ack_role_id` | `u8c-auth.sys_role` |
| `ytenant_id` | `` |
| `rec_bus_type_id` | `ucfbasedoc.bd_billtyperef` |
| `rec_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `rec_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `send_bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `send_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `rec_role_id` | `u8c-auth.sys_role` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `remarks` | `remarks` | `remarks` | 说明 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rec_bill_type_id` | `rec_bill_type_id` | `recBillType` | 接收方单据类型 |
| `rec_bus_type_id` | `rec_bus_type_id` | `recBusType` | 接收方交易类型 |
| `send_bill_type_id` | `send_bill_type_id` | `sendBillType` | 发送方单据类型 |
| `send_bus_type_id` | `send_bus_type_id` | `sendBusType` | 发送方交易类型 |
| `send_org_id` | `send_org_id` | `sendOrg` | 发送方会计主体 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `copy_file_enable` | `copy_file_enable` | `copyFileEnable` | 附件协同 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rec_bill_state` | `rec_bill_state` | `recBillState` | 接收状态 |
| `rec_system_type` | `rec_system_type` | `recSystemType` | 目的系统标识 |
| `send_bill_state` | `send_bill_state` | `sendBillState` | 协同发起时点 |
| `send_system_type` | `send_system_type` | `sendSystemType` | 来源系统标识 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### quoteList (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ack_role_id` | `ack_role_id` | `ackRole` | 消息确认返回人 |
| `rec_org_id` | `rec_org_id` | `recOrg` | 接收方会计主体 |
| `rec_role_id` | `rec_role_id` | `recRole` | 消息接收人 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `recOrgList` | APCooperation_recOrg |
| `` | `` | `recRoleList` | APCooperation_recRole |
| `` | `` | `ackRoleList` | APCooperation_ackRole |
