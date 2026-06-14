---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.supplycategoryapplication.SupplycategoryApplicationVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供货目录申请 (`cpubase.supplycategoryapplication.SupplycategoryApplicationVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_supplycategory_application` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.supplycategoryapplication.SupplycategoryApplicationVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供货目录申请 |
| 物理表 | `cpu_supplycategory_application` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `8146331d-fc1b-4001-a2a5-d56ee0137f0a` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:46.8450` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |
| 编码 | `code` | `code` | String | 编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:52:54:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202601132041_metadata_cpubase-supplycategoryapplication_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `fb823d12-f19c-40d9-ae80-2b471e37ecc7`

## 业务场景

- `workflow`
- `DataAuth`
- `transtype`
- `userdefine`
- `classified`
- `prewarning`
- `FieldAuth`
- `print`
- `UITemplate`
- `imextmp`
- `billcode`
- `ruleengine`
- `msgtemplate`
- `bpm`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 8 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 3 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 4 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 5 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |
| 6 | 租户接口 (`ITenant`) | `ucfbase.ucfbaseItf.ITenant` | 77 | 1 |
| 7 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 8 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |

---

## 直接属性（共 34 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `purchaseOrgId` | 所属组织 | `purchase_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 2 | `vouchdate` | 申请日期 | `vouchdate` | DateTime | `timestamp` | ✓ | ✓ |
| 3 | `tenant` | 租户id | `ytenant_id` | String | `text` |  | ✓ |
| 4 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 5 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 7 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 8 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 9 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 10 | `bustype` | 交易类型 | `iBusType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 11 | `applyDepartmentId` | 申请部门id | `applyDepartmentId` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 12 | `applyPersonId` | 申请人员 | `apply_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 13 | `applyReason` | 申请原因 | `apply_reason` | String | `text` |  | ✓ |
| 14 | `applyMemo` | 申请备注 | `apply_memo` | String | `text` |  | ✓ |
| 15 | `supplyDocId` | 供应商企业 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 16 | `SupplycategoryApplicationDefineCharacter` | 供货目录申请表头自定义项 | `defineCharacter` | 3b5caf4c-e015-4338-9221-49df8da12f41 | `UserDefine` |  | ✓ |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 18 | `status` | 单据状态 | `status` | Short | `short` |  | ✓ |
| 19 | `ytenant` | 租户id | `ytenant_id` | String | `text` | ✓ | ✓ |
| 20 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 22 | `creator` | 创建人 | `creator` | String | `text` |  | ✓ |
| 23 | `modifier` | 修改人 | `modifier` | String | `text` |  | ✓ |
| 24 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 25 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 26 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 27 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 28 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 29 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 30 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 31 | `auditor` | 审批人 | `auditor` | String | `text` |  | ✓ |
| 32 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 33 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 34 | `application_bodyvos` | 供货目录申请表体 | `` | 9234c578-9d4d-4b4d-b11b-9a8420a718ce | `` |  |  |

---

## 关联属性（共 11 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 4 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 5 | `applyDepartmentId` | 申请部门id | `org.func.BaseOrg` | `applyDepartmentId` |  →  |  |  | Service |  |
| 6 | `applyPersonId` | 申请人员 | `bd.staff.Staff` | `apply_person_id` |  →  |  |  | Service |  |
| 7 | `supplyDocId` | 供应商企业 | `aa.vendor.Vendor` | `supplydoc_id` |  →  |  |  | Service |  |
| 8 | `purchaseOrgId` | 所属组织 | `org.func.BaseOrg` | `purchase_org_id` |  →  |  |  | Service |  |
| 9 | `SupplycategoryApplicationDefineCharacter` | 供货目录申请表头自定义项 | `cpubase.supplycategoryapplication.SupplycategoryApplicationDefineNew` | `defineCharacter` |  →  |  |  | None |  |
| 10 | `bustype` | 交易类型 | `bd.bill.TransType` | `iBusType` |  →  |  |  | Service |  |
| 11 | `application_bodyvos` | 供货目录申请表体 | `cpubase.supplycategoryapplication.SupplycategoryApplicationBodyVO` | `` | application_bodyvos → supAppliId | 1..n | true | None |  |

### Composition（子表）

- **application_bodyvos**: `application_bodyvos` → `cpubase.supplycategoryapplication.SupplycategoryApplicationBodyVO` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `bizFlow` (流程ID) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `applyDepartmentId` (申请部门id) | `org.func.BaseOrg` | `applyDepartmentId` |
| `applyPersonId` (申请人员) | `bd.staff.Staff` | `apply_person_id` |
| `supplyDocId` (供应商企业) | `aa.vendor.Vendor` | `supplydoc_id` |
| `purchaseOrgId` (所属组织) | `org.func.BaseOrg` | `purchase_org_id` |
| `bustype` (交易类型) | `bd.bill.TransType` | `iBusType` |
