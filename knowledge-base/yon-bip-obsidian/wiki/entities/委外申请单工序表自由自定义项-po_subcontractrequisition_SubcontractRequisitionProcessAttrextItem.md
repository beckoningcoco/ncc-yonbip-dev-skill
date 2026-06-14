---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractrequisition.SubcontractRequisitionProcessAttrextItem"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外申请单工序表自由自定义项 (`po.subcontractrequisition.SubcontractRequisitionProcessAttrextItem`)

> OSM | 物理表：`po_subcontract_requisition_process_attrextItem`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外申请单工序表自由自定义项 |
| 物理表 | `po_subcontract_requisition_process_attrextItem` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:59:01.9830` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` |  |  |

---

## 直接属性（1个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
