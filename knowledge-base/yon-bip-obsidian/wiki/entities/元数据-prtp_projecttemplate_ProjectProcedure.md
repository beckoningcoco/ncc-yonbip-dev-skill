---
tags: [BIP, 元数据, 数据字典, prtp.projecttemplate.ProjectProcedure]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 立项导航 (`prtp.projecttemplate.ProjectProcedure`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prtp_project_procedure` | domain：`yonbip-pm-projectme` | 应用：`PRTP` | 业务对象ID：`1918a1f1-91f6-43bf-a2f8-1d077792a17f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 立项导航 |
| 物理表 | `prtp_project_procedure` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `PRTP` |
| 直连字段 | 30 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `project_template_id` | `yonbip-pm-projectme.RefTable_0e5a2b2984` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `busi_transi_type` | `ucfbasedoc.bd_billtyperef` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `wbs_template_id` | `` |
| `org_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `app_code` | `app_code` | `appCode` | 应用编码 |
| `card_bill_num` | `card_bill_num` | `cardBillNum` | 卡片页面编码 |
| `code` | `code` | `code` | 编号 |
| `display_name` | `display_name` | `displayName` | 显示名称 |
| `domain` | `domain` | `domain` | 领域 |
| `group_type` | `group_type` | `group_type` | 默认分组类型,按照立项卡片页面编码 |
| `id` | `id` | `id` | 主键 |
| `memo` | `memo` | `memo` | 备注 |
| `name` | `name` | `name` | 名称 |
| `name_resid` | `name_resid` | `nameResid` | 名称多语资源 |
| `null_flag` | `null_flag` | `nullFlag` | 必输 |
| `procedure_config_id` | `procedure_config_id` | `procedureConfigId` | 立项流程配置ID |
| `service_code` | `service_code` | `serviceCode` | 服务编码 |
| `template_id` | `template_id` | `templateId` | 模版id |
| `template_ref_code` | `template_ref_code` | `templateRefCode` | 模版参照编码 |
| `template_type` | `template_type` | `templateType` | 模板类型 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_transi_type` | `busi_transi_type` | `busiTransiType` | 业务交易类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 业务单元 |
| `project_template_id` | `project_template_id` | `projectTemplateId` | 主表主键 |
| `wbs_template_id` | `wbs_template_id` | `wbsTemplateId` | wbs模板id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sort` | `sort` | `sort` | 排序 |
| `wbs_schedule_method` | `wbs_schedule_method` | `wbsScheduleMethod` | 编制方式 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_action` | `bill_action` | `billAction` | 单据动作 |
| `dr` | `dr` | `dr` | 逻辑删除 |
