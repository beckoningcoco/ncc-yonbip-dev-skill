---
tags: ["BIP", "元数据", "数据字典", "PO", "po.wholescheme.WholeScheme"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 齐套分析方案 (`po.wholescheme.WholeScheme`)

> PO | 物理表：`po_wholescheme_head`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 齐套分析方案 |
| 物理表 | `po_wholescheme_head` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:34:29.2820` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `productionDepartmentId` | 生产部门 | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 5 | `name` | 名称 | `name` | String |
| 6 | `remark` | 备注 | `remark` | String |
| 7 | `startDate` | 开工日期 | `start_date` | DateTime |
| 8 | `isHold` | 是否挂起 | `is_hold` | Short |
| 9 | `prospectDay` | 展望天数 | `prospect_day` | Integer |
| 10 | `bizStatuses` | 业务状态 | `biz_statuses` | String |
| 11 | `analyseSequence` | 订单优先级 | `analyse_sequence` | Short |
| 12 | `isAppliedRestQty` | 是否考虑待出库数量 | `is_applied_restqty` | Short |
| 13 | `materialRange` | 物料范围 | `material_range` | String |
| 14 | `allocationStrategy` | 调拨策略 | `allocation_strategy` | Short |
| 15 | `bizType` | 业务类型 | `biz_type` | String |
| 16 | `billSource` | 生单来源 | `bill_source` | Short |
| 17 | `subcontractVendorId` | 委外供应商 | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 18 | `code` | 编码 | `code` | String |
| 19 | `stopstatus` | 停用状态 | `stopstatus` | Boolean |
| 20 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `occupyStrategy` | 占用策略 | `occupy_strategy` | OccupyStrategyEnum |
| 23 | `wholeSchemeDocType` | 齐套方案供应来源 | `` | 6d995f35-d218-415c-ac31-4d11beb7bd14 |
| 24 | `wholeSchemeSupply` | 齐套方案供应范围 | `` | 9a0251e3-f451-45a6-b40d-f5b84e384aee |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `subcontractVendorId` | 委外供应商 | `aa.vendor.Vendor` | Service |  |
| 2 | `wholeSchemeSupply` | 齐套方案供应范围 | `po.wholescheme.WholeSchemeSupply` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `productionDepartmentId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 5 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 6 | `wholeSchemeDocType` | 齐套方案供应来源 | `po.wholescheme.WholeSchemeDocType` | None | true |
