# |<<

**退出方案 (ipmexit_scheme / nc.vo.ipmexit.exitscheme.ExitSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3281.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scheme | 退出方案主键 | pk_scheme | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_invest_subject | 投资主体 | pk_invest_subject | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 6 | pk_fund | 基金名称 | pk_fund | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 7 | vbillcode | 方案编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 8 | name | 方案名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 9 | pk_projectlib | 标的项目 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 10 | target_enterprise | 标的企业 | target_enterprise | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 11 | pk_invest_type | 投资类型 | pk_invest_type | varchar(20) |  | 投资类型 (InvestTypeVO) |
| 12 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 13 | noriginvestamountmny | 投资金额 | noriginvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nbaseinvestamountmny | 投资金额组织本币 | nbaseinvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | ngpinvestamountmny | 投资金额集团本币 | ngpinvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nallinvestamountmny | 投资金额全局本币 | nallinvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | hold_ratio | 投后占股比例(%) | hold_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | latest_hold_ratio | 最新持股比例(%) | latest_hold_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | bisnormalexit | 是否正常退出 | bisnormalexit | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | quit_reason | 退出原因 | quit_reason | varchar(1024) |  | 备注 (Memo) |
| 21 | pk_dept | 编制部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 22 | pk_dept_v | 编制部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 23 | pk_psndoc | 编制人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 24 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |