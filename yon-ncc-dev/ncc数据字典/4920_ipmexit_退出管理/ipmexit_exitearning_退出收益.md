# |<<

**退出收益 (ipmexit_exitearning / nc.vo.ipmexit.exitearning.ExitEarningVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3272.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exitearning | 退出收益主键 | pk_exitearning | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | benefit_body | 受益主体 | benefit_body | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 7 | pk_projectlib | 标的项目 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 8 | target_enterprise | 标的企业 | target_enterprise | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 9 | pk_investtype | 投资类型 | pk_investtype | varchar(20) |  | 投资类型 (InvestTypeVO) |
| 10 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 11 | noriginvestamountmny | 投资金额 | noriginvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nbaseinvestamountmny | 投资金额组织本币 | nbaseinvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | ngpinvestamountmny | 投资金额集团本币 | ngpinvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nallinvestamountmny | 投资金额全局本币 | nallinvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | hold_ratio | 投后占股比例(%) | hold_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | latest_hold_ratio | 最新持股比例(%) | latest_hold_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | exit_status | 退出状态 | exit_status | varchar(20) |  | 退出状态 (FundExitStatus) |  | 1=部分退出; |