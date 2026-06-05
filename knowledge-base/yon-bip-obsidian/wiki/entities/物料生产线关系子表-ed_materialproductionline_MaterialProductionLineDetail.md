---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.materialproductionline.MaterialProductionLineDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 物料生产线关系子表 (`ed.materialproductionline.MaterialProductionLineDetail`)

> ED | 物理表：`ed_material_prod_line_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料生产线关系子表 |
| 物理表 | `ed_material_prod_line_detail` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 14:00:21.1740` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dailyOutput` | 日产量 | `daily_output` | Decimal |
| 2 | `dependProductionLineRate` | 依产线速率 | `depend_prod_line_rate` | Short |
| 3 | `id` | ID | `id` | Long |
| 4 | `materialProdLineDetailDct` | 自定义项特征属性组 | `m_prod_line_d_dct` | aed70891-49d4-4527-8358-182b0101e81e |
| 5 | `materialProductionLineId` | 物料生产线关系Id | `material_prod_line_id` | edb229e2-ff7c-4076-9945-5420433038ec |
| 6 | `outputUnit` | 产量单位 | `output_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 7 | `priority` | 优先级 | `priority` | Integer |
| 8 | `productionLineId` | 生产线ID | `prod_line_id` | 651a9072-79c8-4f70-af37-2eed7063affe |
| 9 | `productionRate` | 生产速率 | `prod_rate` | Decimal |
| 10 | `productionRateUnit` | 生产速率单位 | `prod_rate_unit` | String |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `timeUnit` | 时间单位 | `time_unit` | String |
| 13 | `workTime` | 工作时间 | `work_time` | Decimal |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `materialProdLineDetailDct` | 自定义项特征属性组 | `ed.materialproductionline.MaterialProdLineDetailDct` | None |  |
| 3 | `outputUnit` | 产量单位 | `pc.unit.Unit` | Service |  |
| 4 | `materialProductionLineId` | 物料生产线关系Id | `ed.materialproductionline.MaterialProductionLine` | None | true |
| 5 | `productionLineId` | 生产线ID | `ed.productionline.ProductionLine` | None |  |
