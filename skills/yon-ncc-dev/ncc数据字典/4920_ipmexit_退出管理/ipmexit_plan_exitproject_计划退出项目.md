# |<<

**计划退出项目 (ipmexit_plan_exitproject / nc.vo.ipmexit.editplan.ExitPlanExitProjectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3280.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exitproject | 计划退出项目主键 | pk_exitproject | varchar(50) | √ | 字符串 (String) |
| 2 | pk_projectlib | 项目编码 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 3 | target_enterprise | 标的企业 | target_enterprise | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 4 | pk_invest_type | 投资类型 | pk_invest_type | varchar(20) |  | 投资类型 (InvestTypeVO) |
| 5 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 6 | noriginvestamountmny | 投资金额 | noriginvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nbaseinvestamountmny | 投资金额组织本币 | nbaseinvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ngpinvestamountmny | 投资金额集团本币 | ngpinvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nallinvestamountmny | 投资金额全局本币 | nallinvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | hold_ratio | 投后占股比例(%) | hold_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | latest_hold_ratio | 最新持股比例(%) | latest_hold_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | bisnormalexit | 是否正常退出 | bisnormalexit | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | quit_reason | 退出原因 | quit_reason | varchar(1024) |  | 备注 (Memo) |
| 14 | sug_exit_way | 计划退出方式 | sug_exit_way | varchar(50) |  | 建议退出方式 (SugExitWay) |  | 1=上市; |