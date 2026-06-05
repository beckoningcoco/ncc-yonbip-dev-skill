---
tags: ["BIP", "元数据", "数据字典", "PO", "po.activityreport.ActivityReportDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 资源耗用申报明细 (`po.activityreport.ActivityReportDetail`)

> PO | 物理表：`po_activity_report_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资源耗用申报明细 |
| 物理表 | `po_activity_report_detail` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:33:19.3210` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（38个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心 | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 2 | `departmentId` | 部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 3 | `costCenterId` | 成本中心 | `costcenter_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 4 | `writeOffUpcode` | 冲销单据号 | `write_off_upcode` | String |
| 5 | `writeOffSourceid` | 冲销线索主表id | `write_off_sourceid` | Long |
| 6 | `writeOffSourceautoid` | 冲销线索子表id | `write_off_sourceautoid` | Long |
| 7 | `writeOffUplineno` | 冲销单据行号 | `write_off_uplineno` | Decimal |
| 8 | `isCalcCost` | 计算成本 | `is_calccost` | Boolean |
| 9 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 10 | `rowno` | 序号 | `rowno` | Integer |
| 11 | `sourceLinenum` | 来源单据行号 | `source_linenum` | Decimal |
| 12 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 13 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 14 | `workCenterId` | 工作中心 | `workcenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 16 | `lineno` | 行号 | `lineno` | Decimal |
| 17 | `id` | ID | `id` | Long |
| 18 | `activityReportId` | 单据 | `activity_report_id` | fc8ed676-7e91-4943-99d9-96b7c204026f |
| 19 | `orderProcessId` | 订单工序 | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 20 | `opSn` | 工序顺序号 | `op_sn` | Decimal |
| 21 | `workcenterDetailId` | 工作中心详情id | `workcenterdetail_id` | b36786d0-cc52-4c32-949d-f60ac248cbe0 |
| 22 | `orderActivityId` | 订单资源子行 | `order_activity_id` | 95fe7f6b-b857-4ce8-8d7f-8f57160c967b |
| 23 | `activityId` | 资源类型 | `activity_id` | acbdbe5a-3db1-4c88-aa59-9d89338af77b |
| 24 | `activityClass` | 资源类别 | `activity_class` | Integer |
| 25 | `activityType` | 耗用类别 | `activity_type` | Integer |
| 26 | `planUsageQty` | 计划用量 | `plan_usage_qty` | Decimal |
| 27 | `actualUsageQty` | 实际用量 | `actual_usage_qty` | Decimal |
| 28 | `usageUnit` | 用量单位 | `usage_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 29 | `source` | 来源单据类型 | `source` | String |
| 30 | `sourceid` | 来源单据主表 | `sourceid` | Long |
| 31 | `upcode` | 来源单据号 | `upcode` | String |
| 32 | `sourceautoid` | 来源单据子表 | `sourceautoid` | Long |
| 33 | `sourceGrandChildId` | 来源单据孙表 | `source_grandchild_id` | Long |
| 34 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 35 | `pubts` | 时间戳 | `pubts` | DateTime |
| 36 | `selfDefineCharacterDetail` | 详情自定义项特征 | `self_define_character` | a0119dbf-8bde-4e3a-91b6-2e38aa2c242e |
| 37 | `activityReportDetailExtItem` | 表体自由自定义项 | `` | 912f89d6-548d-4b44-a990-bbe0d37212e0 |
| 38 | `activityReportDetailUserdefItem` | 表体固定自定义项 | `` | 69f80770-b012-4496-9947-d1d0de72b696 |

---

## 关联属性（15个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心 | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `usageUnit` | 用量单位 | `pc.unit.Unit` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `departmentId` | 部门 | `aa.baseorg.DeptMV` | Service |  |
| 5 | `orderActivityId` | 订单资源子行 | `po.order.OrderActivity` | None |  |
| 6 | `activityReportId` | 单据 | `po.activityreport.ActivityReport` | None | true |
| 7 | `activityId` | 资源类型 | `bd.activity.Activity` | Service |  |
| 8 | `workcenterDetailId` | 工作中心详情id | `ed.workcenter.WorkCenterDetail` | Service |  |
| 9 | `orderProcessId` | 订单工序 | `po.order.OrderProcess` | None |  |
| 10 | `selfDefineCharacterDetail` | 详情自定义项特征 | `po.activityreport.ActivityReportDetailSelfDefineCharacter` | None |  |
| 11 | `activityReportDetailUserdefItem` | 表体固定自定义项 | `po.activityreport.ActivityReportDetailUserdefItem` | None | true |
| 12 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 13 | `activityReportDetailExtItem` | 表体自由自定义项 | `po.activityreport.ActivityReportDetailExtItem` | None | true |
| 14 | `workCenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 15 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
