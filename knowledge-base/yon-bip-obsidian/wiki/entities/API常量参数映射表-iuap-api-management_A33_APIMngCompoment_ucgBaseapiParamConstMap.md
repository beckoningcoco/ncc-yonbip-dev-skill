---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseapiParamConstMap"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# API常量参数映射表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseapiParamConstMap`)

> INPAPI | 物理表：`ucg_baseapi_param_const_map`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | API常量参数映射表 |
| 物理表 | `ucg_baseapi_param_const_map` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:32.1120` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `apiId` | apiId | `api_id` | d0e4add9-1520-475f-a8ec-f6e8e5589525 |
| 2 | `constId` | constId | `const_id` | String |
| 3 | `createUser` | createUser | `create_user` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 4 | `dr` | dr | `dr` | Integer |
| 5 | `envCode` | envCode | `env_code` | String |
| 6 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 7 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 8 | `id` | id | `id` | String |
| 9 | `isvId` | isvId | `isv_id` | String |
| 10 | `updateUser` | updateUser | `update_user` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 11 | `value` | value | `value` | String |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `updateUser` | updateUser | `base.user.BipUser` | Service |  |
| 2 | `createUser` | createUser | `base.user.BipUser` | Service |  |
| 3 | `apiId` | apiId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiInfo` | None | true |
