---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.dfmCheck.QmsDfmCheckCoordLog"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验协同日志 (`QMSDFM.dfmCheck.QmsDfmCheckCoordLog`)

> QIC | 物理表：`qms_dfm_check_coord_log`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验协同日志 |
| 物理表 | `qms_dfm_check_coord_log` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:44:19.9510` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `checkRecordId` | 检验记录id | `check_record_id` | 631cb01f-3080-4010-9744-e5b5bea34d6a |
| 4 | `checkbillId` | 检验单id | `checkbill_id` | String |
| 5 | `checkBillNo` | 检验单号 | `check_bill_no` | String |
| 6 | `sourceBillNo` | 来源单号 | `source_bill_no` | String |
| 7 | `coordStatus` | 协同状态 | `coord_status` | String |
| 8 | `purchaseRemark` | 供应商反馈 | `purchase_remark` | String |
| 9 | `operUser` | 操作人 | `oper_user` | String |
| 10 | `operTime` | 操作时间 | `oper_time` | DateTime |
| 11 | `actionMethod` | 动作 | `action_method` | String |
| 12 | `tenant` | 租户ID | `tenant_id` | String |
| 13 | `dr` | 逻辑删除标记 | `dr` | Short |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `checkRecordId` | 检验记录id | `QMSDFM.dfmCheck.QmsDfmCheckRecord` | None | true |
