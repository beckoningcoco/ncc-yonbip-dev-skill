---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.ps.PlanSoVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划工单 (`pes.ps.PlanSoVO`)

> IMP_PES | 物理表：`imp_pes_plan_so`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划工单 |
| 物理表 | `imp_pes_plan_so` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:13.0990` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | Id |
| 编码 | `code` | String | 编号 |

---

## 直接属性（38个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `code` | 编号 | `code` | String |
| 3 | `srcCategory` | 来源类别 | `src_category` | String |
| 4 | `status` | 状态 | `status` | String |
| 5 | `servicePlanId` | 来源计划 | `service_plan_id` | da03b7d0-3bee-4528-bb4a-34b21f182a5f |
| 6 | `transactionTypeId` | 交易类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 7 | `isInvalid` | 作废 | `is_invalid` | Boolean |
| 8 | `content` | 备注 | `content` | String |
| 9 | `tosId` | 服务类型 | `tos_id` | 792f6d8f-bf3b-4090-ac4d-a7f2e9230758 |
| 10 | `equipmentCategoryId` | 设备分类 | `equipment_category_id` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 |
| 11 | `qaType` | 质保类型 | `qa_type` | String |
| 12 | `servicePlanTemplateId` | 服务计划模板Id | `service_plan_template_id` | 1c684a58-6c2a-4ead-af06-b0e3bd45dd9f |
| 13 | `effectDate` | 生效日期 | `effect_date` | Date |
| 14 | `invalidDate` | 失效日期 | `invalid_date` | Date |
| 15 | `equId` | 设备Id | `equ_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 16 | `equCode` | 设备编码 | `equ_code` | String |
| 17 | `equName` | 设备名称 | `equ_name` | String |
| 18 | `equModel` | 设备型号 | `equ_model` | String |
| 19 | `equSpec` | 设备规格 | `equ_spec` | String |
| 20 | `equStatus` | 设备状态 | `equ_status` | String |
| 21 | `attachmentId` | 附件 | `attachmentId` | String |
| 22 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `creator` | 创建人名称 | `creator` | String |
| 24 | `createTime` | 创建时间 | `create_time` | DateTime |
| 25 | `createDate` | 创建日期 | `create_date` | Date |
| 26 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 27 | `modifier` | 修改人名称 | `modifier` | String |
| 28 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 29 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 30 | `id` | Id | `id` | String |
| 31 | `enable` | 启用 | `enable` | sys_intboolean |
| 32 | `enablets` | 启用时间 | `enablets` | DateTime |
| 33 | `disablets` | 停用时间 | `disablets` | DateTime |
| 34 | `tenant` | 租户ID | `tenant_id` | String |
| 35 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 36 | `pubts` | 时间戳 | `pubts` | DateTime |
| 37 | `CheckProjectItemVOList` | 检查项目明细子表 | `` | 4b00be66-2adc-4c0e-a2d3-65aff1680ccf |
| 38 | `MaterielQuotaDetailVOList` | 物料定额明细表 | `` | 6264e13d-2749-4ba0-ab63-eda9ddb85239 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `equId` | 设备Id | `aim.equip.EquipHeadVO` | Service |  |
| 2 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 3 | `equipmentCategoryId` | 设备分类 | `ampub.ambase.CategoryVO` | Service |  |
| 4 | `tosId` | 服务类型 | `pes.tos.Tos` | None |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `MaterielQuotaDetailVOList` | 物料定额明细表 | `pes.ps.MaterielQuotaDetailVO` | None | true |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `CheckProjectItemVOList` | 检查项目明细子表 | `pes.ps.CheckProjectItemVO` | None | true |
| 10 | `servicePlanTemplateId` | 服务计划模板Id | `pes.serviceplantemplate.ServicePlanTemplateVO` | None |  |
| 11 | `servicePlanId` | 来源计划 | `pes.serviceplan.ServicePlanVO` | None |  |
| 12 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
