---
tags: ["BIP", "元数据", "数据字典", "PO", "po.orderchange.ProductChangeDefineCharacteristics"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生产变更单产品自定义项 (`po.orderchange.ProductChangeDefineCharacteristics`)

> PO | 物理表：`po_order_product_change_dct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生产变更单产品自定义项 |
| 物理表 | `po_order_product_change_dct` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:35:34.9260` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `BM` | 提报需求部门 | `vcol3` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 2 | `DDTZPC1` | DDTZPC1 | `lcol1` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 3 | `MRPcode` | MRP批号 | `vcol2` | String |
| 4 | `YY0199_01_001` | YY0199_01_物料成本分类 | `lcol2` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 5 | `gwq001` | 计划号 | `vcol54` | String |
| 6 | `gwq11111` | gwqMRP专用特征 | `vcol55` | String |
| 7 | `id` | ID | `id` | String |
| 8 | `lzxqfl001` | 绿洲需求分类 | `vcol1` | f48843cb-7ad2-47c8-a0f4-bb451e90022d |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `DDTZPC1` | DDTZPC1 | `st.batchno.Batchno` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `YY0199_01_001` | YY0199_01_物料成本分类 | `pc.cls.ManagementClass` | Service |  |
| 4 | `lzxqfl001` | 绿洲需求分类 | `bd.customerdoc_XQFL.XQFL` | Service |  |
| 5 | `BM` | 提报需求部门 | `bd.adminOrg.AdminOrgVO` | Service |  |
