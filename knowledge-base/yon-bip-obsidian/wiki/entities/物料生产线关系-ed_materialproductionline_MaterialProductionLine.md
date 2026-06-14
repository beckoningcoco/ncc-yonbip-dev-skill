---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.materialproductionline.MaterialProductionLine"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 物料生产线关系 (`ed.materialproductionline.MaterialProductionLine`)

> ED | 物理表：`ed_material_prod_line`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料生产线关系 |
| 物理表 | `ed_material_prod_line` |
| domain/服务域 | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 13:59:47.6210` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人名称 | `creator` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `id` | ID | `id` | Long |
| 6 | `materialId` | 制造物料 | `material_id` | Long |
| 7 | `materialProdLineDct` | 自定义项特征属性组 | `m_prod_line_dct` | 6931fa9a-7fec-4e95-b7f5-e4edcb3289fc |
| 8 | `materialProductLineDetail` | 物料生产线关系子表 | `` | d2bfe5ac-404b-42b6-aa13-259e1b456d0b |
| 9 | `materialProductionLineFreeCts` | 自由项特征组自定义项实体 | `material_prod_line_cts` | 718f0474-7877-445b-86da-cea8ea506967 |
| 10 | `modifier` | 修改人名称 | `modifier` | String |
| 11 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 15 | `produceUnit` | 生产单位 | `produce_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 16 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 17 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 18 | `productUnit` | 主计量单位 | `product_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `produceUnit` | 生产单位 | `pc.unit.Unit` | Service |  |
| 2 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `materialProductLineDetail` | 物料生产线关系子表 | `ed.materialproductionline.MaterialProductionLineDetail` | None | true |
| 8 | `materialProductionLineFreeCts` | 自由项特征组自定义项实体 | `ed.materialproductionline.MaterialProductionLineCharacters` | None |  |
| 9 | `productUnit` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 10 | `materialProdLineDct` | 自定义项特征属性组 | `ed.materialproductionline.MaterialProdLineDct` | None |  |
| 11 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
