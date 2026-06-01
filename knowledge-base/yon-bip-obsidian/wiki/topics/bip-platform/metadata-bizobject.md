---
title: "元数据模型与业务对象"
type: reference
source: "iuap-元数据及业务对象红皮书 (58页)"
tags: ["BIP", "旗舰版", "元数据", "业务对象", "QuerySchema", "元模型"]
created: 2026-06-01
---

# 元数据模型与业务对象

## 元模型架构

两层分层：标准层 + 个性化层。二级缓存：Redis + Caffeine。

### 元模型核心概念

```
组件(Component) → 实体(Entity) → 属性(Attribute)
                  └── 接口(Interface)
                  └── 关系: 组合 | 继承 | 实现
```

URI 标识：`{module}.{component}.{entity}`，如 `hr.staff.Staff`。

### 实体属性定义（14+ 字段类型）

| 属性 | 类型 | 说明 |
|------|------|------|
| `isKey` | Boolean | 主键 |
| `isCode` | Boolean | 编码字段 |
| `isUnique` | Boolean | 唯一约束 |
| `unionKey` | String | 联合唯一，逗号分隔 |
| `isRequired` | Boolean | 必填 |
| `isMasterOrg` | Boolean | 主组织标记 |
| `isJoinQuery` | Boolean | 支持关联查询 |
| `isRowAuthControlled` | Boolean | 行权限控制 |
| `dataPowerType` | String | 数据权限类型 |
| `validation` | String | 正则校验表达式 |
| `refType` | String | 参照编码 |
| `defaultValue` | String | 默认值 |
| `nullable` | Boolean | 是否为空 |
| `order` | Int | 排序号 |
| `isPrint` | Boolean | 是否支持打印 |
| `isHidden` | Boolean | 是否隐藏 |

### 业务对象增强

业务对象是元数据实体的运行时增强，支持：
- **场景**：print / bpm / workflow / DataAuth 等 15+ 种
- **原子服务**：绑定业务对象的 CRUD 服务
- **业务数据类型**：枚举 / 参照 / 自定义类型
- `bizType` 枚举指定业务语义

## 设计器功能

| 一级功能 | 二级功能 |
|----------|----------|
| 元数据设计器 | 组件管理、实体/接口 CRUD、关系维护、XML 导入/DDL 下载 |
| 业务对象设计器 | 业务对象绑定、属性排序、场景配置、原子服务维护 |
| 分类管理 | 应用分类维护、标签管理 |
| 专属化 | 专属化环境元数据在线编辑 |

## 元数据接入方式

两种方式：
1. **XML 导入**：设计 XML → 上传到 Web 元数据管理后台
2. **在线编辑**：通过设计器直接创建和编辑

## QuerySchema 查询方案（核心）

QuerySchema 是 BIP 后端查询的核心 DSL，链式 API 构建，自动适配多数据库方言。

```java
QuerySchema.create()
    .distinct()
    .addSelect("实体URI", "字段路径", "别名")
    .addFrom("主实体", "别名")
    .addJoin(join)
    .addCondition(conditionGroup)
    .addOrderBy("字段", OrderType.ASC)
    .setPage(new PageInfo(size, index));
```

条件操作符：`eq`, `neq`, `lt`, `gt`, `between`, `in`, `like`, `is_null`, `is_not_null`。

条件组支持 AND/OR 嵌套。高级特性：CASE 语句、IFNULL 空值处理、distinct 去重、动态条件（switch/if 分支）、自定义函数注册。

关联实体通过点号路径访问，框架自动生成 JOIN。`isMasterOrg=true` 标记的实体自动拼接组织过滤。

## 相关文档

- [[mdd-backend]] — 元数据是MDD核心资产
- [[ui-template]] — UI模板引用元数据实体
- [[yonbuilder-app]] — YonBuilder数据建模即元数据设计器
