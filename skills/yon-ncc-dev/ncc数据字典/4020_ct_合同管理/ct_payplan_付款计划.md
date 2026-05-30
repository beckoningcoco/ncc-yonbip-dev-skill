# |<<

**付款计划 (ct_payplan / nc.vo.ct.purdaily.entity.PayPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1660.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_payplan | 付款计划 | pk_ct_payplan | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 序号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | iaccounttermno | 账期号 | iaccounttermno | int |  | 整数 (Integer) |
| 4 | pk_paytermch | 付款协议账期号 | pk_paytermch | varchar(20) |  | 主键 (UFID) |
| 5 | pk_payterm | 付款协议 | pk_payterm | varchar(20) |  | 付款协议 (payment) |
| 6 | feffdatetype | 起效依据 | feffdatetype | varchar(20) |  | 付款时点 (payperiod) |
| 7 | dbegindate | 起算日期 | dbegindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 8 | iitermdays | 账期天数 | iitermdays | int |  | 整数 (Integer) |
| 9 | denddate | 账期到期日 | denddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 10 | bpreflag | 预付款 | bpreflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | nrate | 比率（%） | nrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | ntotalorigmny | 付款金额 | ntotalorigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | norigmny | 金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nmny | 本币金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 16 | ccurrencyid | 本币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 17 | nexchangerate | 折本汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | naccumpayapporgmny | 累计付款申请金额 | naccumpayapporgmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | naccumpayappmny | 累计付款申请本币金额 | naccumpayappmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | naccumpayorgmny | 累计付款金额 | naccumpayorgmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | naccumpaymny | 累计付款本币金额 | naccumpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | pk_financeorg | 应付财务组织原始版 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 23 | pk_financeorg_v | 应付财务组织 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 24 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |