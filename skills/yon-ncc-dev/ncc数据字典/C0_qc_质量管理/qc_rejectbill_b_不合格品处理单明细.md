# |<<

**不合格品处理单明细 (qc_rejectbill_b / nc.vo.qc.c004.entity.RejectBillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4853.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rejectbill_b | 不合格品处理单明细 | pk_rejectbill_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 质检中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 3 | pk_org_v | 质检中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | creportrowno | 质检报告行号 | creportrowno | varchar(20) |  | 字符串 (String) |
| 7 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 8 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 12 | pk_chgmrl | 改判物料编码 | pk_chgmrl | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | pk_chgsrcmrl | 改判物料版本 | pk_chgsrcmrl | varchar(20) |  | 物料基本信息 (material_v) |
| 14 | pk_qualitylv_b | 质量等级 | pk_qualitylv_b | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 15 | beligible | 合格品 | beligible | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | pk_defecttype | 不合格类型 | pk_defecttype | varchar(20) |  | 质量不合格类型 (qc_rejecttype) |
| 17 | pk_noelgichkitem | 不合格项目 | pk_noelgichkitem | varchar(20) |  | 检验项目 (qc_checkitem) |
| 18 | vnoelignote | 不合格说明 | vnoelignote | varchar(181) |  | 字符串 (String) |
| 19 | pk_suggprocess | 建议处理方式 | pk_suggprocess | varchar(20) |  | 处理方式 (scm_dealfashion) |
| 20 | fprocessjudge | 处理方式判定 | fprocessjudge | int |  | 处理方式判定 (ProcessJudegEnum) |  | 1=入库; |