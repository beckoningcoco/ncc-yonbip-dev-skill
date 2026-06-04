---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.productShelvesApproval.Approval"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 审批申请 (`mall.productShelvesApproval.Approval`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`cpu_productshelves_approval` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.productShelvesApproval.Approval` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 审批申请 |
| 物理表 | `cpu_productshelves_approval` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycYuncaiMall` |
| 业务对象ID | `e4529c8d-df05-4332-bcab-86c20a219229` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:00:30.1160` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | String | ID |
| 编码 | `code` | `code` | String | 申请单号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:38:02:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202511132004_metadata_mall-productShelvesApproval.zip`
- **安装人**: mongoTools
- **安装排名**: `0369c8f0-b464-4ab7-a2a2-c06b7228254d`

## 业务场景

- `dataMultilanguage`
- `UITemplate`
- `transtype`
- `billcode`
- `SaveEffective`
- `bpm`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 6 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 自动编码 (`IAutoCode`) | `ucfbase.ucfbaseItf.IAutoCode` | 37 | 0 |
| 2 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 3 | 审批信息 (`IApprovalInfo`) | `ucfbase.ucfbaseItf.IApprovalInfo` | 85 | 2 |
| 4 | 审批流信息 (`IApprovalFlow`) | `ucfbase.ucfbaseItf.IApprovalFlow` | 177 | 3 |
| 5 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 6 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 18 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `applyOrgId` | 申请组织Id | `apply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 2 | `applyReason` | 申请原因 | `apply_reason` | String | `text` |  | ✓ |
| 3 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 4 | `auditor` | 审批人 | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 5 | `code` | 申请单号 | `code` | String | `text` |  | ✓ |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 7 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 8 | `details` | 审批申请明细 | `` | 77172c5d-9a5e-4b1a-9ede-ed31fe2cad2b | `` |  |  |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 10 | `id` | ID | `id` | String | `text` |  | ✓ |
| 11 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 12 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 15 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 16 | `transtypeId` | 申请类型id | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 17 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 7 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 2 | `applyOrgId` | 申请组织Id | `org.func.BaseOrg` | `apply_org_id` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 5 | `auditor` | 审批人 | `base.user.BipUser` | `auditor` |  →  |  |  | Service |  |
| 6 | `details` | 审批申请明细 | `mall.productShelvesApproval.ApprovalDetail` | `` | details → approvalId | 1..n | true | None |  |
| 7 | `transtypeId` | 申请类型id | `bd.bill.TransType` | `transtype_id` |  →  |  |  | Service |  |

### Composition（子表）

- **details**: `details` → `mall.productShelvesApproval.ApprovalDetail` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `applyOrgId` (申请组织Id) | `org.func.BaseOrg` | `apply_org_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `auditor` (审批人) | `base.user.BipUser` | `auditor` |
| `transtypeId` (申请类型id) | `bd.bill.TransType` | `transtype_id` |
