# |<<

**开函台账 (bgm_openreport / nc.vo.bgm.open.openreport.OpenReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1179.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_openreport | 开函台账主键 | pk_openreport | char(20) | √ | 主键 (UFID) |
| 2 | pk_openregister | 开函登记主键 | pk_openregister | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | vbillno | 登记单号 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | glno | 保函编号 | glno | varchar(50) |  | 字符串 (String) |
| 8 | pk_applyno | 申请编号 | pk_applyno | varchar(20) |  | 开函申请受理 (bgm_openaccept) |
| 9 | applyapprover | 申请审批人 | applyapprover | varchar(20) |  | 用户 (user) |
| 10 | applyapprovedate | 申请审批日期 | applyapprovedate | char(19) |  | 日期 (UFDate) |
| 11 | agentflag | 代理开函 | agentflag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_applyorg | 申请开函单位 | pk_applyorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 13 | pk_applyorg_v | 申请开函单位版本 | pk_applyorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 14 | pk_agentorg | 代理开函受托方 | pk_agentorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 15 | pk_agentorg_v | 代理开函受托方组织版本 | pk_agentorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 16 | pk_principalorg | 委托人 | pk_principalorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 17 | pk_principalorg_v | 委托人版本 | pk_principalorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 18 | pk_benefciary | 受益人 | pk_benefciary | varchar(20) |  | 客商 (custsupplier) |
| 19 | benefciaryname | 受益人名称 | benefciaryname | varchar(300) |  | 字符串 (String) |
| 20 | pk_guaranteebank | 担保银行 | pk_guaranteebank | varchar(20) |  | 银行档案 (bankdoc) |
| 21 | pk_gltype | 保函种类 | pk_gltype | varchar(20) |  | 保函种类 (bgm_category) |
| 22 | stagesflag | 分期解付 | stagesflag | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | openmethod | 保函开出方式 | openmethod | int |  | 保函开出方式 (OpenmethodEnum) |  | 1=电开; |