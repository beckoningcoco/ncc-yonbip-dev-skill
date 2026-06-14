---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiRouteInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 路由配置表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiRouteInfo`)

> INPAPI | 物理表：`ucg_baseapi_api_route_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 路由配置表 |
| 物理表 | `ucg_baseapi_api_route_info` |
| domain/服务域 | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:10.9190` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createTime` | createTime | `create_time` | Date |
| 2 | `creator` | creator | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 3 | `dr` | dr | `dr` | Integer |
| 4 | `enable` | enable | `enable` | Integer |
| 5 | `id` | id | `id` | String |
| 6 | `modifier` | modifier | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 7 | `modifyTime` | modifyTime | `modify_time` | Date |
| 8 | `pubts` | pubts | `pubts` | Date |
| 9 | `routeDesc` | routeDesc | `route_desc` | String |
| 10 | `routeName` | routeName | `route_name` | String |
| 11 | `routeStrategy` | 执行策略 | `route_strategy` | String |
| 12 | `routeTag` | routeTag | `route_tag` | String |
| 13 | `ucgBaseapiApiRouteRuleList` | 路由规则表 | `` | cd02e384-2b1a-4dd8-a753-7f4de8a83bed |
| 14 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | creator | `base.user.BipUser` | Service |  |
| 2 | `modifier` | modifier | `base.user.BipUser` | Service |  |
| 3 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `ucgBaseapiApiRouteRuleList` | 路由规则表 | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiRouteRule` | None | true |
