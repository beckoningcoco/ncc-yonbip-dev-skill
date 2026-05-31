# |<<

**退出计划 (ipmexit_plan / nc.vo.ipmexit.editplan.ExitPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3278.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plan | 退出计划主键 | pk_plan | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_invest_subject | 投资主体 | pk_invest_subject | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 6 | vbillcode | 计划编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 7 | name | 计划名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | pk_fund | 基金名称 | pk_fund | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 9 | vyear | 所属年度 | vyear | varchar(50) |  | 字符串 (String) |
| 10 | vplantype | 计划类型 | vplantype | varchar(50) |  | 计划类型 (PlanType) |  | 1=年度; |