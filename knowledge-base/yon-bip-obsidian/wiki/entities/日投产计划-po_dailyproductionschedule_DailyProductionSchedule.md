---
tags: ["BIP", "元数据", "数据字典", "PO", "po.dailyproductionschedule.DailyProductionSchedule"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 日投产计划 (`po.dailyproductionschedule.DailyProductionSchedule`)

> PO | 物理表：`po_daily_production_schedule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 日投产计划 |
| 物理表 | `po_daily_production_schedule` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:32:48.6730` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（35个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 4 | `orderId` | 生产订单Id | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 5 | `orderProductId` | 生产订单行Id | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 6 | `materialId` | 制造物料Id | `material_id` | Long |
| 7 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 8 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 9 | `dailySchQuantity` | 排产数量 | `dailysch_quantity` | Decimal |
| 10 | `dailySchDuration` | 排产时长 | `dailysch_duration` | Decimal |
| 11 | `dailySchDate` | 排产日期 | `dailysch_date` | Date |
| 12 | `completeQuantity` | 完工数量 | `complete_quantity` | Decimal |
| 13 | `assembleLineId` | 产线Id | `assembleline_id` | 651a9072-79c8-4f70-af37-2eed7063affe |
| 14 | `dailySchLock` | 锁定 | `dailysch_lock` | Short |
| 15 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 16 | `code` | 编号 | `code` | String |
| 17 | `auditor` | 审批人名称 | `auditor` | String |
| 18 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 20 | `auditDate` | 审批日期 | `audit_date` | Date |
| 21 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 22 | `verifystate` | 审批状态 | `verifystate` | Short |
| 23 | `returncount` | 退回次数 | `returncount` | Short |
| 24 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 25 | `tplid` | 模板id | `tplid` | Long |
| 26 | `status` | 单据状态 | `status` | Short |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime |
| 28 | `createDate` | 创建日期 | `create_date` | Date |
| 29 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 30 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 31 | `creator` | 创建人名称 | `creator` | String |
| 32 | `modifier` | 修改人名称 | `modifier` | String |
| 33 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 34 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 35 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 2 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 3 | `assembleLineId` | 产线Id | `ed.productionline.ProductionLine` | Service |  |
| 4 | `orderId` | 生产订单Id | `po.order.Order` | None |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `orderProductId` | 生产订单行Id | `po.order.OrderProduct` | None |  |
| 10 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 11 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
