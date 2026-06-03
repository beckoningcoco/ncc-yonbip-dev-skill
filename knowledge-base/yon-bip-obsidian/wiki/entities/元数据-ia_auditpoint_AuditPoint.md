---
tags: [BIP, 元数据, 数据字典, ia.auditpoint.AuditPoint]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 规则 (`ia.auditpoint.AuditPoint`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_audit_point` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：`b07fd625-8813-4863-ae63-ce63418dcd45`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 规则 |
| 物理表 | `ssc_ia_audit_point` |
| 数据库 schema | `yonbip-mid-sscia` |
| 所属应用 | `ZNSH` |
| 直连字段 | 64 个 |
| 子表 | 24 个 |
| 关联引用 | 33 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `sensitiveAudit` | `ia.auditpoint.SensitiveAudit` | composition |
| `businessObjectAudit` | `ia.auditpoint.BusinessObjectAudit` | composition |
| `attachmentAudit` | `ia.auditpoint.AttachmentAudit` | composition |
| `auditPointParams` | `ia.auditpoint.AuditPointParam` | composition |
| `indexAudit` | `ia.auditpoint.IndexAudit` | composition |
| `auditPointCheckRuleParams` | `ia.auditpoint.AuditPointParam` | composition |
| `semanticAudit` | `ia.auditpoint.SemanticAudit` | composition |
| `contentAudit` | `ia.auditpoint.ContentAudit` | composition |
| `customAudit` | `ia.auditpoint.CustomAudit` | composition |
| `auditPointDateRangeParams` | `ia.auditpoint.AuditPointParam` | composition |
| `repeatAudit` | `ia.auditpoint.RepeatAudit` | composition |
| `multimodalAudit` | `ia.auditpoint.MultimodalAudit` | composition |
| `riskAuditContents` | `ia.auditpoint.RiskAuditContent` | composition |
| `situationAudit` | `ia.auditpoint.SituationAudit` | composition |
| `auditPointExtendParams` | `ia.auditpoint.AuditPointParam` | composition |
| `simulationAudit` | `ia.auditpoint.SimulationAudit` | composition |
| `compositeAudits` | `ia.auditpoint.CompositeAudit` | composition |
| `imageAudit` | `ia.auditpoint.ImageAudit` | composition |
| `ruleLabelRelations` | `ia.auditpoint.RuleLabelRelation` | composition |
| `voucherAudit` | `ia.auditpoint.VoucherAudit` | composition |
| `riskRuleIndicators` | `ia.auditpoint.RiskRuleIndicator` | composition |
| `invoiceAudit` | `ia.auditpoint.InvoiceAudit` | composition |
| `riskRulePolBass` | `ia.auditpoint.RiskRulePolBas` | composition |
| `gptAudit` | `ia.auditpoint.GptAudit` | composition |

## 关联引用 (33个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `key_indicator` | `` |
| `manager_unit_id` | `` |
| `risk_type` | `` |
| `source_bill_type_id` | `bd_billtyperef` |
| `ytenant_id` | `` |
| `source_trans_type_id` | `bd_transtyperef` |
| `risk_business` | `` |

## 字段列表（按类型分组）

> 共 64 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 审核要点编码 |
| `business_obj` | `business_obj` | `businessObj` | 业务对象编码 |
| `start_condition` | `start_condition` | `startCondition` | 启动条件 |
| `remark` | `remark` | `remark` | 备注 |
| `audit_item` | `audit_item` | `auditItem` | 检查项 |
| `applicable_scenarios` | `applicable_scenarios` | `applicableScenarios` | 适用场景 |
| `` | `creator` | `creator` | 创建人名称 |
| `domain_id` | `domain_id` | `domainId` | 数据对象类型 |
| `execute_type` | `execute_type` | `executeType` | 检查时机 |
| `micro_service_code` | `micro_service_code` | `microServiceCode` | 微服务编码 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source_bill_type_id` | `source_bill_type_id` | `sourceBillType` | 单据类型id |
| `source_trans_type_id` | `source_trans_type_id` | `sourceTransType` | 交易类型id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `key_indicator` | `key_indicator` | `keyIndicator` | 关键指标 |
| `manager_unit_id` | `manager_unit_id` | `managerUnit` | 管理组织 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `risk_business` | `risk_business` | `riskBusiness` | 风险业务 |
| `risk_type` | `risk_type` | `riskType` | 风险类别 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_mode` | `business_mode` | `businessMode` | 是否业务对象模式 |
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |
| `preset_tag` | `preset_tag` | `presetTag` | 是否预置 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `importance_degree` | `importance_degree` | `importanceDegree` | 重要程度 |

### 短整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_mode` | `audit_mode` | `auditMode` | 审核方式 |
| `control_mode` | `control_mode` | `controlMode` | 控制模式 |
| `system_tag` | `system_tag` | `systemTag` | 系统标记 |
| `business_obj_type` | `business_obj_type` | `businessObjType` | 业务对象类型 |
| `business_type` | `business_type` | `businessType` | 业务类型 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `publish_status` | `publish_status` | `publishStatus` | 发布状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version` | `version` | `version` | 版本号 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 审核要点名称 |

### other (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `attachmentAudit` | 附件检查 |
| `` | `` | `auditPointCheckRuleParams` | 规则参数设置 |
| `` | `` | `auditPointDateRangeParams` | 规则参数设置 |
| `` | `` | `auditPointExtendParams` | 规则参数设置 |
| `` | `` | `auditPointParams` | 规则参数设置 |
| `` | `` | `businessObjectAudit` | 业务对象检查 |
| `` | `` | `compositeAudits` | 综合检查 |
| `` | `` | `contentAudit` | 非标附件检查 |
| `` | `` | `customAudit` | 自定义检查 |
| `` | `` | `gptAudit` | 大模型检查 |
| `` | `` | `imageAudit` | 影像检查 |
| `` | `` | `indexAudit` | 指标检查 |
| `` | `` | `invoiceAudit` | 票单检查 |
| `` | `` | `multimodalAudit` | 多模态附件检查 |
| `` | `` | `repeatAudit` | 重复事件检查 |
| `` | `` | `riskAuditContents` | 风险检查内容 |
| `` | `` | `riskRuleIndicators` | 风险项引用指标 |
| `` | `` | `riskRulePolBass` | 风险项政策依据 |
| `` | `` | `ruleLabelRelations` | 规则与标签关系表 |
| `` | `` | `semanticAudit` | 语义模型检查 |
| `` | `` | `sensitiveAudit` | 敏感词检查 |
| `` | `` | `simulationAudit` | 模拟事项分录检查 |
| `` | `` | `situationAudit` | 舆情分析 |
| `` | `` | `voucherAudit` | 单据检查 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
