# |<<

**开函修改 (bgm_openmodify / nc.vo.bgm.open.openmodify.OpenModifyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1176.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_openmodify | 开函修改主键 | pk_openmodify | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 3 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 8 | glno | 保函编号 | glno | varchar(50) |  | 字符串 (String) |
| 9 | pk_applyno | 申请编号 | pk_applyno | varchar(20) |  | 字符串 (String) |
| 10 | agentflag | 代理开函 | agentflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_applyorg | 申请开函单位 | pk_applyorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 12 | pk_applyorg_v | 申请开函单位版本 | pk_applyorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 13 | pk_agentorg | 代理开函受托中心 | pk_agentorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 14 | pk_agentorg_v | 代理开函受托中心组织版本 | pk_agentorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 15 | pk_principalorg | 委托人 | pk_principalorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 16 | pk_principalorg_v | 委托人版本 | pk_principalorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 17 | pk_benefciary | 受益人 | pk_benefciary | varchar(20) |  | 客商 (custsupplier) |
| 18 | benefciaryname | 受益人名称 | benefciaryname | varchar(200) |  | 字符串 (String) |
| 19 | pk_guaranteebank | 担保银行 | pk_guaranteebank | varchar(20) |  | 银行档案 (bankdoc) |
| 20 | pk_gltype | 保函种类 | pk_gltype | varchar(20) |  | 保函种类 (bgm_category) |
| 21 | stagesflag | 是否分期解付 | stagesflag | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | openmethod | 保函开出方式 | openmethod | int |  | 保函开出方式 (OpenmethodEnum) |  | 1=电开; |