# |<<

**对账报告查询VO (gl_contrastreport / nc.vogl.ContrastReportQryVO.contrastreport)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2377.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastreport | 对账报告标识 | pk_contrastreport | char(20) | √ | 主键 (UFID) |
| 2 | accperiod | 会计期间 | accperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 3 | pk_contrastrule | 内部交易对账规则 | pk_contrastrule | varchar(20) |  | 内部交易规则 (ContrastRuleVO) |
| 4 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 5 | self_accountingbook | 创建单位 | self_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 6 | contrastmoney | 对账金额性质 | contrastmoney | varchar(50) |  | 对账金额性质 (enum_contrastmoney) |  | N=发生; |