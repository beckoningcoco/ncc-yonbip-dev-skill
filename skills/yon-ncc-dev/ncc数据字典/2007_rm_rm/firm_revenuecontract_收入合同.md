# |<<

**收入合同 (firm_revenuecontract / nc.vo.rm.revenue.RevenueContractVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2287.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_firm_sale | 收入合同 | pk_firm_sale | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | vbillcode | 合同编码 | vbillcode | varchar(40) |  | 字符串 (String) |
| 5 | name | 合同名称 | name | varchar(60) |  | 多语文本 (MultiLangText) |
| 6 | transtype | 合同类型 | transtype | varchar(20) |  | 交易类型 (transtype) |
| 7 | pk_parent | 上级合同 | pk_parent | varchar(20) |  | 收入合同 (revenue_contract) |
| 8 | pk_origin | 原始合同 | pk_origin | varchar(20) |  | 收入合同 (revenue_contract) |
| 9 | version | 版本号 | version | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | modireason | 修正理由 | modireason | varchar(50) |  | 字符串 (String) |
| 11 | latest | 是否最新版本 | latest | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | billtypecode | 单据类型编码 | billtypecode | varchar(20) |  | 字符串 (String) |
| 13 | trantypecode | 合同类型编码 | trantypecode | varchar(20) |  | 字符串 (String) |
| 14 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 15 | subscribedate | 合同签订日期 | subscribedate | char(19) |  | 日期 (UFDate) |
| 16 | valdate | 计划生效日期 | valdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 17 | invallidate | 计划终止日期 | invallidate | char(19) |  | 日期(结束) (UFDateEnd) |
| 18 | actualvalidate | 实际生效日期 | actualvalidate | char(19) |  | 日期(开始) (UFDateBegin) |
| 19 | actualinvalidate | 实际终止日期 | actualinvalidate | char(19) |  | 日期(结束) (UFDateEnd) |
| 20 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 21 | depid | 部门 | depid | varchar(20) |  | 组织_部门 (dept) |
| 22 | depid_v | 部门版本 | depid_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 23 | personnelid | 人员 | personnelid | varchar(20) |  | 人员基本信息 (psndoc) |
| 24 | beginperiod | 期初 | beginperiod | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | ispinvestor | 是否散户 | ispinvestor | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | pinvestor | 散户 | pinvestor | varchar(20) |  | 散户 (freecustom) |
| 27 | totalnum | 总数量 | totalnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 29 | notaxmny | 无税金额 | notaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | pricetaxmny | 价税合计 | pricetaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | exrate | 汇率 | exrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | currnotaxmny | 本币无税金额 | currnotaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | taxnum | 本币税额 | taxnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | currmny | 本币价税合计 | currmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | grpexrate | 集团本币汇率 | grpexrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | grpnotaxmny | 集团无税金额 | grpnotaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | grpcurrmny | 集团本币价税合计 | grpcurrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | glbexrate | 全局本币汇率 | glbexrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | glbnotaxmny | 全局无税金额 | glbnotaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | glbcurrmny | 全局本币价税合计 | glbcurrmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | pk_incomepolicy | 收入确认政策 | pk_incomepolicy | varchar(20) |  | 收入确认政策 (rm_incomepolicy) |
| 42 | billstatus | 单据状态 | billstatus | int |  | 单据状态 (RevenueContractStatus) |  | 1=保存; |