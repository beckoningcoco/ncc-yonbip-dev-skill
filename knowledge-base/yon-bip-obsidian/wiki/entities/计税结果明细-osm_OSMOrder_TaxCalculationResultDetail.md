---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.OSMOrder.TaxCalculationResultDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计税结果明细 (`osm.OSMOrder.TaxCalculationResultDetail`)

> OSM | 物理表：`tax_calc_result_b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计税结果明细 |
| 物理表 | `tax_calc_result_b` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:58:55.0150` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | 主键 |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `calculationComponentFormula` | 计税组件公式 | `calculation_component_formula` | String |
| 2 | `calculationComponentId` | 计税组件 | `calculation_component_id` | String |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `hid` | 计税结果 | `hid` | b28c91f4-8d91-45bd-8236-7bbb3fc1d43a |
| 7 | `id` | 主键 | `id` | String |
| 8 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 9 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `reliefAmount` | 减免额 | `relief_amount` | Decimal |
| 12 | `taxReliefBid` | 减免代码明细 | `tax_relief_bid` | String |
| 13 | `taxReliefId` | 减免代码 | `tax_relief_id` | String |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `hid` | 计税结果 | `osm.OSMOrder.TaxCalculationResult` | None | true |
| 2 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
