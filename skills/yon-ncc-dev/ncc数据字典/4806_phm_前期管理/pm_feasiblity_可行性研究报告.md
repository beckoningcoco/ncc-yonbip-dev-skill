# |<<

**可行性研究报告 (pm_feasiblity / nc.vo.phm.feasiblityreport.FeasiblityReportHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4463.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_feasiblity | 可行性研究报告主键 | pk_feasiblity | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 3 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | project_name | 项目名称 | project_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | bill_code | 报告编号 | bill_code | varchar(40) |  | 字符串 (String) |
| 7 | customer_name | 客户名称 | customer_name | varchar(50) |  | 字符串 (String) |
| 8 | pk_eps | 项目基本分类 | pk_eps | varchar(20) |  | 项目基本分类 (EpsVO) |
| 9 | estimate_mny | 投资估算金额 | estimate_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | bill_status | 单据状态 | bill_status | int |  | 项目管理单据状态 (pmbillstatus) |  | -1=自由态; |