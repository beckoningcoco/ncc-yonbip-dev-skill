---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.exception.RunException"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划运行错误信息表 (`mr.exception.RunException`)

> MR | 物理表：`mr_exceptioninfo`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划运行错误信息表 |
| 物理表 | `mr_exceptioninfo` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:43.0830` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（34个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `docOrgId` | 单据业务组织 | `doc_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 5 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 6 | `logType` | 错误类别 | `log_type` | String |
| 7 | `traceNo` | traceNo | `trace_no` | Long |
| 8 | `modifier` | 修改人名称 | `modifier` | String |
| 9 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 10 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 13 | `duration` | 时长 | `duration` | Long |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `logLevel` | 信息级别 | `log_level` | String |
| 16 | `executeDate` | 执行日期 | `execute_date` | Date |
| 17 | `stackTrace` | 堆栈信息 | `stack_trace` | String |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 20 | `createDate` | 创建日期 | `create_date` | Date |
| 21 | `creator` | 创建人名称 | `creator` | String |
| 22 | `modifyDate` | 修改日期 | `modify_date` | DateTime |
| 23 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 24 | `nodeType` | 节点 | `node_type` | String |
| 25 | `materialId` | 制造物料id | `material_id` | Long |
| 26 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | aa6795e8-f19c-4d09-8580-fa8a1cb1271f |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime |
| 28 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 29 | `planParamId` | 计划参数id | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 30 | `exceptionInfo` | 例外信息 | `exception_info` | String |
| 31 | `dataVolume` | 数据量 | `data_volume` | Long |
| 32 | `logCategory` | 日志分类 | `log_category` | String |
| 33 | `planErrorCode` | 错误编码 | `plan_error_code` | String |
| 34 | `stepCode` | 运算步骤 | `step_code` | String |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `docOrgId` | 单据业务组织 | `aa.baseorg.OrgMV` | Service |  |
| 2 | `freeCharacteristics` | 自由项特征组 | `mr.exception.RunExceptionFCT` | None |  |
| 3 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `planParamId` | 计划参数id | `mr.planworkbench.PlanParam` | None |  |
| 9 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 10 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 11 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
