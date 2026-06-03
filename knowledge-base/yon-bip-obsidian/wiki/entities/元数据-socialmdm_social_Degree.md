---
tags: [BIP, 元数据, 数据字典, socialmdm.social.Degree]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 学位 (`socialmdm.social.Degree`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mdm_degreetbcode` | domain：`iuap-apdoc-social` | 应用：`DPMPI` | 业务对象ID：`df4ec23a-3a78-420f-bd11-930adb1662a1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 学位 |
| 物理表 | `mdm_degreetbcode` |
| 数据库 schema | `iuap-apdoc-social` |
| 所属应用 | `DPMPI` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 0 个 |

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `aid` | `aid` | `aid` | 无 |
| `code` | `code` | `code` | 英文编码 |
| `pk_mdm` | `pk_mdm` | `id` | 自定义主键 |
| `link_fieldvalue` | `link_fieldvalue` | `linkFieldValue` | 无 |
| `mdm_code` | `mdm_code` | `mdmCode` | 数字编码 |
| `mdm_parentcode` | `mdm_parentcode` | `mdmParentCode` | 父编码 |
| `name_resid` | `name_resid` | `nameResId` | 多语平台资源编码 |
| `sys_id` | `sys_id` | `sysId` | 领域名称 |
| `treemasterid` | `treemasterid` | `treeMasterId` | 无 |
| `treeparentid` | `treeparentid` | `treeParentId` | 无 |
| `treeref_foreignkey` | `treeref_foreignkey` | `treeRefForeignKey` | 无 |
| `update_at` | `update_at` | `updateAt` | 无 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 友户通租户id |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 是否删除 |
| `mdm_duplicate` | `mdm_duplicate` | `mdmDuplicate` | 无 |
| `mdm_seal` | `mdm_seal` | `mdmSeal` | 无 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 学位名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
