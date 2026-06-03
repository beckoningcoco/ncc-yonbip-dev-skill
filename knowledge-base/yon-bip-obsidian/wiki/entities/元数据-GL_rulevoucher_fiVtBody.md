---
tags: [BIP, 元数据, 数据字典, GL.rulevoucher.fiVtBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 规则凭证分录子表 (`GL.rulevoucher.fiVtBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_vt_body` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`7b4c8f89-c22b-45b7-beca-0834bdafea6a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 规则凭证分录子表 |
| 物理表 | `fi_vt_body` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 90 个 |
| 子表 | 2 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `fiVtCashflowList` | `GL.rulevoucher.fiVtCashflow` | composition |
| `fiVtAuxList` | `GL.rulevoucher.fiVtAux` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `accsubject` | `` |
| `` | `` |
| `header` | `` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 90 个直连字段

### 文本字段 (66个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键id |
| `accsubjectdesc` | `accsubjectdesc` | `accsubjectdesc` | 科目描述 |
| `accsubjectfun` | `accsubjectfun` | `accsubjectfun` | 科目公式 |
| `description` | `description` | `description` | 摘要 |
| `description2` | `description2` | `description2` | 摘要名称多语扩展列2 |
| `description3` | `description3` | `description3` | 摘要名称多语扩展列3 |
| `description4` | `description4` | `description4` | 摘要名称多语扩展列4 |
| `description5` | `description5` | `description5` | 摘要名称多语扩展列5 |
| `description6` | `description6` | `description6` | 摘要名称多语扩展列6 |
| `currency` | `currency` | `currency` | 币种 |
| `auxorderstr` | `auxorderstr` | `auxorderstr` | 辅助核算排序字段 |
| `auxiliary` | `auxiliary` | `auxiliary` | 辅助核算 |
| `def1` | `def1` | `def1` | 自定义项1 |
| `def2` | `def2` | `def2` | 自定义项2 |
| `def3` | `def3` | `def3` | 自定义项3 |
| `def4` | `def4` | `def4` | 自定义项4 |
| `def5` | `def5` | `def5` | 自定义项5 |
| `def6` | `def6` | `def6` | 自定义项6 |
| `def7` | `def7` | `def7` | 自定义项7 |
| `def8` | `def8` | `def8` | 自定义项8 |
| `def9` | `def9` | `def9` | 自定义项9 |
| `def10` | `def10` | `def10` | 自定义项10 |
| `def11` | `def11` | `def11` | 自定义项11 |
| `def12` | `def12` | `def12` | 自定义项12 |
| `def13` | `def13` | `def13` | 自定义项13 |
| `def14` | `def14` | `def14` | 自定义项14 |
| `def15` | `def15` | `def15` | 自定义项15 |
| `def16` | `def16` | `def16` | 自定义项16 |
| `def17` | `def17` | `def17` | 自定义项17 |
| `def18` | `def18` | `def18` | 自定义项18 |
| `def19` | `def19` | `def19` | 自定义项19 |
| `def20` | `def20` | `def20` | 自定义项20 |
| `def21` | `def21` | `def21` | 自定义项21 |
| `def22` | `def22` | `def22` | 自定义项22 |
| `def23` | `def23` | `def23` | 自定义项23 |
| `def24` | `def24` | `def24` | 自定义项24 |
| `def25` | `def25` | `def25` | 自定义项25 |
| `def26` | `def26` | `def26` | 自定义项26 |
| `def27` | `def27` | `def27` | 自定义项27 |
| `def28` | `def28` | `def28` | 自定义项28 |
| `def29` | `def29` | `def29` | 自定义项29 |
| `def30` | `def30` | `def30` | 自定义项30 |
| `deffun1` | `deffun1` | `deffun1` | 自定义项公式1 |
| `deffun2` | `deffun2` | `deffun2` | 自定义项公式2 |
| `deffun3` | `deffun3` | `deffun3` | 自定义项公式3 |
| `deffun4` | `deffun4` | `deffun4` | 自定义项公式4 |
| `deffun5` | `deffun5` | `deffun5` | 自定义项公式5 |
| `deffun6` | `deffun6` | `deffun6` | 自定义项公式6 |
| `deffun7` | `deffun7` | `deffun7` | 自定义项公式7 |
| `deffun8` | `deffun8` | `deffun8` | 自定义项公式8 |
| `deffun9` | `deffun9` | `deffun9` | 自定义项公式9 |
| `deffun10` | `deffun10` | `deffun10` | 自定义项公式10 |
| `deffun11` | `deffun11` | `deffun11` | 自定义项公式11 |
| `deffun12` | `deffun12` | `deffun12` | 自定义项公式12 |
| `deffun13` | `deffun13` | `deffun13` | 自定义项公式13 |
| `deffun14` | `deffun14` | `deffun14` | 自定义项公式14 |
| `deffun15` | `deffun15` | `deffun15` | 自定义项公式15 |
| `deffun16` | `deffun16` | `deffun16` | 自定义项公式16 |
| `deffun17` | `deffun17` | `deffun17` | 自定义项公式17 |
| `deffun18` | `deffun18` | `deffun18` | 自定义项公式18 |
| `deffun19` | `deffun19` | `deffun19` | 自定义项公式19 |
| `deffun20` | `deffun20` | `deffun20` | 自定义项公式20 |
| `deffun21` | `deffun21` | `deffun21` | 自定义项公式21 |
| `secondorg` | `secondorg` | `secondorg` | 二级核算会计主体 |
| `srctplid` | `srctplid` | `srctplid` | 来源id |
| `tenantid` | `tenantid` | `tenantid` | 租户id |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `header` | `header` | `header` | 模板表头主键 |
| `accsubject` | `accsubject` | `accsubject` | 科目 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 分录号 |
| `amortize` | `amortize` | `amortize` | 摊销标识 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `price` | `price` | `price` | 单价 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `rate` | `rate` | `rate` | 汇率 |
| `debit_quantity` | `debit_quantity` | `debitQuantity` | 借方数量 |
| `credit_quantity` | `credit_quantity` | `creditQuantity` | 贷方数量 |

### multiLineText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quantityfun` | `quantityfun` | `quantityfun` | 数量公式 |

### bigText (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `debit_originalfun` | `debit_originalfun` | `debitOriginalfun` | 借方原币公式 |
| `credit_originalfun` | `credit_originalfun` | `creditOriginalfun` | 贷方原币公式 |
| `deffun22` | `deffun22` | `deffun22` | 自定义项公式22 |
| `deffun23` | `deffun23` | `deffun23` | 自定义项公式23 |
| `deffun24` | `deffun24` | `deffun24` | 自定义项公式24 |
| `deffun25` | `deffun25` | `deffun25` | 自定义项公式25 |
| `deffun26` | `deffun26` | `deffun26` | 自定义项公式26 |
| `deffun27` | `deffun27` | `deffun27` | 自定义项公式27 |
| `deffun28` | `deffun28` | `deffun28` | 自定义项公式28 |
| `deffun29` | `deffun29` | `deffun29` | 自定义项公式29 |
| `deffun30` | `deffun30` | `deffun30` | 自定义项公式30 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `fiVtAuxList` | 规则凭证辅助核算子表 |
| `` | `` | `fiVtCashflowList` | 规则凭证现金流量定义子表 |
