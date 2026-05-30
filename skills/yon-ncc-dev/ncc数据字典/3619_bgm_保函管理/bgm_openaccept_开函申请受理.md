# |<<

**开函申请受理 (bgm_openaccept / nc.vo.bgm.open.openaccept.OpenAcceptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1174.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_openaccept | 开函申请受理主键 | pk_openaccept | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_org_unit_v | 业务单元版本 | pk_org_unit_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_org_unit | 申请开函组织 | pk_org_unit | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 8 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 字符串 (String) |
| 9 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 10 | pk_applyorg | 申请开函单位 | pk_applyorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 11 | pk_applyorg_v | 申请开函单位版本 | pk_applyorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 12 | isagentflag | 委托代理开函 | isagentflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | pk_acceptorg | 代理开函受托方 | pk_acceptorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 14 | pk_acceptorg_v | 代理开函受托方版本 | pk_acceptorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 15 | pk_principalorg | 委托人 | pk_principalorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 16 | pk_principalorg_v | 委托人版本 | pk_principalorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 17 | pk_benefciary | 受益人 | pk_benefciary | varchar(20) |  | 客商 (custsupplier) |
| 18 | benefciaryname | 受益人名称 | benefciaryname | varchar(200) |  | 字符串 (String) |
| 19 | pk_guaranteebank | 担保银行 | pk_guaranteebank | varchar(20) |  | 银行档案 (bankdoc) |
| 20 | pk_gltype | 保函种类 | pk_gltype | varchar(20) |  | 保函种类 (bgm_category) |
| 21 | stagesflag | 分期解付 | stagesflag | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | openmethod | 保函开出方式 | openmethod | int |  | 保函开出方式 (OpenmethodEnum) |  | 1=电开; |