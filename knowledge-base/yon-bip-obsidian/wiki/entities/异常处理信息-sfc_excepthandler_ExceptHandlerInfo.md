---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.excepthandler.ExceptHandlerInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 异常处理信息 (`sfc.excepthandler.ExceptHandlerInfo`)

> IMPSFC | 物理表：`imp_sfc_except_handler_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 异常处理信息 |
| 物理表 | `imp_sfc_except_handler_info` |
| domain/服务域 | `IMP-SFC` |
| schema | `production_order` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:21:46.6520` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `correctAction` | 纠正措施 | `correct_action` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `handlerDescription` | 处理描述 | `handler_description` | String |
| 4 | `handlerId` | 异常处理 | `handler_id` | 4e5d8eee-53ec-44b3-9996-a83df999c7d7 |
| 5 | `handlerOption` | 处理意见 | `handler_option` | String |
| 6 | `handlerStaffId` | 处理人 | `handler_staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 7 | `handlerTime` | 处理时间 | `handler_time` | DateTime |
| 8 | `handlerType` | 处理结果 | `handler_type` | String |
| 9 | `id` | ID | `id` | Long |
| 10 | `lineno` | 行号 | `lineno` | Decimal |
| 11 | `preventAction` | 预防措施 | `prevent_action` | String |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `reasonDescription` | 原因分析 | `reason_description` | String |
| 14 | `reasonId` | 异常原因 | `reason_id` | 9e9af41b-a04f-4b2c-9aeb-738c1c08a4c6 |
| 15 | `rowno` | 序号 | `rowno` | Integer |
| 16 | `selfDefineCharacter` | 自定义项特征 | `self_define_character` | 0e450af9-3960-4fc4-8bf3-ee7f91215d38 |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `selfDefineCharacter` | 自定义项特征 | `sfc.excepthandler.ExceptHandlerInfoSelfDefineCharacter` | None |  |
| 2 | `reasonId` | 异常原因 | `sfc.exceptreason.ExceptReason` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `handlerId` | 异常处理 | `sfc.excepthandler.ExceptHandler` | None | true |
| 5 | `handlerStaffId` | 处理人 | `bd.staff.Staff` | Service |  |
