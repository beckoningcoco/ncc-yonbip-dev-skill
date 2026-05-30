# |<<

**质检报告明细 (qc_reportbill_b / nc.vo.qc.c003.entity.ReportItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4859.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportbill_b | 质检报告明细 | pk_reportbill_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 质检中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 3 | pk_org_v | 质检中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | cfirstid | 源头单据主键 | cfirstid | varchar(20) |  | 主键 (UFID) |
| 7 | cfirstbid | 源头单据明细 | cfirstbid | varchar(20) |  | 主键 (UFID) |
| 8 | cfirsttypecode | 源头单据类型 | cfirsttypecode | varchar(20) |  | 字符串 (String) |
| 9 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 11 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 12 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 17 | bchanged | 改判 | bchanged | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | pk_chgmrl | 改判物料 | pk_chgmrl | varchar(20) |  | 物料基本信息（多版本） (material) |
| 19 | pk_chgsrcmrl | 改判物料最新版本 | pk_chgsrcmrl | varchar(20) |  | 物料基本信息 (material_v) |
| 20 | pk_qualitylv_b | 质量等级 | pk_qualitylv_b | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 21 | pk_batchcode | 入库批次号主键 | pk_batchcode | varchar(20) |  | 主键 (UFID) |
| 22 | vbatchcode | 入库批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 23 | beligible | 合格品 | beligible | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | dproducedate | 生产日期 | dproducedate | varchar(19) |  | 日期 (UFDate) |
| 25 | dinvaliddate | 失效日期 | dinvaliddate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 26 | pk_defecttype | 不合格类型 | pk_defecttype | varchar(20) |  | 质量不合格类型 (qc_rejecttype) |
| 27 | pk_notelgiitem | 不合格项目 | pk_notelgiitem | varchar(20) |  | 检验项目 (qc_checkitem) |
| 28 | vnotelignote | 不合格说明 | vnotelignote | varchar(181) |  | 字符串 (String) |
| 29 | pk_chargedept | 责任部门最新版本 | pk_chargedept | varchar(20) |  | 组织_部门 (dept) |
| 30 | pk_chargedept_v | 责任部门 | pk_chargedept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 31 | pk_chargepsn | 责任人 | pk_chargepsn | varchar(20) |  | 人员基本信息 (psndoc) |
| 32 | pk_suggprocess | 建议处理方式 | pk_suggprocess | varchar(20) |  | 处理方式 (scm_dealfashion) |
| 33 | fprocessjudge | 处理方式判定 | fprocessjudge | int |  | 处理方式判定 (ProcessJudegEnum) |  | 1=入库; |