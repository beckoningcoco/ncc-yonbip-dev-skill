# |<<

**费用分摊明细 (fmc_financingcost_b / nc.vo.fmc.financingcost.FinancingCostBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2291.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financingcost_b | 费用分摊明细主键 | pk_financingcost_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 3 | srcbilltype | 来源单据类型 | srcbilltype | varchar(50) |  | 来源单据类型 (SrcBillType) |  | 36Z2=贷款合同; |