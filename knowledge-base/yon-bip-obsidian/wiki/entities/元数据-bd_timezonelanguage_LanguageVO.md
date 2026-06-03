---
tags: [BIP, 元数据, 数据字典, bd.timezonelanguage.LanguageVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 语言 (`bd.timezonelanguage.LanguageVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sdm_base_language_table_with_names` | domain：`iuap-apdoc-social` | 应用：`DPMPI` | 业务对象ID：`942206c2-258a-4971-af51-6b812fd1ecb8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 语言 |
| 物理表 | `sdm_base_language_table_with_names` |
| 数据库 schema | `iuap-apdoc-social` |
| 所属应用 | `DPMPI` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 0 个 |

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk` | `pk` | `pk` | 主键 |
| `auto_id` | `auto_id` | `auto_id` | auto_id |
| `code` | `code` | `code` | 编码 |
| `zh_tw` | `zh_tw` | `zh_tw` | 繁体语言 |
| `sort_number` | `sort_number` | `sort_number` | 排序编号 |
| `en_us` | `en_us` | `en_us` | 英语语言 |
| `language` | `language` | `language` | 语言列表 |
| `zh_cn` | `zh_cn` | `zh_cn` | 简体语言 |
| `fr_fr` | `fr_fr` | `fr_fr` | 法语语言 |
| `dr` | `dr` | `dr` | 删除标记 |
| `pk` | `pk` | `id` | id |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `select_language` | `select_language` | `select_language` | 选择语言 |
