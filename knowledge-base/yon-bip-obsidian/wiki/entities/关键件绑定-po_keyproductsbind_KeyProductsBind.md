---
tags: ["BIP", "元数据", "数据字典", "PO", "po.keyproductsbind.KeyProductsBind"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 关键件绑定 (`po.keyproductsbind.KeyProductsBind`)

> PO | 物理表：`po_key_prds_bind`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 关键件绑定 |
| 物理表 | `po_key_prds_bind` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:32:42.1970` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（41个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `KeyProducts` | 关键件 | `` | 375b21c5-c650-4451-a397-9f82e3c5e693 |
| 2 | `batchId` | 批次 | `batch_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 3 | `createDate` | 创建日期 | `create_date` | Date |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `csnCode` | 序列号 | `csn_code` | String |
| 8 | `csnId` | 序列号ID | `csn_id` | b77de1a0-2e36-47ba-9bd9-3cda94fd9680 |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 4a5a6012-168c-40d6-9e08-cfebf00c64a9 |
| 11 | `id` | ID | `id` | Long |
| 12 | `mainChangeRate` | 生产换算率 | `main_change_rate` | Decimal |
| 13 | `mainChangeRateDen` | 生产换算率分母 | `main_change_rateden` | Decimal |
| 14 | `mainChangeRateNum` | 生产换算率分子 | `main_change_ratenum` | Decimal |
| 15 | `mainChangeType` | 生产换算方式 | `main_change_type` | Short |
| 16 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 17 | `modifier` | 修改人名称 | `modifier` | String |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 21 | `orderId` | 生产订单 | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 22 | `orderProcessId` | 生产订单工序 | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 23 | `orderProductId` | 生产订单产品 | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 24 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 25 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 26 | `productionDepartmentId` | 生产部门 | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 27 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime |
| 29 | `scheduleEndTime` | 计划完工时间 | `schedule_end_time` | DateTime |
| 30 | `scheduleProdNum` | 计划加工数量 | `schedule_prod_num` | Decimal |
| 31 | `scheduleProdNum1` | 计划加工件数 | `schedule_prod_num1` | Decimal |
| 32 | `scheduleStartTime` | 计划开工时间 | `schedule_start_time` | DateTime |
| 33 | `sfcCode` | 任务编号/流转卡号 | `sfc_code` | String |
| 34 | `sfcId` | 任务Id/流转卡工序Id | `sfc_id` | Long |
| 35 | `sn` | 工序顺序号 | `sn` | Decimal |
| 36 | `sourceAutoId` | 来源单据子表Id | `sourceautoid` | Long |
| 37 | `sourceId` | 来源单据id | `sourceid` | Long |
| 38 | `sourceLineno` | 来源单据行号 | `source_line_no` | Decimal |
| 39 | `sourceType` | 来源单据类型 | `source_type` | String |
| 40 | `upcode` | 来源单据号 | `upcode` | String |
| 41 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（15个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 2 | `orderId` | 生产订单 | `po.order.Order` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `orderProductId` | 生产订单产品 | `po.order.OrderProduct` | None |  |
| 7 | `batchId` | 批次 | `st.batchno.Batchno` | Service |  |
| 8 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 9 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 10 | `csnId` | 序列号ID | `sn.serialnumber.SNstateReport` | Service |  |
| 11 | `freeCharacteristics` | 自由项特征组 | `po.keyproductsbind.KeyProductsBindFreeCharacter` | None |  |
| 12 | `orderProcessId` | 生产订单工序 | `po.order.OrderProcess` | None |  |
| 13 | `KeyProducts` | 关键件 | `po.keyproductsbind.KeyProducts` | None | true |
| 14 | `productionDepartmentId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 15 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
