---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.sos.ProdPartsAdjust"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 配件变更记录 (`pes.sos.ProdPartsAdjust`)

> IMP_PES | 物理表：`prod_parts_adjust`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配件变更记录 |
| 物理表 | `prod_parts_adjust` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:18.3760` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `adjustDate` | 更换时间 | `adjust_date` | String |
| 2 | `adjustReason` | 变更原因 | `adjust_reason` | String |
| 3 | `createTimeStr` | 创建时间 | `create_time` | String |
| 4 | `createUser` | 创建者 | `create_user` | String |
| 5 | `dr` | 逻辑删除 | `dr` | Integer |
| 6 | `equipment` | 设备 | `equipment` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 7 | `id` | ID | `id` | String |
| 8 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 9 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 10 | `memo` | 变更说明 | `memo` | String |
| 11 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 12 | `product` | 配件产品Id | `product` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |
| 14 | `soEquipmentId` | 工单设备子表ID | `so_equipment_id` | 25487918-5ce6-4ec1-ac75-96ac434f137f |
| 15 | `soId` | 工单Id | `srcSOID` | String |
| 16 | `srcSoNum` | 来源工单 | `srcSONUM` | String |
| 17 | `tenant` | 租户ID | `tenant_id` | String |
| 18 | `ts` | 版本号 | `ts` | String |
| 19 | `userId` | 更换人员 | `user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `product` | 配件产品Id | `pc.product.Product` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `equipment` | 设备 | `aim.equip.EquipHeadVO` | Service |  |
| 4 | `soEquipmentId` | 工单设备子表ID | `pes.sos.SmsSosEquipment` | None |  |
| 5 | `userId` | 更换人员 | `bd.staff.Staff` | Service |  |
| 6 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
