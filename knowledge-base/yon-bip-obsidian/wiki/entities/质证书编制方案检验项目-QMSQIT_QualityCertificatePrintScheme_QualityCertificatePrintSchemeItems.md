---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeItems"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 质证书编制方案检验项目 (`QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeItems`)

> QMSQIT | 物理表：`qms_qit_qualitycertificate_psi`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 质证书编制方案检验项目 |
| 物理表 | `qms_qit_qualitycertificate_psi` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:45:10.0820` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人名称 | `creator` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `id` | ID | `id` | String |
| 7 | `inspectItemDetailId` | 检验项目详情id | `inspectitem_detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 8 | `lineNumber` | 行号 | `line_number` | Integer |
| 9 | `modifier` | 修改人名称 | `modifier` | String |
| 10 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `pk_inspect_itemclass` | 检验项目分类 | `pk_inspect_itemclass` | c3b4c20b-a758-485f-8565-7cec8f466bf4 |
| 14 | `pk_item_id` | 检验项目 | `pk_item_id` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 15 | `pk_psd_id` | 打印方案详情id | `pk_psd_id` | 4b9a6bc4-87cd-4697-8e38-0c73ada8e8df |
| 16 | `print_order` | 打印顺序 | `print_order` | Integer |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `schemeItemsDefineCharacter` | 自定义项特征组 | `definect_c` | e9d475e1-9d6b-4d38-91a5-d896f0a6fd76 |
| 19 | `tenant` | 租户ID | `tenant_id` | String |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_inspect_itemclass` | 检验项目分类 | `QMSDFM.checkProjectClass.checkProjectClass` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `schemeItemsDefineCharacter` | 自定义项特征组 | `QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeItemsCharacter` | None |  |
| 4 | `inspectItemDetailId` | 检验项目详情id | `QMSDFM.checkProject.checkProjectDetail` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `pk_item_id` | 检验项目 | `QMSDFM.checkProject.checkProject` | Service |  |
| 8 | `pk_psd_id` | 打印方案详情id | `QMSQIT.QualityCertificatePrintScheme.QualityCertificatePrintSchemeDetail` | None | true |
