# |<<

**开函申请 (bgm_openapply / nc.vo.bgm.open.openapply.OpenapplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1175.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_openapply | 开函申请主键 | pk_openapply | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_financeorg | 财务组织 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_financeorg_v | 财务组织版本 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_billtypeid | 单据类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 9 | vbillno | 单据编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 10 | isagentflag | 委托代理开函 | isagentflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 11 | pk_acceptorg | 代理开函受托方 | pk_acceptorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 12 | pk_acceptorg_v | 代理开函受托方版本 | pk_acceptorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 13 | pk_principalorg | 委托人 | pk_principalorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 14 | pk_principalorg_v | 委托人版本 | pk_principalorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 15 | pk_benefciary | 受益人 | pk_benefciary | varchar(20) |  | 客商 (custsupplier) |
| 16 | benefciaryname | 受益人名称 | benefciaryname | varchar(300) |  | 字符串 (String) |
| 17 | pk_guaranteebank | 担保银行 | pk_guaranteebank | varchar(20) |  | 银行档案 (bankdoc) |
| 18 | pk_gltype | 保函种类 | pk_gltype | varchar(20) |  | 保函种类 (bgm_category) |
| 19 | stagesflag | 分期解付 | stagesflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 20 | openmethod | 保函开出方式 | openmethod | int |  | 保函开出方式 (OpenmethodEnum) | 2 | 1=电开; |