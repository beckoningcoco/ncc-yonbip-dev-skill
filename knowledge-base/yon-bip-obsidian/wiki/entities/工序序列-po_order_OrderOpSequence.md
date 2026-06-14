---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.OrderOpSequence"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序序列 (`po.order.OrderOpSequence`)

> PO | 物理表：`po_order_opsequence`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序序列 |
| 物理表 | `po_order_opsequence` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:21:25.2780` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `description` | 序列描述 | `description` | String |
| 2 | `ecnDetailId` | 工程变更行ID | `ecn_detail_id` | Long |
| 3 | `ecnDetailNo` | 工程变更行号 | `ecn_detail_no` | String |
| 4 | `ecnDetails` | 变更详情 | `ecn_details` | String |
| 5 | `ecnId` | 工程变更ID | `ecn_id` | Long |
| 6 | `ecnNo` | 工程变更单号 | `ecn_no` | String |
| 7 | `ecnStatus` | 变更状态 | `ecn_status` | Integer |
| 8 | `ecnTime` | 变更时间 | `ecn_time` | DateTime |
| 9 | `ecnUser` | 变更人 | `ecn_user` | String |
| 10 | `id` | ID | `id` | Long |
| 11 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 12 | `level` | 层级 | `level` | Integer |
| 13 | `name` | 序列名称 | `name` | String |
| 14 | `opSequenceDefineDts` | 自定义项特征组 | `define_cts` | e810f7fd-d575-4ee0-a0d8-5d9dca04e29d |
| 15 | `opSequenceType` | 序列类型 | `op_sequence_type` | Integer |
| 16 | `orderProductId` | 订单母件ID | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 17 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 18 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 19 | `parent` | 参照工序 | `parent_id` | Long |
| 20 | `path` | 路径 | `path` | String |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `routingSequenceId` | 工艺路线序列ID | `routing_sequence_id` | Long |
| 23 | `sequenceNum` | 工序序列 | `sequence_num` | Integer |
| 24 | `sort` | 排序号 | `sort_num` | Integer |
| 25 | `srcProcessId` | 来源工序ID | `srcprocess_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 26 | `srcProcessSn` | 来源工序 | `srcprocess_sn` | Decimal |
| 27 | `targetProcessId` | 目标工序ID | `targetprocess_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 28 | `targetProcessSn` | 目标工序 | `targetprocess_sn` | Decimal |
| 29 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 30 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `opSequenceDefineDts` | 自定义项特征组 | `po.order.OpSequenceDefineCharacteristics` | None |  |
| 2 | `targetProcessId` | 目标工序ID | `po.order.OrderProcess` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `orderProductId` | 订单母件ID | `po.order.OrderProduct` | None | true |
| 5 | `srcProcessId` | 来源工序ID | `po.order.OrderProcess` | None |  |
| 6 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
