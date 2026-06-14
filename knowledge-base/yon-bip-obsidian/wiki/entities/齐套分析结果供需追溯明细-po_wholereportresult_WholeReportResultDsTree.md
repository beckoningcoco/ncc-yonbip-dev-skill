---
tags: ["BIP", "元数据", "数据字典", "PO", "po.wholereportresult.WholeReportResultDsTree"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 齐套分析结果供需追溯明细 (`po.wholereportresult.WholeReportResultDsTree`)

> PO | 物理表：`po_whole_result_ds_tree`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 齐套分析结果供需追溯明细 |
| 物理表 | `po_whole_result_ds_tree` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:34:27.4480` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 2 | `departmentId` | 部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 3 | `dsDate` | 需求/供应日期 | `ds_date` | DateTime |
| 4 | `dsOrgId` | 需求/供应组织 | `ds_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 5 | `dsSign` | 需求/供应标识 | `ds_sign` | Integer |
| 6 | `dsType` | 需求/供应类型 | `ds_type` | Integer |
| 7 | `expLevel` | 备料层级 | `exp_level` | Integer |
| 8 | `id` | ID | `id` | Long |
| 9 | `lineNo` | 子件行号 | `line_no` | Decimal |
| 10 | `matchQuantity` | 齐套量 | `match_quantity` | Decimal |
| 11 | `orderCode` | 单据号 | `order_code` | String |
| 12 | `orderLineNo` | 订单行号 | `order_line_no` | Decimal |
| 13 | `parentId` | 父节点ID | `parent_id` | Long |
| 14 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |
| 16 | `remark` | 备注 | `remark` | String |
| 17 | `reserveid` | 跟踪线索id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 18 | `resultId` | 齐套分析结果id | `result_id` | 93dfc464-b9cb-49dc-b925-d6dcde23f2ae |
| 19 | `surplusQuantity` | 需求/供应余量 | `surplus_quantity` | Decimal |
| 20 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 21 | `voucherQuantity` | 需求/供应原量 | `voucher_quantity` | Decimal |
| 22 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 23 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 24 | `wholeSetQuantity` | 可齐套量 | `whole_set_quantity` | Decimal |
| 25 | `wrrDsId` | 供需明细信息 | `wrr_ds_id` | 208fc55e-7717-4237-b6f0-07aaed5de2d6 |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `reserveid` | 跟踪线索id | `st.reservation.Reservation` | Service |  |
| 2 | `resultId` | 齐套分析结果id | `po.wholereportresult.WholeReportResult` | None | true |
| 3 | `wrrDsId` | 供需明细信息 | `po.wholereportresult.WholeReportResultDs` | None |  |
| 4 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 5 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `departmentId` | 部门 | `aa.baseorg.DeptMV` | Service |  |
| 8 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 9 | `dsOrgId` | 需求/供应组织 | `org.func.BaseOrg` | Service |  |
| 10 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 11 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
