---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplystatuschange.SupplyStatusChange"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 状态变更单表 (`cpu-supplymgr.supplystatuschange.SupplyStatusChange`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_supply_status_change` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplystatuschange.SupplyStatusChange` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 状态变更单表 |
| 物理表 | `cpu_supply_status_change` |
| domain/服务域 | `cpu-supplymgr` |
| schema | `cpu_suppliermgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `580b57af-9549-4b04-ae59-8122d9e8f92b` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:51.3040` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |
| 编码 | `code` | `code` | String | 申请编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:45:53:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202601151119_metadata_cpu-supplymgr-supplystatuschange_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `e84be11b-f156-425d-b5da-fceda04206d7`

## 业务场景

- `workflow`
- `DataAuth`
- `imextmp`
- `billcode`
- `userdefine`
- `msgtemplate`
- `api`

## 术语标记

`BusinessData`, `data_auth`

## 约束

- **migration_id** (MetaClassPrimary): id — 唯一字段: `['id']`

## 依赖接口（共 7 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 4 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 5 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |
| 6 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |
| 7 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |

---

## 直接属性（共 54 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `applyPeopleId` | 申请人 | `apply_people_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 2 | `approvePeopleId` | 审批人 | `approve_people_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 3 | `billNo` | 单据号 | `bill_no` | String | `text` |  | ✓ |
| 4 | `code` | 申请编码 | `code` | String | `text` |  | ✓ |
| 5 | `createTime` | 创建日期 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 6 | `billStatus` | 单据审批状态 | `bill_status` | billstatus | `` |  | ✓ |
| 7 | `transType` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 8 | `transTypeName` | 交易类型名称 | `trans_type_name` | String | `text` |  | ✓ |
| 9 | `isEntrust` | 变更类型枚举值 | `is_entrust` | String | `text` |  | ✓ |
| 10 | `userDefineCharacter` | 供应商状态变更特征 | `user_define_character` | 0dff993b-f9d6-49a5-ab2f-4d24da235665 | `UserDefine` |  | ✓ |
| 11 | `categoryId` | 供应商 | `category_id` | f4ad7e8e-0903-40e5-befb-ac6fcef517c3 | `quote` |  | ✓ |
| 12 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 13 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 14 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 15 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 16 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 17 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 18 | `sourceid` | 上游单据主表id | `sourceid` | Long | `long` |  | ✓ |
| 19 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 20 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 21 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |
| 22 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 23 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 24 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String | `text` |  | ✓ |
| 25 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 26 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 27 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 28 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 29 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 30 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 31 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 32 | `deptionId` | 申请部门 | `deption_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 33 | `documentId` | 附件 | `document_id` | String | `text` |  | ✓ |
| 34 | `enterpriseId` | 租户 | `enterprise_id` | Long | `long` |  | ✓ |
| 35 | `enterpriseName` | 租户名称 | `enterprise_name` | String | `text` |  | ✓ |
| 36 | `fileId` | 说明文件 | `file_id` | String | `text` |  | ✓ |
| 37 | `granularity` | 变更粒度 | `granularity` | String | `text` |  | ✓ |
| 38 | `id` | id | `id` | Long | `long` |  | ✓ |
| 39 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 40 | `orgId` | 申请组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 41 | `pubts` | 申请日期 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 42 | `relationBusinessCode` | 关联业务编码 | `relation_business_code` | String | `text` |  | ✓ |
| 43 | `relationBusinessId` | 关联业务 | `relation_business_id` | d5cac30c-7904-41aa-8534-1e947eb2dcb4 | `quote` |  | ✓ |
| 44 | `relationBusinessName` | 关联业务名称 | `relation_business_name` | String | `text` |  | ✓ |
| 45 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 46 | `souringType` | 来源业务 | `souring_type` | Long | `long` |  | ✓ |
| 47 | `status` | 状态 | `status` | status | `` |  | ✓ |
| 48 | `synergyVendor` | 协同供应商 | `synergy_vendor` | String | `text` |  | ✓ |
| 49 | `title` | 申请标题 | `title` | String | `text` |  | ✓ |
| 50 | `ts` | 更新日期 | `ts` | DateTime | `timestamp` |  | ✓ |
| 51 | `type` | 申请类型 | `type` | String | `text` |  | ✓ |
| 52 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 53 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 54 | `details` | 状态变更单详情表 | `` | 5863649d-a056-498a-bb52-39da58aa4064 | `` |  |  |

---

## 关联属性（共 14 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `approvePeopleId` | 审批人 | `bd.staff.Staff` | `approve_people_id` |  →  |  |  | Service |  |
| 2 | `relationBusinessId` | 关联业务 | `cpu-supplymgr.supplystatuschangerelationbusiness.SupplyStatusRelationBusiness` | `relation_business_id` |  →  |  |  | None |  |
| 3 | `applyPeopleId` | 申请人 | `bd.staff.Staff` | `apply_people_id` |  →  |  |  | Service |  |
| 4 | `userDefineCharacter` | 供应商状态变更特征 | `cpu-supplymgr.supplystatuschange.SupplyStatusChangeCharacter` | `user_define_character` |  →  |  |  | None |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 6 | `deptionId` | 申请部门 | `org.func.BaseOrg` | `deption_id` |  →  |  |  | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 9 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 10 | `orgId` | 申请组织 | `org.func.BaseOrg` | `org_id` |  →  |  |  | Service |  |
| 11 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 12 | `transType` | 交易类型id | `bd.bill.TransType` | `trans_type_id` |  →  |  |  | Service |  |
| 13 | `details` | 状态变更单详情表 | `cpu-supplymgr.supplystatuschange.SupplyStatusDetail` | `` | details → changeId | 1..n | true | None |  |
| 14 | `categoryId` | 供应商 | `cpubase.supplycategory.Supplycategory` | `category_id` |  →  |  |  | Service |  |

### Composition（子表）

- **details**: `details` → `cpu-supplymgr.supplystatuschange.SupplyStatusDetail` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `approvePeopleId` (审批人) | `bd.staff.Staff` | `approve_people_id` |
| `applyPeopleId` (申请人) | `bd.staff.Staff` | `apply_people_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `deptionId` (申请部门) | `org.func.BaseOrg` | `deption_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `bizFlow` (流程ID) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `orgId` (申请组织) | `org.func.BaseOrg` | `org_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `transType` (交易类型id) | `bd.bill.TransType` | `trans_type_id` |
| `categoryId` (供应商) | `cpubase.supplycategory.Supplycategory` | `category_id` |
