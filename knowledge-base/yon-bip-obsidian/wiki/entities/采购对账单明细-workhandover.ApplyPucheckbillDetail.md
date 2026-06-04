---
tags: ["BIP", "元数据", "数据字典", "ycBase", "workhandover.workhandover.ApplyPucheckbillDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购对账单明细 (`workhandover.workhandover.ApplyPucheckbillDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_workhandover_pucheckbill_detail` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `workhandover.workhandover.ApplyPucheckbillDetail` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购对账单明细 |
| 物理表 | `cpu_workhandover_pucheckbill_detail` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:19:16.1530` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2024-11-22 23:13:10:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V3_R6_2407/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202410281345_metadata_workhandover-workhandover_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `538701fd-95b1-49c7-8948-4d6dbcd0f220`

## 术语标记

`BusinessData`, `skipReferenceCheck`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |

---

## 直接属性（共 15 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 3 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 6 | `handOverSuccess` | 移交成功 | `handover_success` | Boolean | `switch` |  | ✓ |
| 7 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 8 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 9 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 10 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 13 | `pucheckbill` | 采购对账单 | `pucheckbill` | 0e70a14d-2339-4067-9754-340c3292e12b | `quote` |  | ✓ |
| 14 | `workHandOverApplyId` | 工作移交申请主键 | `apply_id` | 6b0dec6e-46be-451e-be36-cb6da4650912 | `quote` |  | ✓ |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `workHandOverApplyId` | 工作移交申请主键 | `workhandover.workhandover.Apply` | `apply_id` | pucheckbillDetailList → workHandOverApplyId | 0..n | true | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 5 | `pucheckbill` | 采购对账单 | `check.pucheckbill.PuCheckBillVO` | `pucheckbill` |  →  |  |  | Service |  |

### Composition（子表）

- **workHandOverApplyId**: `pucheckbillDetailList` → `workhandover.workhandover.Apply` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `pucheckbill` (采购对账单) | `check.pucheckbill.PuCheckBillVO` | `pucheckbill` |
