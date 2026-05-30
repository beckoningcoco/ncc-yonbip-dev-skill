# |<<

**银行存款比价管理 (fac_pricecomparison / nc.vo.fac.pricecomparison.PriceComparisonVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2105.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricecomparison | 主键 | pk_pricecomparison | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | pk_currtype | 存入币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 7 | depositamount | 存款金额 | depositamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | olcrate | 组织本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 9 | olcdepositamount | 组织本币金额 | olcdepositamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | glcrate | 集团本币汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 11 | glcdepositamount | 集团本币金额 | glcdepositamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | gllcrate | 全局本币汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 13 | gllcdepositamount | 全局本币金额 | gllcdepositamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | depositdate | 存入日期 | depositdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 15 | vbillstate | 单据状态 | vbillstate | int |  | 银行存款比价管理单据状态 (PriceComparisonBillStateEnum) |  | 1=待提交; |