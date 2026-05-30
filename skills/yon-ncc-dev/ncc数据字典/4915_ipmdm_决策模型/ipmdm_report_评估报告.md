# |<<

**评估报告 (ipmdm_report / nc.vo.ipmdm.report.ReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3249.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_report | 评估报告主键 | pk_report | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | pk_psndoc | 任务发起人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | dcreatreportdate | 报告生成时间 | dcreatreportdate | char(19) |  | 日期时间 (UFDateTime) |
| 9 | pk_projectlib | 评估对象 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 10 | pk_project_org | 项目单位 | pk_project_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 11 | pk_project_org_v | 项目单位版本 | pk_project_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 12 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |