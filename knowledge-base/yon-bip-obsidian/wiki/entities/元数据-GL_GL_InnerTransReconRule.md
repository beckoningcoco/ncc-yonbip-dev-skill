---
tags: [BIP, 元数据, 数据字典, GL.GL.InnerTransReconRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 内部交易对账规则 (`GL.GL.InnerTransReconRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_inner_trans_recon_rule_tb` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`5bb88ff4-5ba7-41a7-a215-79b43455fb91`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 内部交易对账规则 |
| 物理表 | `gl_inner_trans_recon_rule_tb` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 21 个 |
| 子表 | 3 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `InnerTransAuxiliaryList` | `GL.GL.InnerTransAuxiliary` | composition |
| `InnerTransOppAccsubjectList` | `GL.GL.InnerTransOppAccsubject` | composition |
| `InnerTransOwnAccsubjectList` | `GL.GL.InnerTransOwnAccsubject` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accsubjectchart_id` | `fiepub.epub_accsubjectchartref` |

## 继承接口 (4个, 9字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 规则编码 |
| `enable_date` | `enable_date` | `enableDate` | 启用日期 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accsubjectchart_id` | `accsubjectchart_id` | `accsubjectchart` | 科目表 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_type` | `accbook_type` | `accbookType` | 账簿分型 |
| `close_settle_check` | `close_settle_check` | `closeSettleCheck` | 关结账检查 |
| `content` | `content` | `content` | 对账内容 |
| `enable` | `enable` | `enable` | 档案状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 规则名称 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `InnerTransOwnAccsubjectList` | 本方科目 |
| `` | `` | `InnerTransAuxiliaryList` | 辅助核算 |
| `` | `` | `InnerTransOppAccsubjectList` | 对方科目 |
