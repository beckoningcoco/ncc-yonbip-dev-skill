---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.sos.SmsSosEquipment"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工单设备信息 (`pes.sos.SmsSosEquipment`)

> IMP_PES | 物理表：`sms_so_equipment`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工单设备信息 |
| 物理表 | `sms_so_equipment` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:20:11.9080` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（28个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `address` | 详细地址 | `address` | String |
| 2 | `authResult` | 鉴权结果 | `auth_result` | String |
| 3 | `city` | 市区 | `city` | String |
| 4 | `country` | 国家 | `country` | String |
| 5 | `district` | 县 | `district` | String |
| 6 | `equId` | 设备ID | `equ_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 7 | `isAssign` | 是否分派 | `is_assign` | Boolean |
| 8 | `positionId` | 位置 | `position_id` | 95577e23-979f-4f09-a629-61fea93e576d |
| 9 | `productCategoryId` | 产品分类 | `product_category_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 10 | `productId` | 产品 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 11 | `province` | 省市 | `province` | String |
| 12 | `qaType` | 质保类型 | `qa_type` | String |
| 13 | `scoreMemo` | 打分说明 | `score_memo` | String |
| 14 | `scoreMoney` | 绩效金额 | `score_money` | Decimal |
| 15 | `scoreRatio` | 评分系数 | `score_ratio` | Decimal |
| 16 | `scoreStdMoney` | 服务价格 | `score_stdMoney` | Decimal |
| 17 | `serviceContractId` | 服务合同 | `service_contract_id` | eafb7e7b-746e-4b48-8773-e48df89613f1 |
| 18 | `soId` | 工单Id | `so_id` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 19 | `street` | 街道 | `street` | String |
| 20 | `subSoId` | 分派子单ID | `sub_so_id` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 21 | `UserDefineCharacter` | 自定义项特征 | `user_define_character` | bc3bb903-b64d-4b4f-ae84-fe258706ec8e |
| 22 | `version` | 版本号 | `version` | Integer |
| 23 | `tenant` | 租户ID | `tenant_id` | String |
| 24 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 25 | `id` | 主键 | `id` | Long |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime |
| 27 | `smsSoFailureLogsList` | 故障记录 | `` | 15c6422d-44ba-4c24-98dc-d86ef9db3ec6 |
| 28 | `soItemSpareList` | 配件耗用 | `` | c480e45b-b923-4427-8305-3d23fa2f0c7c |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `equId` | 设备ID | `aim.equip.EquipHeadVO` | Service |  |
| 2 | `soId` | 工单Id | `pes.sos.SmsSos` | None | true |
| 3 | `productCategoryId` | 产品分类 | `pc.cls.ManagementClass` | Service |  |
| 4 | `positionId` | 位置 | `bd.region.BaseRegionVO` | Service |  |
| 5 | `productId` | 产品 | `pc.product.Product` | Service |  |
| 6 | `soItemSpareList` | 配件耗用 | `pes.sos.SoEquipmentItemSpare` | None | true |
| 7 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 8 | `smsSoFailureLogsList` | 故障记录 | `pes.sos.SmsSoEquipmentFailureLogs` | None | true |
| 9 | `subSoId` | 分派子单ID | `pes.sos.SmsSos` | None |  |
| 10 | `UserDefineCharacter` | 自定义项特征 | `pes.sos.SmsSosEquipmentDefineCharacter` | None |  |
| 11 | `serviceContractId` | 服务合同 | `pes.smsContracts.SmsContracts` | None |  |
