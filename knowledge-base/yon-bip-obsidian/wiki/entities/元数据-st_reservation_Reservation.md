---
tags: [BIP, 元数据, 数据字典, st, st.reservation.Reservation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 跟踪线索 (`st.reservation.Reservation`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_reservation` | 应用: `ST` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 跟踪线索 |
| 物理表 | `st_reservation` |
| 应用 | `ST` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-01-14 02:08:25:000
- 安装来源: `/app/newustock/src/yonbip-scm-scmf/scripts/db/patch/mongodb/V5_R0_2507/0002_stock/0010_iuap_common/DML/0270_iuap_metadata/202512/202512251633_metadata_st-reservation_delta.zip`

## 术语标记

`BusinessData`, `data_auth`, `isMain`, `isMultiCodeRule`, `isUseCondition`

## 依赖接口（4 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IDemandType(类型) (`IDemandType`) | `st.reservation.IDemandType` | 33 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| projectStructureProperties (`projectStructureProperties`) | `BGDM.wbs.projectStructureProperties` | 49 | 2 |

---

## 全部属性（34 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `typeid` | typeid | `typeid` | 4c3758da-bf55-4619-a4c4-138e0382edde | `quote` |  | true |
| 2 | `demandtype` | emandtype(日期) | `demandtype` | Integer | `int` |  | true |
| 3 | `reservebilltype` | reservebilltype | `reservebilltype` | String | `text` |  | true |
| 4 | `reservebillautoid` | reservebillautoid | `reservebillautoid` | 3722d563-08aa-453d-ac82-6b8cf906b1ab | `quote` |  | true |
| 5 | `reserverowno` | reserverowno | `reserverowno` | Decimal | `number` |  | true |
| 6 | `project` | project | `project` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | true |
| 7 | `department` | epartment(日期) | `department` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | `quote` |  | true |
| 8 | `operator` | operator | `operator` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 9 | `reservationDefineCharacter` | reservationDefineCharacter | `reservationDefineCharacter` | bcce9918-15b5-43da-99d9-e68322a7e9bb | `UserDefine` |  | true |
| 10 | `clueType` | clueType(类型) | `clueType` | Short | `short` |  | true |
| 11 | `coSourceType` | coSourceType(类型) | `coSourceType` | String | `text` |  | true |
| 12 | `coSourceCode` | coSource编码 | `coSourceCode` | String | `text` |  | true |
| 13 | `coSourceId` | coSourceId | `coSourceId` | Long | `long` |  | true |
| 14 | `coSourceAutoId` | coSourceAutoId | `coSourceAutoId` | Long | `long` |  | true |
| 15 | `coSourceLineNo` | oSourceLineNo | `coSourceLineNo` | Decimal | `number` |  | true |
| 16 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 17 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 18 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 20 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 21 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 22 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 23 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 24 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 25 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |  | true |
| 26 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |  | true |
| 27 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 28 | `code` | 编码 | `code` | String | `text` |  | true |
| 29 | `name` | 名称 | `name` | String | `text` |  | true |
| 30 | `reservecust` | reservecust | `reservecust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 31 | `reservebillcode` | reservebillcode | `reservebillcode` | String | `text` |  | true |
| 32 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 33 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 34 | `reservebillid` | reservebillid | `reservebillid` | c7c0beb4-f830-486d-83e1-51072b319fd2 | `quote` |  | true |

## 关联属性（14 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `activity` | activity | `pgrm.projecttask.ProjectScheduleTask` | `activity` | 外键 |  |  | Service |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 3 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 4 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 5 | `project` | project | `bd.project.ProjectVO` | `project` | 外键 |  |  | Service |  |
| 6 | `reservecust` | reservecust | `aa.merchant.Merchant` | `reservecust` | 外键 |  |  | Service |  |
| 7 | `wbs` | wbs | `BGDM.wbs.wbs_doc` | `wbs` | 外键 |  |  | Service |  |
| 8 | `reservebillid` | reservebillid | `voucher.order.Order` | `reservebillid` | 外键 |  |  | Service |  |
| 9 | `operator` | operator | `bd.staff.Staff` | `operator` | 外键 |  |  | Service |  |
| 10 | `reservebillautoid` | reservebillautoid | `voucher.order.OrderDetail` | `reservebillautoid` | 外键 |  |  | Service |  |
| 11 | `typeid` | typeid | `st.reservation.ReservationType` | `typeid` | 外键 |  |  | None |  |
| 12 | `department` | epartment(日期) | `aa.baseorg.DeptMV` | `department` | 外键 |  |  | Service |  |
| 13 | `reservationDefineCharacter` | reservationDefineCharacter | `st.reservation.ReservationDefineCharacter` | `reservationDefineCharacter` | 外键 |  |  | None |  |
| 14 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT typeid, demandtype, reservebilltype, reservebillautoid, reserverowno, project, department, operator
FROM st_reservation
```