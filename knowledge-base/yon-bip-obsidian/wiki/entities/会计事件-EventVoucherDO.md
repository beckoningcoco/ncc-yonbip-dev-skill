---
tags: [BIP, 元数据, 数据字典, 会计事件, AAI, eaai.eventvoucher.EventVoucherDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 事项分录 (`eaai.eventvoucher.EventVoucherDO`)

> **平台版本：BIP 旗舰版 V5**
> YonBIP 会计事件（AAI）模块的完整元数据字典。
> 物理表：`aai_voucher` | 业务对象ID：`98f70a5f-8833-436d-bfcc-966d309e5c22`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 事项分录 |
| 物理表 | `aai_voucher` |
| domain/服务域 | `yonbip-fi-eaai` |
| schema | `fieaai` |
| 所属应用 | `AAI` |
| 直连字段 | 124 个 |
| 关联引用 | 27 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `details` | `eaai.eventvoucher.EventVoucherDetailsDO` | composition |

## 关键字段

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `voucher_class` | `voucher_class` | eventVoucherType | 事项分录类别 |
| `multi_accentity_batch_no` | `multi_accentity_batch_no` | String | 批号 |
| `multi_accentity_version` | `multi_accentity_version` | Long | 版本号 |
| `bln_enter` | `bln_enter` | Boolean | 是否手工录入的事项分录 |
| `accbook_property_id` | `accbook_property_id` | 887e9fc5-8422-44b9-a5ab-b262a82a6144 | 账簿属性 |
| `accbook_id` | `accbook_id` | 5df8e763-5595-4a87-9ff9-a7ac3bd1e81e | 账簿 |
| `accbook_type_id` | `accbook_type_id` | 9e073034-63ae-4aba-a113-1b28396f35e6 | 账簿类型 |
| `accentity_id` | `accentity_id` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | 会计主体 |
| `accpurpose_id` | `accpurpose_id` | 637f4637-0862-4167-a2bf-ef52818ca9d9 | 核算目的 |
| `attached_num` | `attached_num` | Integer | 附单据数 |
| `audit_state` | `audit_state` | String | 审核状态 |
| `bip_gl_voucher_id` | `bip_gl_voucher_id` | String | BIP总账凭证ID |
| `bip_gl_voucher_no` | `bip_gl_voucher_no` | String | BIP总账凭证号 |
| `bln_begin_period_split` | `bln_begin_period_split` | BooleanEnum | 期初拆分数据标识 |
| `bln_begin_split_completed` | `bln_begin_split_completed` | BooleanEnum | 期初被完全拆分标识 |
| `bln_effective` | `bln_effective` | BooleanEnum | 事项分录生效状态 |
| `bln_manual` | `bln_manual` | BooleanEnum | 手工凭证 |
| `bln_period_begin` | `bln_period_begin` | BooleanEnum | 期初事项分录 |
| `bln_re_calculate` | `bln_re_calculate` | BooleanEnum | 重算 |
| `bln_writedoff` | `bln_writedoff` | BooleanEnum | 冲销凭证 |
| `bln_from_reversal_voucher` | `bln_from_reversal_voucher` | BooleanEnum | 总账凭证手工修改标识 |
| `busi_date` | `busi_date` | String | 业务日期 |
| `busi_event_id` | `busi_event_id` | 2440bd9e-542c-47ea-9070-dbfcaf3eed65 | 业务事项ID |
| `busi_rel_message_1` | `busi_rel_message_1` | String | 业务关联信息1 |
| `busi_rel_message_10` | `busi_rel_message_10` | String | 业务关联信息10 |
| `busi_rel_message_2` | `busi_rel_message_2` | String | 业务关联信息2 |
| `busi_rel_message_3` | `busi_rel_message_3` | String | 业务关联信息3 |
| `busi_rel_message_4` | `busi_rel_message_4` | String | 业务关联信息4 |
| `busi_rel_message_5` | `busi_rel_message_5` | String | 业务关联信息5 |
| `busi_rel_message_6` | `busi_rel_message_6` | String | 业务关联信息6 |
| `busi_rel_message_7` | `busi_rel_message_7` | String | 业务关联信息7 |
| `busi_rel_message_8` | `busi_rel_message_8` | String | 业务关联信息8 |
| `busi_rel_message_9` | `busi_rel_message_9` | String | 业务关联信息9 |
| `cash_flow_state` | `cash_flow_state` | String | 现金流量状态 |
| `control_scope_id` | `control_scope_id` | b382fbab-2ecb-4733-bdb3-a6d3b81bf726 | 管控范围 |
| `dtc_gtxid` | `dtc_gtxid` | String | 分布式事务id |
| `dtc_status` | `dtc_status` | Integer | 分布式事务状态 |
| `edit_rule_id` | `edit_rule_id` | String | 修改规则 |
| `fi_app_code` | `fi_app_code` | String | 财务应用编码 |
| `fi_app_id` | `fi_app_id` | d5737052-9d1e-4cfa-9cab-bee31d88dd8b | 财务应用ID |
| `fi_event_code` | `fi_event_code` | String | 会计事务号 |
| `fi_event_id` | `fi_event_id` | ff8c5979-f9dc-4259-8b9f-6fe69da87bf6 | 会计事务ID |
| `fi_event_record_id` | `fi_event_record_id` | String | 会计事务对应的记录的id |
| `fi_event_record_no` | `fi_event_record_no` | String | 会计事务记录号 |
| `free_ch_id` | `free_ch_id` | 6c284702-d49e-4e68-9f02-8ac681cb1343 | 自由自定义项 |
| `gl_group_id` | `gl_group_id` | String | 总账凭证分组ID |
| `gl_voucher_id` | `gl_voucher_id` | String | 总账凭证ID |
| `gl_voucher_no` | `gl_voucher_no` | String | 总账凭证号 |
| `make_date` | `make_date` | String | 制单日期 |
| `maker_id` | `maker_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 制单人 |
| `merge_rule_id` | `merge_rule_id` | 13c3898d-86d1-4c2f-a1df-857a8dd4611b | 分录合并规则 |
| `ori_bill_id` | `ori_bill_id` | String | 源头单据id |
| `ori_bill_no` | `ori_bill_no` | String | 源头单据号 |
| `ori_bill_type_id` | `ori_bill_type_id` | String | 源头单据类型 |
| `period_begin_type` | `period_begin_type` | Integer | 期初余额标识 |
| `period_code` | `period_code` | String | 会计期间编码 |
| `period_id` | `period_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | 会计期间 |
| `period_year` | `period_year` | String | 期间年 |
| `send_gl_operation` | `send_gl_operation` | fieaai_sendGlOperation | 传总账操作 |
| `send_gl_state` | `send_gl_state` | fieaai_sendgl_state | 传总账状态 |
| `send_gl_type` | `send_gl_type` | fieaai_transfertoglenum | 传总账类型 |
| `settle_redflush_fi_app_code` | `settle_redflush_fi_app_code` | String | 红冲财务应用编码 |
| `settle_redflush_fi_app_id` | `settle_redflush_fi_app_id` | String | 红冲财务应用ID |
| `settle_redflush_period_year` | `settle_redflush_period_year` | String | 红冲的期间年编码 |
| `settle_redflush_type` | `settle_redflush_type` | String | 红冲标识 |
| `settle_redflush_voucher_id` | `settle_redflush_voucher_id` | String | 被红冲分录ID |
| `src_accbook_id` | `src_accbook_id` | 5df8e763-5595-4a87-9ff9-a7ac3bd1e81e | 来源账簿 |
| `src_app_code` | `src_app_code` | String | 来源应用编码 |
| `src_app_id` | `src_app_id` | d5737052-9d1e-4cfa-9cab-bee31d88dd8b | 来源应用ID |
| `src_bill_accounting_date` | `src_bill_accounting_date` | String | 来源单据记账日期 |
| `src_bill_date` | `src_bill_date` | String | 来源单据日期 |
| `src_bill_id` | `src_bill_id` | String | 来源单据id |
| `src_bill_no` | `src_bill_no` | String | 来源单据号 |
| `src_bill_org_id` | `src_bill_org_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | 来源数据的组织 |
| `src_bill_type_id` | `src_bill_type_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | 来源单据类型 |
| `src_busi_obj_code` | `src_busi_obj_code` | String | 来源业务对象编码 |
| `src_module` | `src_module` | String | 来源模块 |
| `src_system_id` | `src_system_id` | d5737052-9d1e-4cfa-9cab-bee31d88dd8b | 来源系统主键 |
| `src_trad_type` | `src_trad_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 来源交易类型 |
| `summary` | `summary` | String | 摘要 |
| `transport_pubts` | `transport_pubts` | Date | 传送时间 |
| `transporter` | `transporter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 传送人 |
| `voucher_category` | `voucher_category` | epca_vouchercategory | 凭证分类 |
| `voucher_no` | `voucher_no` | String | 事项分录编码 |
| `voucher_tmpl_code` | `voucher_tmpl_code` | String | 凭证模板编码 |
| `voucher_tmpl_id` | `voucher_tmpl_id` | String | 凭证模板ID |
| `voucher_type` | `voucher_type` | 4a2cdeef-16cd-46c6-91b6-629eaf7be9e1 | 凭证类型 |
| `writeoff_oppose_no` | `writeoff_oppose_no` | String | 冲销对方编码-事项分录 |
| `writeoff_status` | `writeoff_status` | WriteOffStateEnum | 冲销状态 |
| `writeoffed_voucher_id` | `writeoffed_voucher_id` | String | 被冲销凭证ID |
| `ori_system` | `ori_system` | String | 源头系统 |
| `external_source_system_id` | `external_source_system_id` | String | 外部来源系统id |
| `external_source_system_name` | `external_source_system_name` | String | 外部来源系统名称 |
| `external_source_data_id` | `external_source_data_id` | String | 外部来源数据标识 |
| `external_source_data_type` | `external_source_data_type` | String | 外部来源数据类型 |
| `external_source_data_version` | `external_source_data_version` | Long | 外部来源数据版本号 |
| `external_source_data_code` | `external_source_data_code` | String | 外部来源数据编码 |
| `` | `` | bb20407e-4c44-4dae-a919-bd08eb8f266a | 事项分录明细 |
| `bustype` | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 交易类型 |
| `auditor` | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 审批人 |
| `audit_time` | `audit_time` | DateTime | 审批日期 |
| `auditnote` | `auditnote` | String | 审批批语 |
| `procinst_id` | `procinst_id` | String | 流程实例ID |
| `verifystate` | `verifystate` | sys_verifystate | 单据状态 |
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |
| `code` | `code` | String | 编码 |
| `dr` | `dr` | Short | 逻辑删除 |
| `id` | `id` | String | 主键 |
| `pubts` | `pubts` | DateTime | 时间戳 |

## 数值字段（金额/数量）

| 字段名 | 数据库列 | 显示名 |
|--------|---------|--------|
| `control_credit_total` | `control_credit_total` | 管控范围币贷方合计 |
| `control_debit_total` | `control_debit_total` | 管控范围币借方合计 |
| `credit_total` | `credit_total` | 本币贷方合计 |
| `debit_total` | `debit_total` | 本币借方合计 |
| `global_credit_total` | `global_credit_total` | 全局币贷方合计 |
| `global_debit_total` | `global_debit_total` | 全局币借方合计 |
| `group_credit_total` | `group_credit_total` | 集团币贷方合计 |
| `group_debit_total` | `group_debit_total` | 集团币借方合计 |
| `org_credit_total` | `org_credit_total` | 组织币贷方合计 |
| `org_debit_total` | `org_debit_total` | 组织币借方合计 |
| `src_bill_amount` | `src_bill_amount` | 来源数据的金额 |
