---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.orderprocessstatus.OrderProcessSourceInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 来源信息子表 (`sfc.orderprocessstatus.OrderProcessSourceInfo`)

> IMPSFC | 物理表：`imp_sfc_order_process_src_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 来源信息子表 |
| 物理表 | `imp_sfc_order_process_src_info` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:21:53.9500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `id` | ID | `id` | Long |
| 7 | `modifier` | 修改人名称 | `modifier` | String |
| 8 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 11 | `num` | 数量 | `num` | Decimal |
| 12 | `num1` | 件数 | `num1` | Decimal |
| 13 | `num2` | 数量(产出) | `num2` | Decimal |
| 14 | `procStatusId` | 订单工序状况表ID | `proc_status_id` | 671ac212-8838-46f0-b0d3-842ec5f4ba16 |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |
| 16 | `sourceOpSn` | 来源订单工序顺序号 | `src_op_sn` | Decimal |
| 17 | `sourceOrderProcessId` | 来源订单工序ID | `src_order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 18 | `sourceOrgId` | 来源工序组织ID | `src_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 19 | `sourceWorkCenterId` | 来源工作中心ID | `source_workCenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 20 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 21 | `turninNum` | 转入数量 | `turnin_num` | Decimal |
| 22 | `turninNum1` | 转入件数 | `turnin_num1` | Decimal |
| 23 | `turninNum2` | 转入数量(产出) | `turnin_num2` | Decimal |
| 24 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `procStatusId` | 订单工序状况表ID | `sfc.orderprocessstatus.OrderProcessStatus` | None | true |
| 2 | `sourceWorkCenterId` | 来源工作中心ID | `ed.workcenter.WorkCenter` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `sourceOrgId` | 来源工序组织ID | `org.func.BaseOrg` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `sourceOrderProcessId` | 来源订单工序ID | `po.order.OrderProcess` | Service |  |
| 8 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
