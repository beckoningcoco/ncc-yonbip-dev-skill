---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseapiStatusConf"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# API成功状态配置 (`iuap-api-management.A33_APIMngCompoment.ucgBaseapiStatusConf`)

> INPAPI | 物理表：`ucg_baseapi_status_conf`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | API成功状态配置 |
| 物理表 | `ucg_baseapi_status_conf` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:34.7650` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `apiId` | apiId | `api_id` | d0e4add9-1520-475f-a8ec-f6e8e5589525 |
| 2 | `codePath` | codePath | `code_path` | String |
| 3 | `codeType` | codeType | `code_type` | Integer |
| 4 | `codeValue` | codeValue | `code_value` | String |
| 5 | `createTime` | createTime | `create_time` | Date |
| 6 | `creator` | creator | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 7 | `dr` | dr | `dr` | Integer |
| 8 | `id` | id | `id` | String |
| 9 | `modifier` | modifier | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 10 | `modifyTime` | modifyTime | `modify_time` | Date |
| 11 | `pubts` | pubts | `pubts` | Date |
| 12 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | creator | `base.user.BipUser` | Service |  |
| 2 | `modifier` | modifier | `base.user.BipUser` | Service |  |
| 3 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `apiId` | apiId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiInfo` | None | true |
