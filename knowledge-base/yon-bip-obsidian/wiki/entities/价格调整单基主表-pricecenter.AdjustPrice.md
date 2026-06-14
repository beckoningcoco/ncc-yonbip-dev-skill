---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "yc.pricecenter.AdjustPrice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格调整单基主表 (`yc.pricecenter.AdjustPrice`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`pu_adjustprice` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `yc.pricecenter.AdjustPrice` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格调整单基主表 |
| 物理表 | `pu_adjustprice` |
| domain/服务域 | `yuncai-upu-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `42a87ff3-c7bf-4f78-a68d-e13a5eb53bd9` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:04.6550` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主表关联标识ID |

## 部署信息

- **部署时间**: 2026-05-22 23:52:52:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202601121806_metadata_yc-pricecenter_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `c4f5772f-f4a3-413e-98c2-663a2fcf4b49`

## 业务场景

- `workflow`
- `DataAuth`
- `transtype`
- `isCoreBill`
- `userdefine`
- `prewarning`
- `extdevelop`
- `FieldAuth`
- `print`
- `UITemplate`
- `imextmp`
- `report`
- `billcode`
- `ruleengine`
- `msgtemplate`
- `api`
- `bpm`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`, `dataAuth`

## 约束

- **id** (transformKey): 主键 — 唯一字段: `['id']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 7 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 2 | 表头整单合计信息 (`IHeadTotalData`) | `retail.voucher.IHeadTotalData` | 62 | 1 |
| 3 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 4 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 5 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 6 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |
| 7 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |

---

## 直接属性（共 48 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `taxPriority` | 价格标识 | `tax_priority` | taxPriority | `` |  | ✓ |
| 2 | `id` | 主表关联标识ID | `id` | Long | `long` |  | ✓ |
| 3 | `ytenant` | 租户id | `ytenant_id` | String | `text` | ✓ | ✓ |
| 4 | `AdjustPriceDefineCharacter` | 价格调整单表头自定义项 | `adjustprice_definenew` | a74d169a-fe6d-4ab2-acc7-3ff44aab3b35 | `UserDefine` |  | ✓ |
| 5 | `isBegin` | 期初 | `is_begin` | Decimal | `number` |  | ✓ |
| 6 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 7 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 8 | `sourceid` | 上游单据主表id | `sourceid` | Long | `long` |  | ✓ |
| 9 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 10 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 11 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |
| 12 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 13 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 14 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String | `text` |  | ✓ |
| 15 | `organizationId` | 组织id | `organization_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 16 | `code` | 调价单号 | `code` | String | `text` |  | ✓ |
| 17 | `vouchdate` | 调价日期 | `vouchdate` | Date | `date` |  | ✓ |
| 18 | `adjustPriceDepartmentId` | 调价部门 | `adjust_price_department_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 19 | `adjustPricePersonId` | 调价员 | `adjust_price_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 20 | `priceFlag` | 是否含税 | `price_flag` | PriceFlag | `` |  | ✓ |
| 21 | `supplyType` | 供应类型 | `supply_type` | SupplyType | `` |  | ✓ |
| 22 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 23 | `status` | 单据状态 | `status` | Short | `short` |  | ✓ |
| 24 | `creator` | 制单人 | `creator` | String | `text` |  | ✓ |
| 25 | `createDate` | 制单日期 | `create_date` | Date | `date` |  | ✓ |
| 26 | `createTime` | 制单时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 27 | `auditor` | 审核人 | `auditor` | String | `text` |  | ✓ |
| 28 | `auditDate` | 审核日期 | `audit_date` | Date | `date` |  | ✓ |
| 29 | `auditTime` | 审核时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 30 | `modifier` | 修改人 | `modifier` | String | `text` |  | ✓ |
| 31 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 32 | `auditorId` | 审核人Id | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 33 | `modifierId` | 修改人Id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 34 | `creatorId` | 制单人Id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 35 | `isWfControlled` | 是否审批流 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 36 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 37 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 38 | `bustype` | 交易类型 | `iBusType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 39 | `businessType` | 业务类型 | `business_type` | BusinessType | `` |  | ✓ |
| 40 | `totalQuantity` | 整单数量 | `fTotalQuantity` | Decimal | `number` |  | ✓ |
| 41 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 42 | `bizstatus` | 单据状态 | `bizStatus` | String | `text` |  | ✓ |
| 43 | `tplid` | 模板id | `tplid` | Long | `long` |  | ✓ |
| 44 | `tenant` | 租户 | `tenant_id` | Long | `long` |  | ✓ |
| 45 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 46 | `adjustpricedetail` | 价格调整单明细表 | `` | 54b058a8-1f9c-4d2e-ab56-0d8bf5a29996 | `` |  |  |
| 47 | `applicableorganization` | 价格调整单适用组织表 | `` | e4655eaf-413e-4088-89b3-a6d64a1d475a | `` |  |  |
| 48 | `defines` | 价格调整单主表自由自定义项 | `` | 28c95799-302c-4778-b5b5-f6a4afc2ead9 | `` |  |  |

---

## 关联属性（共 12 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `organizationId` | 组织id | `org.func.BaseOrg` | `organization_id` |  →  |  |  | Service |  |
| 2 | `auditorId` | 审核人Id | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 3 | `creatorId` | 制单人Id | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 4 | `modifierId` | 修改人Id | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 5 | `adjustPriceDepartmentId` | 调价部门 | `bd.adminOrg.AdminOrgVO` | `adjust_price_department_id` |  →  |  |  | Service |  |
| 6 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 7 | `applicableorganization` | 价格调整单适用组织表 | `yc.pricecenter.ApplicableOrganization` | `` | applicableorganization → adjustPriceId | 1..n | true | None |  |
| 8 | `adjustpricedetail` | 价格调整单明细表 | `yc.pricecenter.AdjustPriceDetail` | `` | adjustpricedetail → adjustPriceId | 1..n | true | None |  |
| 9 | `adjustPricePersonId` | 调价员 | `bd.staff.Staff` | `adjust_price_person_id` |  →  |  |  | Service |  |
| 10 | `AdjustPriceDefineCharacter` | 价格调整单表头自定义项 | `yc.pricecenter.AdjustPriceDefineNew` | `adjustprice_definenew` |  →  |  |  | None |  |
| 11 | `bustype` | 交易类型 | `bd.bill.TransType` | `iBusType` |  →  |  |  | Service |  |
| 12 | `defines` | 价格调整单主表自由自定义项 | `yc.pricecenter.AdjustPriceDefine` | `` | defines → id | 1 | true | None | ⚠️ |

### Composition（子表）

- **applicableorganization**: `applicableorganization` → `yc.pricecenter.ApplicableOrganization` | 1..n
- **adjustpricedetail**: `adjustpricedetail` → `yc.pricecenter.AdjustPriceDetail` | 1..n
- **defines**: `defines` → `yc.pricecenter.AdjustPriceDefine` | 1 ⚠️ 已废弃

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `organizationId` (组织id) | `org.func.BaseOrg` | `organization_id` |
| `auditorId` (审核人Id) | `base.user.User` | `auditorId` |
| `creatorId` (制单人Id) | `base.user.User` | `creatorId` |
| `modifierId` (修改人Id) | `base.user.User` | `modifierId` |
| `adjustPriceDepartmentId` (调价部门) | `bd.adminOrg.AdminOrgVO` | `adjust_price_department_id` |
| `bizFlow` (流程ID) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `adjustPricePersonId` (调价员) | `bd.staff.Staff` | `adjust_price_person_id` |
| `bustype` (交易类型) | `bd.bill.TransType` | `iBusType` |
