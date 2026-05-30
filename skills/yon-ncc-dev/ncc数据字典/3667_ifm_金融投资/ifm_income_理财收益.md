# |<<

**理财收益 (ifm_income / nc.vo.ifm.income.InvestIncomeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3114.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_income | 主键 | pk_income | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_apply | 申购编号 | pk_apply | varchar(20) |  | 理财申购 (InvestApplyVO) |
| 4 | gatheringdate | 到账日期 | gatheringdate | char(19) |  | 日期 (UFDate) |
| 5 | incomedate | 收益日期 | incomedate | char(19) |  | 日期 (UFDate) |
| 6 | lastincomedate | 上一收益日期 | lastincomedate | char(19) |  | 日期 (UFDate) |
| 7 | vbillno | 收益编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 8 | productname | 产品名称 | productname | varchar(50) |  | 字符串 (String) |
| 9 | productcode | 产品代码 | productcode | varchar(20) |  | 理财申购 (InvestApplyVO) |
| 10 | billstatus | 单据状态 | billstatus | varchar(50) |  | 收益单据状态 (IncomeBillStatusEnum) |  | 1=待提交; |