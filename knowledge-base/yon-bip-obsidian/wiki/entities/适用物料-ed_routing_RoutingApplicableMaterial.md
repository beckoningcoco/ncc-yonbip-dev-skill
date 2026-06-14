---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.routing.RoutingApplicableMaterial"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 适用物料 (`ed.routing.RoutingApplicableMaterial`)

> ED | 物理表：`ed_route_applicable_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 适用物料 |
| 物理表 | `ed_route_applicable_material` |
| domain/服务域 | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 09:25:14.0510` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `applicableMaterialFreeCts` | 适用物料自由项特征组 | `applicable_material_free_cts` | c6e12232-2b04-4c6d-acce-bc4892e5e7af |
| 2 | `applicableMaterialSensitive` | 适用物料敏感域 | `applicable_material_sensitive` | a1b01724-e47e-4f17-b0be-f63235ec8423 |
| 3 | `batch` | 主批量 | `batch` | Decimal |
| 4 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 5 | `changeRateDen` | 换算率分母 | `change_rate_den` | Decimal |
| 6 | `changeRateNum` | 换算率分子 | `change_rate_num` | Decimal |
| 7 | `id` | ID | `id` | Long |
| 8 | `materialId` | 制造物料 | `material_id` | Long |
| 9 | `originalId` | 变更源 | `original_id` | Long |
| 10 | `produceBatch` | 批量 | `produce_batch` | Decimal |
| 11 | `produceUnit` | 计量单位 | `produce_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 12 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 13 | `productClassfiyId` | 物料分类 | `product_classfiy_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 14 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 15 | `productUnit` | 主单位 | `product_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `routingId` | 工艺路线ID | `routing_id` | 37955d3b-2143-4a4d-bdd5-0213a13394f5 |
| 18 | `rowno` | 序号 | `rowno` | Integer |
| 19 | `sensitiveUID` | SKU敏感域唯一性ID | `sensitive_uid` | String |
| 20 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `produceUnit` | 计量单位 | `pc.unit.Unit` | Service |  |
| 2 | `routingId` | 工艺路线ID | `ed.routing.Routing` | None | true |
| 3 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `applicableMaterialFreeCts` | 适用物料自由项特征组 | `ed.routing.RouAppMaterFreeChar` | None |  |
| 6 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 7 | `productClassfiyId` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 8 | `productUnit` | 主单位 | `pc.unit.Unit` | Service |  |
| 9 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 10 | `applicableMaterialSensitive` | 适用物料敏感域 | `ed.routing.RouAppMaterSensitive` | None |  |
