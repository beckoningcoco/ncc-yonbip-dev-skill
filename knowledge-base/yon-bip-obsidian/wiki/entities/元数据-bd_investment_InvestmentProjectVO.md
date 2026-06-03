---
tags: [BIP, 元数据, 数据字典, bd.investment.InvestmentProjectVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投资项目 (`bd.investment.InvestmentProjectVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_investment_project` | domain：`ucfbasedoc` | 应用：`DPMPRJ` | 业务对象ID：`5b99f520-5bf1-447d-bc4f-57e802460fdc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投资项目 |
| 物理表 | `bd_investment_project` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMPRJ` |
| 直连字段 | 43 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `orgcoin` | `ucfbasedoc.bd_currencytenantref` |
| `assetstage` | `yonbip-fi-efa.fa_categorytree_mainid_ref` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `dealcoin` | `ucfbasedoc.bd_currencytenantref` |
| `orgid` | `ucf-org-center.org_pure_tree_ref` |
| `classid` | `ucf-org-center.admin_dept_tree_ref` |
| `investtype` | `ucfbasedoc.bd_investpaytreeref` |
| `person` | `ucf-staff-center.bd_staff_ref` |
| `payid` | `ucfbasedoc.bd_investpaytreeref` |
| `costcenter` | `finbd.bd_costcenterref` |
| `defineCharacter` | `` |
| `inneraccount` | `finbd.bd_allaccbodyref_inner` |
| `stageid` | `ucfbasedoc.bd_investstageref` |

## 继承接口 (4个, 6字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 43 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `log` | `log` | `log` | 日志 |
| `source_id` | `source_id` | `source_id` | 来源id |
| `source_type` | `source_type` | `source_type` | 来源类型 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `code` | `code` | `code` | 项目编码 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `def1` | `def1` | `def1` | 自定义项1 |
| `def2` | `def2` | `def2` | 自定义项2 |
| `def3` | `def3` | `def3` | 自定义项3 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orgid` | `orgid` | `orgid` | 所属组织 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `classid` | `classid` | `classid` | 立项部门 |
| `person` | `person` | `person` | 负责人 |
| `stageid` | `stageid` | `stageid` | 投资阶段 |
| `payid` | `payid` | `payid` | 投资支出类别 |
| `assetstage` | `assetstage` | `assetstage` | 固定资产类别 |
| `orgcoin` | `orgcoin` | `orgcoin` | 组织本位币 |
| `dealcoin` | `dealcoin` | `dealcoin` | 交易币种 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `costcenter` | `costcenter` | `costcenter` | 成本中心 |
| `investtype` | `investtype` | `investtype` | 投资分类 |
| `inneraccount` | `inneraccount` | `inneraccount` | 对内会计主体 |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `estimatedate` | `estimatedate` | `estimatedate` | 预计开始日期 |
| `esfinishdate` | `esfinishdate` | `esfinishdate` | 预计完工日期 |
| `actualdate` | `actualdate` | `actualdate` | 实际开始日期 |
| `actfinishdate` | `actfinishdate` | `actfinishdate` | 实际完工日期 |
| `budgetyear` | `budgetyear` | `budgetyear` | 预算年度 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `years` | `years` | `years` | 耐用年限 |
| `enable` | `enable` | `enable` | 状态 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orgsum` | `orgsum` | `orgsum` | 计划总投资金额-本位币(元) |
| `dealsum` | `dealsum` | `dealsum` | 计划总投资金额-交易币(元) |
| `actualsum` | `actualsum` | `actualsum` | 实际总金额 |
| `planyear` | `planyear` | `planyear` | 计划年数 |
| `amount` | `amount` | `amount` | 数量 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `defineCharacter` | `defineCharacter` | `defineCharacter` | 自定义项特征 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 项目名称 |
| `description` | `description` | `description` | 项目说明 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
