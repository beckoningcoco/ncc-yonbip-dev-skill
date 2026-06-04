---
tags: ["BIP", "元数据", "数据字典", "ycBase", "purchase.message.PurchaseMessage"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 商机信息 (`purchase.message.PurchaseMessage`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_pending_message` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `purchase.message.PurchaseMessage` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商机信息 |
| 物理表 | `cpu_pending_message` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 业务对象ID | `7e89efe6-1cd3-4579-ac79-03fafde2dbc8` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:40.5840` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:30:36:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202512181400_metadata_purchase-message_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `a6138745-4eb4-4fa5-846d-90bf94e67356`

## 业务场景

- `extdevelop`
- `workflow`
- `UITemplate`
- `ruleengine`
- `userdefine`
- `api`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |

---

## 直接属性（共 46 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `sourceId` | 来源单据 | `msg_id` | Long | `long` |  | ✓ |
| 2 | `sourceType` | 来源单据类型 | `bill_type` | String | `text` |  | ✓ |
| 3 | `sourceCode` | 商机编码 | `billcode` | String | `text` |  | ✓ |
| 4 | `messageTypeId` | 商机类型 | `message_type_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 5 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String | `text` |  | ✓ |
| 6 | `messageType` | 商机类型编码 | `message_type` | String | `text` |  | ✓ |
| 7 | `businessType` | 业务类型 | `business_type` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 8 | `transactionTypeId` | 交易类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 9 | `transactionTypeName` | 交易类型名称 | `transactionTypeName` | String | `text` |  | ✓ |
| 10 | `bidnoticeType` | 招投标类型 | `bidnotice_type` | String | `text` |  | ✓ |
| 11 | `srcEnterpriseId` | 来源租户 | `srcenterprise_id` | Long | `long` |  | ✓ |
| 12 | `srcenterpriseName` | 发布企业名称 | `srcenterprise_name` | String | `text` |  | ✓ |
| 13 | `desEnterpriseId` | 目的租户 | `desenterprise_id` | Long | `long` |  | ✓ |
| 14 | `messageTitle` | 商机名称 | `message_title` | String | `text` |  | ✓ |
| 15 | `messageContent` | 消息内容 | `message_content` | String | `text` |  | ✓ |
| 16 | `purOrgId` | 采购组织 | `pur_OrgId` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 17 | `purOrgName` | 采购组织名称 | `pur_OrgName` | String | `text` |  | ✓ |
| 18 | `receiveOrgName` | 收货组织名称 | `receiveOrgName` | String | `text` |  | ✓ |
| 19 | `reqOrgName` | 需求组织名称 | `reqOrgName` | String | `text` |  | ✓ |
| 20 | `entryTime` | 单据时间 | `entry_time` | DateTime | `timestamp` |  | ✓ |
| 21 | `materialClassIds` | 物料分类 | `material_class_ids` | String | `text` |  | ✓ |
| 22 | `receiveAddressStats` | 交货地点 | `receive_address_stats` | String | `text` |  | ✓ |
| 23 | `itemCount` | 寻源物料项目数 | `item_count` | Long | `long` |  | ✓ |
| 24 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | ✓ |
| 25 | `messageUrl` | 商机信息访问地址 | `message_url` | String | `text` |  | ✓ |
| 26 | `messageMobileUrl` | 商机信息移动端访问地址 | `message_mobile_url` | String | `text` |  | ✓ |
| 27 | `publishId` | 发布者 | `publish_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 28 | `publishTime` | 发布日期 | `publish_time` | DateTime | `timestamp` |  | ✓ |
| 29 | `deadline` | 截止日期 | `deadline` | DateTime | `timestamp` |  | ✓ |
| 30 | `status` | 状态 | `status` | String | `text` |  | ✓ |
| 31 | `messageState` | 商机信息状态 | `message_state` | String | `text` |  | ✓ |
| 32 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 33 | `purchaser` | 采购员 | `purchaser` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 34 | `purchaseMessageDefineCharacter` | 特征 | `define_character_id` | 7b78f382-1a3c-4708-8cbc-eaba1c801277 | `UserDefine` |  | ✓ |
| 35 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 36 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 37 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 38 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 39 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 40 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 41 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 42 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 43 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 44 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 45 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 46 | `materialClassList` | 商机信息物料明细 | `` | 31cc1f9d-94af-4701-8c47-8c94de2bfc7d | `` |  |  |

---

## 关联属性（共 12 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purOrgId` | 采购组织 | `org.func.BaseOrg` | `pur_OrgId` |  →  |  |  | Service |  |
| 2 | `purchaseMessageDefineCharacter` | 特征 | `purchase.message.PurchaseMessageDefineCharacter` | `define_character_id` |  →  |  |  | None |  |
| 3 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | `transaction_type_id` |  →  |  |  | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `purchaser` | 采购员 | `bd.staff.Staff` | `purchaser` |  →  |  |  | Service |  |
| 6 | `messageTypeId` | 商机类型 | `bctask.basedoc.CustomerDocVO` | `message_type_id` |  →  |  |  | Service |  |
| 7 | `materialClassList` | 商机信息物料明细 | `purchase.message.PurchaseMessageMaterialClass` | `` | materialClassList → purchaseMessageId | 0..n | true | None |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 10 | `businessType` | 业务类型 | `bctask.basedoc.CustomerDocVO` | `business_type` |  →  |  |  | Service |  |
| 11 | `projectId` | 项目 | `bd.project.ProjectVO` | `project_id` |  →  |  |  | Service |  |
| 12 | `publishId` | 发布者 | `base.user.User` | `publish_id` |  →  |  |  | Service |  |

### Composition（子表）

- **materialClassList**: `materialClassList` → `purchase.message.PurchaseMessageMaterialClass` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purOrgId` (采购组织) | `org.func.BaseOrg` | `pur_OrgId` |
| `transactionTypeId` (交易类型) | `bd.bill.TransType` | `transaction_type_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `purchaser` (采购员) | `bd.staff.Staff` | `purchaser` |
| `messageTypeId` (商机类型) | `bctask.basedoc.CustomerDocVO` | `message_type_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `businessType` (业务类型) | `bctask.basedoc.CustomerDocVO` | `business_type` |
| `projectId` (项目) | `bd.project.ProjectVO` | `project_id` |
| `publishId` (发布者) | `base.user.User` | `publish_id` |
