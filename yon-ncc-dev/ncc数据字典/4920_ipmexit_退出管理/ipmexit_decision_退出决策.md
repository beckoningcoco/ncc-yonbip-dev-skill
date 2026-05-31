# |<<

**退出决策 (ipmexit_decision / nc.vo.ipmexit.exitdecision.ExitDecisionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3268.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_decision | 退出决策主键 | pk_decision | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_invest_subject | 投资主体 | pk_invest_subject | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 6 | pk_fund | 基金名称 | pk_fund | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 7 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 8 | pk_projectlib | 标的项目 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 9 | target_enterprise | 标的企业 | target_enterprise | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 10 | latest_hold_ratio | 最新持股比例(%) | latest_hold_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | bisnormalexit | 是否正常退出 | bisnormalexit | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | quit_reason | 退出原因 | quit_reason | varchar(1024) |  | 备注 (Memo) |
| 13 | pk_dept | 经办部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 14 | pk_dept_v | 经办部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 15 | pk_psndoc | 经办人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |