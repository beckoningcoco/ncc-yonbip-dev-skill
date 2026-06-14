---
tags: ["BIP", "元数据", "数据字典", "PO", "po.wholereport.WholeReport"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 齐套分析 (`po.wholereport.WholeReport`)

> PO | 物理表：`po_whole`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 齐套分析 |
| 物理表 | `po_whole` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:33:01.1310` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 单据编码 |

---

## 直接属性（55个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 工厂 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 5 | `productionDepartmentId` | 生产部门 | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 6 | `analysePushRule` | 分析规则 | `analyse_push_rule` | String |
| 7 | `planMaterialFix` | 允许修改发料量 | `plan_material_fix` | Boolean |
| 8 | `materialPushWay` | 发料方式 | `material_push_way` | MaterialPushWayEnum |
| 9 | `materialPushRule` | 发料规则 | `material_push_rule` | MaterialPushRuleEnum |
| 10 | `orderRange` | 订单范围 | `order_range` | Short |
| 11 | `analyseSequence` | 分析顺序 | `analyse_sequence` | Short |
| 12 | `allocationStrategy` | 调拨策略 | `allocation_strategy` | Short |
| 13 | `wholeSchemeId` | 齐套分析方案id | `whole_scheme_id` | 6be06ae9-de34-4f29-9179-350ede7390b9 |
| 14 | `isSceneStock` | 考虑委外商现场库存 | `is_scene_stock` | Boolean |
| 15 | `supplySource` | 供应来源 | `supply_source` | aeaf3baa-b7f8-4d47-90d8-4c775fa9780d |
| 16 | `tplid` | 模板id | `tplid` | Long |
| 17 | `billSource` | 生单来源 | `bill_source` | Integer |
| 18 | `hisSupplyDays` | 历史供应天数 | `his_supply_days` | Integer |
| 19 | `wholeOption` | 齐套选项 | `whole_option` | Integer |
| 20 | `createDate` | 创建日期 | `create_date` | Date |
| 21 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 24 | `orderDefineCharacter` | 自定义项特征属性组 | `order_define_ct` | 09c68ec2-b0fe-47fe-a017-b5b33da250e0 |
| 25 | `reportDate` | 分析日期 | `report_date` | DateTime |
| 26 | `bizType` | 业务类型 | `biz_type` | String |
| 27 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 28 | `code` | 单据编码 | `code` | String |
| 29 | `status` | 单据状态 | `status` | Short |
| 30 | `remark` | 备注 | `remark` | String |
| 31 | `creator` | 创建人名称 | `creator` | String |
| 32 | `createTime` | 创建时间 | `create_time` | DateTime |
| 33 | `modifier` | 修改人名称 | `modifier` | String |
| 34 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 35 | `materialRange` | 物料范围 | `material_range` | String |
| 36 | `isSharedRest` | 现存量共用 | `is_shared_rest` | Boolean |
| 37 | `free1` | 规格1 | `free1` | String |
| 38 | `free2` | 规格2 | `free2` | String |
| 39 | `free3` | 规格3 | `free3` | String |
| 40 | `free4` | 规格4 | `free4` | String |
| 41 | `free5` | 规格5 | `free5` | String |
| 42 | `free6` | 规格6 | `free6` | String |
| 43 | `free7` | 规格7 | `free7` | String |
| 44 | `free8` | 规格8 | `free8` | String |
| 45 | `free9` | 规格9 | `free9` | String |
| 46 | `free10` | 规格10 | `free10` | String |
| 47 | `pubts` | 时间戳 | `pubts` | DateTime |
| 48 | `subcontractVendorId` | 委外商ID | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 49 | `occupyStrategy` | 占用策略 | `occupy_strategy` | OccupyStrategyEnum |
| 50 | `wholeDocType` | 供应来源 | `` | aeaf3baa-b7f8-4d47-90d8-4c775fa9780d |
| 51 | `wholeReportAttrextItem` | 表头自由自定义项 | `` | 8545bcc2-bc1f-4c5a-b58c-fc7e49f3e21b |
| 52 | `wholeReportMaterial` | 齐套分析材料信息 | `` | e3f3243c-2971-40f2-85cb-bc0e58a3dfbb |
| 53 | `wholeReportOrder` | 齐套分析订单行 | `` | 8e000d8b-2e14-4c34-8786-9c392cb498d7 |
| 54 | `wholeReportScheme` | 齐套分析方案明细 | `` | cdb575f2-19d7-4a2b-924e-86e7281928b5 |
| 55 | `wholeReportUserdefItem` | 表头固定自定义项 | `` | 08b97236-322b-4302-b17c-956f3b026e9b |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplySource` | 供应来源 | `po.wholereport.DocType` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `orderDefineCharacter` | 自定义项特征属性组 | `po.wholereport.OrderDefineCharacter` | None |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `wholeReportMaterial` | 齐套分析材料信息 | `po.wholereport.WholeReportMaterial` | None | true |
| 7 | `wholeSchemeId` | 齐套分析方案id | `po.wholescheme.WholeScheme` | None |  |
| 8 | `wholeDocType` | 供应来源 | `po.wholereport.DocType` | None | true |
| 9 | `orgId` | 工厂 | `org.func.BaseOrg` | Service |  |
| 10 | `wholeReportOrder` | 齐套分析订单行 | `po.wholereport.WholeReportOrder` | None | true |
| 11 | `subcontractVendorId` | 委外商ID | `aa.vendor.Vendor` | Service |  |
| 12 | `wholeReportAttrextItem` | 表头自由自定义项 | `po.wholereport.WholeReportAttrextItem` | None | true |
| 13 | `wholeReportUserdefItem` | 表头固定自定义项 | `po.wholereport.WholeReportUserdefItem` | None | true |
| 14 | `productionDepartmentId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 15 | `wholeReportScheme` | 齐套分析方案明细 | `po.wholereport.WholeReportScheme` | None | true |
| 16 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
