# |<<

**对账结果查询列表VO (gl_resultlisttabvo / nc.vo.gl.contrast.result.ResultListTabVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2468.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_resultlisttabvo | 结果列表标识 | pk_resultlisttabvo | char(20) | √ | 主键 (UFID) |
| 2 | pk_contrastrule | 内部交易对账规则 | pk_contrastrule | varchar(20) |  | 内部交易规则 (ContrastRuleVO) |
| 3 | contrastmoneytype | 对账金额性质 | contrastmoneytype | varchar(50) |  | 字符串 (String) |
| 4 | booktype | 账簿类型 | booktype | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 5 | year | 年份 | year | varchar(50) |  | 字符串 (String) |
| 6 | month | 月份 | month | varchar(50) |  | 字符串 (String) |
| 7 | pk_currtype | 币种标识 | pk_currtype | char(20) |  | 主键 (UFID) |
| 8 | reportstatus | 状态 | reportstatus | int |  | 对帐报告状态 (reportstatusenum) |  | 1=生成; |