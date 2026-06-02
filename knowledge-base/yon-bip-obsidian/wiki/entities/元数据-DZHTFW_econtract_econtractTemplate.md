---
tags: [BIP, 元数据, 数据字典, DZHTFW.econtract.econtractTemplate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 电子合同模板 (`DZHTFW.econtract.econtractTemplate`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `contract_template` | 应用: `DZHTFW`

## 属性（27 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `nameGenerateRule` | nameGenerateRule | `name_generate_rule` | String | `text` |
| 2 | `appCode` | app编码 | `app_code` | String | `text` |
| 3 | `code` | 编码 | `code` | String | `text` |
| 4 | `contractObjectCode` | contractObject编码 | `contract_object_code` | String | `text` |
| 5 | `createFileType` | createFileType | `create_file_type` | String | `text` |
| 6 | `designMode` | designMode | `design_mode` | Decimal | `number` |
| 7 | `domain` | domain | `domain` | String | `text` |
| 8 | `fileKey` | fileKey | `file_key` | String | `attachment` |
| 9 | `isSample` | 是否Sample | `is_sample` | Integer | `int` |
| 10 | `orgId` | orgID | `org_id` | String | `text` |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 12 | `secretLevel` | secretLevel | `secret_level` | String | `text` |
| 13 | `secretLimit` | secretLimit | `secret_limit` | String | `text` |
| 14 | `sourceFileKey` | sourceFileKey | `source_file_key` | String | `text` |
| 15 | `tempSource` | tempSource | `temp_source` | String | `text` |
| 16 | `templateCategory` | templateCategory | `template_category` | String | `text` |
| 17 | `templateDesc` | templateDesc | `template_desc` | String | `text` |
| 18 | `templateName` | 模板名称 | `template_name` | String | `multiLanguage` |
| 19 | `templatetatus` | templatetatus | `template_status` | templateStatus | `singleOption` |
| 20 | `thumbnailFileKey` | thumbnailFileKey | `thumbnail_file_key` | String | `text` |
| 21 | `versionId` | 版本号ID | `version_id` | String | `text` |
| 22 | `id` | ID | `id` | String | `text` |
| 23 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 24 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 25 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 26 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 27 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
