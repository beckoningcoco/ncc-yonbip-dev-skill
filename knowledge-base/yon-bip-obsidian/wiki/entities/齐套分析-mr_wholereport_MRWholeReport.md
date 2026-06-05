---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.wholereport.MRWholeReport"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 齐套分析 (`mr.wholereport.MRWholeReport`)

> MR | 物理表：`po_whole`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 齐套分析 |
| 物理表 | `po_whole` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:39.3270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 单据编码 |

---

## 直接属性（50个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 5 | `bizType` | 业务类型 | `biz_type` | String |
| 6 | `code` | 单据编码 | `code` | String |
| 7 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 8 | `status` | 单据状态 | `status` | Short |
| 9 | `analysePushRule` | 分析规则 | `analyse_push_rule` | String |
| 10 | `analyseSequence` | 分析顺序 | `analyse_sequence` | Short |
| 11 | `wholeOption` | 齐套选项 | `whole_option` | Integer |
| 12 | `orderRange` | 订单范围 | `order_range` | Short |
| 13 | `materialRange` | 物料范围 | `material_range` | String |
| 14 | `productionDepartmentId` | 生产部门 | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 15 | `reportDate` | 分析日期 | `report_date` | DateTime |
| 16 | `isSharedRest` | 现存量共用 | `is_shared_rest` | Boolean |
| 17 | `supplySource` | 供应来源 | `supply_source` | aeaf3baa-b7f8-4d47-90d8-4c775fa9780d |
| 18 | `hisSupplyDays` | 历史供应天数 | `his_supply_days` | Integer |
| 19 | `billSource` | 生单来源 | `bill_source` | Integer |
| 20 | `subcontractVendorId` | 委外供应商 | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 21 | `materialPushWay` | 委外材料发料方式 | `material_push_way` | MaterialPushWayEnum |
| 22 | `materialPushRule` | 发料规则 | `material_push_rule` | MaterialPushRuleEnum |
| 23 | `planMaterialFix` | 允许修改发料量 | `plan_material_fix` | Boolean |
| 24 | `isSceneStock` | 考虑委外商现场库存 | `is_scene_stock` | Boolean |
| 25 | `allocationStrategy` | 调拨策略 | `allocation_strategy` | Short |
| 26 | `free1` | 规格1 | `free1` | String |
| 27 | `free2` | 规格2 | `free2` | String |
| 28 | `free3` | 规格3 | `free3` | String |
| 29 | `free4` | 规格4 | `free4` | String |
| 30 | `free5` | 规格5 | `free5` | String |
| 31 | `free6` | 规格6 | `free6` | String |
| 32 | `free7` | 规格7 | `free7` | String |
| 33 | `free8` | 规格8 | `free8` | String |
| 34 | `free9` | 规格9 | `free9` | String |
| 35 | `free10` | 规格10 | `free10` | String |
| 36 | `wholeSchemeId` | 齐套分析方案id | `whole_scheme_id` | 6be06ae9-de34-4f29-9179-350ede7390b9 |
| 37 | `remark` | 备注 | `remark` | String |
| 38 | `orderDefineCharacter` | 自定义项特征属性组 | `order_define_ct` | 09c68ec2-b0fe-47fe-a017-b5b33da250e0 |
| 39 | `creator` | 创建人名称 | `creator` | String |
| 40 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 41 | `createDate` | 创建日期 | `create_date` | Date |
| 42 | `createTime` | 创建时间 | `create_time` | DateTime |
| 43 | `modifier` | 修改人名称 | `modifier` | String |
| 44 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 45 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 46 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 47 | `tplid` | 模板id | `tplid` | Long |
| 48 | `pubts` | 时间戳 | `pubts` | DateTime |
| 49 | `occupyStrategy` | 占用策略 | `occupy_strategy` | OccupyStrategyEnum |
| 50 | `wholeReportOrder` | 齐套分析订单行 | `` | b9e5062b-1cb9-4c54-8f7f-8e0497d66104 |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `subcontractVendorId` | 委外供应商 | `aa.vendor.Vendor` | Service |  |
| 2 | `supplySource` | 供应来源 | `po.wholereport.DocType` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `orderDefineCharacter` | 自定义项特征属性组 | `po.wholereport.OrderDefineCharacter` | None |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `wholeSchemeId` | 齐套分析方案id | `po.wholescheme.WholeScheme` | Service |  |
| 8 | `productionDepartmentId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 9 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 10 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 11 | `wholeReportOrder` | 齐套分析订单行 | `mr.wholereport.MRWholeReportOrder` | None | true |
