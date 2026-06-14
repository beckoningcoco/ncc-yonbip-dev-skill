---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.operatingprice.CpuOperatingPrice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 运营价格协议主表 (`mall.operatingprice.CpuOperatingPrice`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`cpu_operating_price` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.operatingprice.CpuOperatingPrice` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 运营价格协议主表 |
| 物理表 | `cpu_operating_price` |
| domain/服务域 | `yonbip-cpu-mall` |
| schema | `cpu_mall` |
| 所属应用 | `ycYuncaiMall` |
| 业务对象ID | `da503180-de80-43d6-bef7-cb1f44fe7c9d` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:00:57.1660` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 协议编号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:40:38:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202512011727_metadata_mall-operatingprice_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `0b315dea-5e05-4648-936a-fc9d29878607`

## 业务场景

- `UITemplate`
- `billcode`
- `userdefine`
- `bpm`

## 术语标记

`BusinessData`, `isMain`

## 约束

- **bizUniqueIndex_transform** (transformKey): 主键 — 唯一字段: `['id']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`
- **bizUniqueIndex** (Unique): 主键 — 唯一字段: `['id']`

## 依赖接口（共 7 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 审批流信息 (`IApprovalFlow`) | `ucfbase.ucfbaseItf.IApprovalFlow` | 177 | 3 |
| 4 | 审批信息 (`IApprovalInfo`) | `ucfbase.ucfbaseItf.IApprovalInfo` | 85 | 2 |
| 5 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 6 | 自动编码 (`IAutoCode`) | `ucfbase.ucfbaseItf.IAutoCode` | 37 | 0 |
| 7 | 审计信息 (`YcIAuditInfo`) | `mall.operatingprice.YcIAuditInfo` | 30 | 2 |

---

## 直接属性（共 40 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `name` | 协议名称 | `name` | String | `text` |  | ✓ |
| 3 | `operatingTenant` | 运营租户 | `operating_tenant` | String | `text` |  | ✓ |
| 4 | `operatingOrg` | 运营部门 | `operating_org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 5 | `cancelReason` | 作废理由 | `cancel_reason` | String | `text` |  | ✓ |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 7 | `code` | 协议编号 | `code` | String | `text` |  | ✓ |
| 8 | `dr` | 逻辑删除标识 | `dr` | Boolean | `switch` |  | ✓ |
| 9 | `purchaserDisplayType` | 采购商卖家显示 | `purchaser_display_type` | Integer | `int` |  | ✓ |
| 10 | `effectiveDate` | 协议生效日期 | `effective_date` | Date | `date` |  | ✓ |
| 11 | `endDate` | 协议失效日期 | `end_date` | Date | `date` |  | ✓ |
| 12 | `state` | 状态 | `state` | Integer | `int` |  | ✓ |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 14 | `status` | 单据状态 | `status` | Integer | `int` |  | ✓ |
| 15 | `addAmount` | 加价金额 | `add_amount` | Decimal | `number` |  | ✓ |
| 16 | `addRate` | 加价百分比 | `add_rate` | Decimal | `number` |  | ✓ |
| 17 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 18 | `auditor` | 审批人 | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 19 | `bustype` | 交易类型 | `iBusType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 20 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 21 | `creatorName` | 创建人名称 | `creatorName` | String | `text` |  | ✓ |
| 22 | `customerId` | 采购商id | `customer_id` | Long | `long` |  | ✓ |
| 23 | `defineCharacterId` | 自定义项特征 | `define_character_id` | da61fe08-a5b2-487f-a8fc-c7d384e7ef7b | `UserDefine` |  | ✓ |
| 24 | `effective` | 是否已生效 0-未生效 1-已生效 | `effective` | Integer | `int` |  | ✓ |
| 25 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 26 | `markupDimension` | 加价维度 | `markup_dimension` | Integer | `int` |  | ✓ |
| 27 | `mode` | 运营模式 | `moded` | Integer | `int` |  | ✓ |
| 28 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 29 | `modifierName` | 修改人名称 | `modifierName` | String | `text` |  | ✓ |
| 30 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 31 | `operatingOrgName` | 运营组织名 | `operating_org_name` | String | `text` |  | ✓ |
| 32 | `orgDirection` | 适用组织维度 | `org_direction` | Integer | `int` |  | ✓ |
| 33 | `orgGroups` | 运营价格协议适用组织分组 | `` | c53470b8-cfb8-4bd3-9f33-1128b7472dad | `` |  |  |
| 34 | `orgs` | 运营价格协议适用组织范围 | `` | e3205937-d01a-46ab-8081-0dda42f9fc04 | `` |  |  |
| 35 | `priceProducts` | 运营价格协议子表 | `` | de39a65e-7538-46bf-8b50-6f90b55d8067 | `` |  |  |
| 36 | `purchasingOrg` | 采购组织 | `purchasing_org` | a4916c85-f087-4e87-a178-0ad37aff7cd0 | `quote` |  | ✓ |
| 37 | `purchasingTenant` | 采购租户 | `purchasing_tenant` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 38 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 39 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 40 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 12 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 2 | `operatingOrg` | 运营部门 | `org.func.BaseOrg` | `operating_org` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `priceProducts` | 运营价格协议子表 | `mall.operatingprice.CpuOperatingPriceProduct` | `` | priceProducts → priceId | 0..n | true | None |  |
| 5 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 6 | `defineCharacterId` | 自定义项特征 | `mall.operatingprice.CpuOperatingPriceCharacter` | `define_character_id` |  →  |  |  | None |  |
| 7 | `auditor` | 审批人 | `base.user.BipUser` | `auditor` |  →  |  |  | Service |  |
| 8 | `orgs` | 运营价格协议适用组织范围 | `mall.operatingprice.CpuOperatingPriceOrg` | `` | orgs → priceId | 0..n | true | None |  |
| 9 | `bustype` | 交易类型 | `bd.bill.TransType` | `iBusType` |  →  |  |  | Service |  |
| 10 | `purchasingOrg` | 采购组织 | `org.func.PurchaseOrg` | `purchasing_org` |  →  |  |  | Service |  |
| 11 | `orgGroups` | 运营价格协议适用组织分组 | `mall.operatingprice.CpuOperatingPriceOrgGroup` | `` | orgGroups → priceId | 0..n | true | None |  |
| 12 | `purchasingTenant` | 采购租户 | `cpu-privilege.enterprise.EnterprisePOJO` | `purchasing_tenant` |  →  |  |  | Service |  |

### Composition（子表）

- **priceProducts**: `priceProducts` → `mall.operatingprice.CpuOperatingPriceProduct` | 0..n
- **orgs**: `orgs` → `mall.operatingprice.CpuOperatingPriceOrg` | 0..n
- **orgGroups**: `orgGroups` → `mall.operatingprice.CpuOperatingPriceOrgGroup` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `operatingOrg` (运营部门) | `org.func.BaseOrg` | `operating_org` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `auditor` (审批人) | `base.user.BipUser` | `auditor` |
| `bustype` (交易类型) | `bd.bill.TransType` | `iBusType` |
| `purchasingOrg` (采购组织) | `org.func.PurchaseOrg` | `purchasing_org` |
| `purchasingTenant` (采购租户) | `cpu-privilege.enterprise.EnterprisePOJO` | `purchasing_tenant` |
