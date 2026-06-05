---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiRouteRule"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 路由规则表 (`iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiRouteRule`)

> INPAPI | 物理表：`ucg_baseapi_api_route_rule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 路由规则表 |
| 物理表 | `ucg_baseapi_api_route_rule` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:27.9620` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `backendType` | backendType | `backend_type` | Integer |
| 2 | `createTime` | createTime | `create_time` | Date |
| 3 | `creator` | creator | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 4 | `defaultRule` | defaultRule | `default_rule` | String |
| 5 | `dr` | dr | `dr` | Integer |
| 6 | `id` | id | `id` | String |
| 7 | `integrateSchemeCode` | integrateSchemeCode | `integrate_scheme_code` | String |
| 8 | `modifier` | modifier | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 9 | `modifyTime` | modifyTime | `modify_time` | Date |
| 10 | `pubts` | pubts | `pubts` | Date |
| 11 | `routeId` | routeId | `route_id` | a6791d63-76e7-4250-a319-a4c899a56ec7 |
| 12 | `routeRuleAction` | routeRuleAction | `route_rule_action` | String |
| 13 | `routeRuleDesc` | routeRuleDesc | `route_rule_desc` | String |
| 14 | `routeRuleName` | routeRuleName | `route_rule_name` | String |
| 15 | `ruleActionType` | ruleActionType | `rule_action_type` | String |
| 16 | `sort` | sort | `sort` | Integer |
| 17 | `triggerCondition` | triggerCondition | `trigger_condition` | String |
| 18 | `triggerType` | triggerType | `trigger_type` | Integer |
| 19 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | creator | `base.user.BipUser` | Service |  |
| 2 | `routeId` | routeId | `iuap-api-management.A33_APIMngCompoment.ucgBaseapiApiRouteInfo` | None | true |
| 3 | `modifier` | modifier | `base.user.BipUser` | Service |  |
| 4 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
