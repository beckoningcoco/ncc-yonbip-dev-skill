# |<<

**对账结果查询对象 (gl_ResultQryVO / nc.vogl.ResultQryVO.ResultQryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2471.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastrule | 内部交易对账规则 | pk_contrastrule | varchar(20) |  | 内部交易规则 (ContrastRuleVO) |
| 2 | pk_accperiodscheme | 会计期间方案 | pk_accperiodscheme | varchar(20) |  | 会计期间方案 (accperiodscheme) |
| 3 | yearperiod | 会计期间 | yearperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 4 | reportstatus | 对账报告状态 | reportstatus | varchar(20) |  | 对帐报告状态 (reportstatusenum) |  | 1=生成; |