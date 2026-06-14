---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractchange.OsmOrderByProductChangeDefineCharacteristics"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单变更联副产品自定义项 (`po.subcontractchange.OsmOrderByProductChangeDefineCharacteristics`)

> OSM | 物理表：`osm_order_byproduct_change_dct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单变更联副产品自定义项 |
| 物理表 | `osm_order_byproduct_change_dct` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:58:07.0220` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（6个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `DDTZPC1` | DDTZPC1 | `lcol1` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 2 | `YY0199_01_001` | YY0199_01_物料成本分类 | `lcol2` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 3 | `id` | ID | `id` | String |
| 4 | `lzxqfl001` | 绿洲需求分类 | `vcol1` | f48843cb-7ad2-47c8-a0f4-bb451e90022d |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `DDTZPC1` | DDTZPC1 | `st.batchno.Batchno` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `YY0199_01_001` | YY0199_01_物料成本分类 | `pc.cls.ManagementClass` | Service |  |
| 4 | `lzxqfl001` | 绿洲需求分类 | `bd.customerdoc_XQFL.XQFL` | Service |  |
