---
tags: [BIP, 元数据, 数据字典, socialmdm.social.EduQualification]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 学历 (`socialmdm.social.EduQualification`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mdm_educationtbcode` | domain：`iuap-apdoc-social` | 应用：`DPMPI` | 业务对象ID：`bff2ec26-fdd6-47e0-a7e0-7cf90e8aee08`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 学历 |
| 物理表 | `mdm_educationtbcode` |
| domain/服务域 | `iuap-apdoc-social` |
| schema | `iuap_apdoc_social` |
| 所属应用 | `DPMPI` |
| 直连字段 | 19 个 |
| 子表 | 0 个 |
| 关联引用 | 0 个 |

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 数字编码(1) |
| `eid` | `eid` | `eid` | 无 |
| `pk_mdm` | `pk_mdm` | `id` | 自定义主键 |
| `link_fieldvalue` | `link_fieldvalue` | `linkFieldValue` | 无 |
| `mdm_code` | `mdm_code` | `mdmCode` | 数字编码(0000000001 |
| `mdm_parentcode` | `mdm_parentcode` | `mdmParentCode` | 父编码 |
| `name_resid` | `name_resid` | `nameResId` | 多语平台资源编码 |
| `sys_id` | `sys_id` | `sysId` | 领域名称 |
| `treemasterid` | `treemasterid` | `treeMasterId` | 无 |
| `treeparentid` | `treeparentid` | `treeParentId` | 无 |
| `treeref_foreignkey` | `treeref_foreignkey` | `treeRefForeignKey` | 无 |
| `update_at` | `update_at` | `updateAt` | 无 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 友户通租户id |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 是否删除 |
| `mdm_duplicate` | `mdm_duplicate` | `mdmDuplicate` | 无 |
| `mdm_seal` | `mdm_seal` | `mdmSeal` | 无 |
| `mdm_version` | `mdm_version` | `mdmVersion` | 版本号 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 学历名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
