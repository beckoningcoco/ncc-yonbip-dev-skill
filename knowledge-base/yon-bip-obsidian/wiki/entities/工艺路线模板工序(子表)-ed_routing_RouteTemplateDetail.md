---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.routing.RouteTemplateDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工艺路线模板工序(子表) (`ed.routing.RouteTemplateDetail`)

> ED | 物理表：`ed_routetemplate_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工艺路线模板工序(子表) |
| 物理表 | `ed_routetemplate_detail` |
| domain/服务域 | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 09:26:35.5060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 子表ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（28个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 子表ID | `id` | Long |
| 2 | `routeTemplateId` | 工艺路线模板id | `routetemplate_id` | 1d7fc118-77a0-4f55-be7a-5496bba0bb67 |
| 3 | `isJointPoint` | 交接点 | `is_joint_point` | Short |
| 4 | `effectiveDate` | 生效日期 | `effective_date` | DateTime |
| 5 | `expiryDate` | 失效日期 | `expiry_date` | DateTime |
| 6 | `routeTemplateDetailDefineCharacter` | 自定义项特征属性组 | `route_template_detail_df_ct` | 070a87fa-b6c6-4423-92de-3b1eef1055f8 |
| 7 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `rowno` | 行号 | `rowno` | Integer |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `sn` | 顺序号 | `sn` | Decimal |
| 12 | `operationId` | 标准工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 13 | `isMainProcess` | 主序 | `is_main_process` | Short |
| 14 | `timeUnit` | 时间单位 | `time_unit` | Short |
| 15 | `prepareTime` | 准备时间 | `prepare_time` | Decimal |
| 16 | `processTime` | 加工时间 | `process_time` | Decimal |
| 17 | `overlappingType` | 重叠类型 | `overlapping_type` | Short |
| 18 | `overlappingTime` | 重叠时间 | `overlapping_time` | Decimal |
| 19 | `overlappingCount` | 重叠数量 | `overlapping_count` | Decimal |
| 20 | `isReportPoint` | 报告点 | `is_report_point` | Short |
| 21 | `isMonitorPoint` | 检测点 | `is_monitor_point` | Short |
| 22 | `defines` | 工艺路线模板工序(子表)(固定自定义项)表 | `` | 4e08d911-fe7f-4ad3-a6e0-7decc4cd6c16 |
| 23 | `isOutsource` | 委外工序 | `is_outsource` | Short |
| 24 | `operationcontrolcodeId` | 工序控制码ID | `operationcontrolcode_id` | b47f926b-e3ed-40e1-8423-171e9fb107c9 |
| 25 | `processTransferMode` | 自动交接 | `process_transfer_mode` | Short |
| 26 | `qualityWay` | 质检方式 | `quality_way` | Short |
| 27 | `vendorId` | 委外商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 28 | `workCenterId` | 工作中心ID | `workCenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `workCenterId` | 工作中心ID | `ed.workcenter.WorkCenter` | None |  |
| 3 | `operationcontrolcodeId` | 工序控制码ID | `ed.operationcontrolcode.OperationControlCode` | None |  |
| 4 | `routeTemplateId` | 工艺路线模板id | `ed.routing.RouteTemplate` | None | true |
| 5 | `operationId` | 标准工序ID | `ed.operation.Operation` | None |  |
| 6 | `vendorId` | 委外商 | `aa.vendor.Vendor` | Service |  |
| 7 | `routeTemplateDetailDefineCharacter` | 自定义项特征属性组 | `ed.routing.RouteTemplateDetailDefineCharacter` | None |  |
| 8 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 9 | `defines` | 工艺路线模板工序(子表)(固定自定义项)表 | `ed.routing.RouteTemplateDetailUserDefine` | None | true |
