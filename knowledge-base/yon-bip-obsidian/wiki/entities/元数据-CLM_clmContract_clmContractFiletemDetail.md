---
tags: [BIP, 元数据, 数据字典, CLM.clmContract.clmContractFiletemDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同文本对象明细 (`CLM.clmContract.clmContractFiletemDetail`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `clm_contractfile_detail` | 应用: `CLM`

## 属性（23 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `attachmentClass` | attachmentClass | `attachment_class` | accessoryClass | `singleOption` |
| 2 | `clmconfigDetail_id` | clmconfigDetail_id | `clmconfigDetail_id` | String | `text` |
| 3 | `clmphaseDetail_id` | clmphaseDetail_id | `clmphaseDetail_id` | String | `text` |
| 4 | `contractLib_id` | contractLib_id | `contractLib_id` | a2b72a3c-8c65-4b56-8e8f-35821ac27556 | `quote` |
| 5 | `contractSampleId` | contractSampleID | `contract_sample_id` | String | `text` |
| 6 | `contractTemplateId` | contractTemplateID | `contract_template_id` | 2a45fe2c-202e-46a1-ba09-2f4ea704ae2b | `quote` |
| 7 | `contractTemplateVersionId` | contractTemplateVersionID | `contract_template_version_id` | String | `text` |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 9 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 10 | `docDefClass` | docDefClass | `doc_def_class` | String | `text` |
| 11 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 12 | `fileBussinessid` | fileBussinessid | `file_bussinessid` | String | `text` |
| 13 | `fileClass` | fileClass | `file_class` | fileClass | `singleOption` |
| 14 | `fileExtention` | fileExtention | `file_extention` | fileExtention | `singleOption` |
| 15 | `fileMakeWay` | fileMakeWay | `file_make_way` | fileMakeWay | `singleOption` |
| 16 | `fileName` | file名称 | `file_name` | String | `text` |
| 17 | `filePhase` | filePhase | `file_phase` | filePhase | `singleOption` |
| 18 | `fileid` | fileid | `fileid` | String | `text` |
| 19 | `id` | ID | `id` | String | `text` |
| 20 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 23 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `creator` -> `base.user.BipUser` () 
- `contractTemplateId` -> `DZHTFW.econtract.econtractTemplate` () 
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `contractLib_id` -> `CLM.clmContract.contractLib` (0..n) 
