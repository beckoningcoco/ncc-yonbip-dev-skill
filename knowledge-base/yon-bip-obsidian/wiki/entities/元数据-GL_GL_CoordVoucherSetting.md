---
tags: [BIP, 元数据, 数据字典, GL.GL.CoordVoucherSetting]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 协同凭证设置 (`GL.GL.CoordVoucherSetting`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_coordination_voucher_setting` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`2e3bba74-7292-46b3-9627-82a8c2dd7ba9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 协同凭证设置 |
| 物理表 | `gl_coordination_voucher_setting` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 22 个 |
| 子表 | 2 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `CoordVoucherOppAccsubjectList` | `GL.GL.CoordVoucherOppAccsubject` | composition |
| `CoordVoucherOwnAccsubjectList` | `GL.GL.CoordVoucherOwnAccsubject` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `inner_trans_recon_rule_id` | `yonbip-fi-egl.RefTable_7406dde875` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accsubjectchart_id` | `fiepub.epub_accsubjectchartref` |
| `` | `` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `code` | `code` | `code` | 协同规则编码 |
| `remark` | `remark` | `remark` | 备注 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accsubjectchart_id` | `accsubjectchart_id` | `accsubjectchart` | 科目表 |
| `inner_trans_recon_rule_id` | `inner_trans_recon_rule_id` | `innerTransReconRule` | 内部交易对账规则 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `started_date` | `started_date` | `startedDate` | 启用日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `control_status` | `control_status` | `controlStatus` | 协同确认期限 |
| `coordination_direction` | `coordination_direction` | `coordinationDirection` | 协同处理方式 |
| `inner_trans_recon_rule_status` | `inner_trans_recon_rule_status` | `innerTransReconRuleStatus` | 是否引用内部交易对账规则 |
| `send_message` | `send_message` | `sendMessage` | 发送消息 |
| `start_status` | `start_status` | `startStatus` | 启用状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 协同规则名称 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `CoordVoucherOwnAccsubjectList` | 本方科目 |
| `` | `` | `CoordVoucherOppAccsubjectList` | 对方科目 |
