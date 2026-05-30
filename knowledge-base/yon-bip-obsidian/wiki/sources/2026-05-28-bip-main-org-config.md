---
title: 主组织配置方案
source: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/ZZZPZFA11
date: 2024-01-21
ingested: 2026-05-28
tags: [主组织, 组织权限, 数据隔离, YonBuilder, MDD]
images: 15
image_paths: []
---

# 主组织配置方案

> 客开单据如何配置主组织以达到多组织数据隔离控制效果。包含 YonBuilder 自建应用和 MDD 开发应用两种方式。

## 核心概念

**主组织**：YonBIP 支持多组织共用一套系统，所有档案和单据通过组织 ID 标记数据归属，实现业务数据存储和隔离。

**数据隔离维度**：组织、会计主体、开票点、管控范围（四个维度）。

**主组织类型**：描述单据可在哪种业务类型的组织下操作（采购组织、销售组织、库存组织、会计主体等）。

**主组织权限** = 角色组织权限范围 + 单据主组织类型。所有功能权限和数据权限的前提是主组织权限。

### 单据启用主组织的效果

1. 列表页按主组织权限过滤数据
2. 制单时仅可见权限范围内的组织
3. 制单时必须先选主组织才能录入其他数据
4. 编辑时主组织不可修改

## YonBuilder 自建应用配置

| 步骤 | 操作 | 效果 |
|------|------|------|
| 启用主组织 | 创建实体时勾选"主组织"引用接口 | 自动增加主组织字段，参照按组织权限+职能过滤 |
| 设置主组织类型 | 我的应用 → 服务列表 → 编辑实体 → 高级设置 → 主组织类型 | 指定单据业务类型（采购/销售等），默认"业务单元" |
| 启用数据权限 | 页面建模 → 选中根节点 → 启用"数据权限控制" | 列表仅显示有权限组织的数据 |
| 设置参照类型 | 选中基本档案字段 → 参照配置 → 选"过滤主组织"的参照 | 参照档案时按当前主组织过滤 |

> 数据权限控制 = 组织权限 + 数据权限；功能权限控制 = 按钮权限。

## MDD 开发应用配置

| 配置项 | 方式 |
|--------|------|
| 启用主组织 | 元数据组织字段加标签 `isMasterOrg=true` |
| 设置主组织类型 | 元数据 `type` 标签 = 组织职能元数据地址 |
| UI 主组织控制 | `billitem_base.isMasterOrg = 1`（不选主组织时其他字段不可编辑） |

### 参照按主组织过滤（Java 规则）

```java
@Component("referOrgRule")
public class ReferOrgRule extends AbstractCommonRule {
    @Override
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) {
        List<BizObject> bills = getBills(billContext, paramMap);
        String org = (String) bills.get(0).get("org");
        BillInfoUtils.appendCondition(billDataDto, "productApplyRange.orgId", "eq", org);
        return new RuleExecuteResult();
    }
}
```

## 授权流程

1. 配置组织职能（数字化建模 → 组织管理 → 业务单元）
2. 创建角色并分配功能权限（权限管理 → 角色管理）
3. 为用户分配角色（权限管理 → 授权）
4. 为用户分配角色下的组织权限

> 主组织权限以角色为维度授权。用户在不同组织可有不同角色（如 A 组织采购员 + B 组织库管员）。

## 注意事项

- 一个单据只能有一个主组织字段，仅支持一个主组织类型
- 切换主组织会清空已录入数据
- 企业账号级不可作为自建应用的主组织（标准档案除外）
- 新增时默认带出上一张单据的主组织：标准产品支持，YonBuilder 自建应用暂不支持

## 与其他文档关联

- [[专业开发]] — 对象建模、页面建模
- [[2026-05-28-bip-app-creation]] — 应用创建
