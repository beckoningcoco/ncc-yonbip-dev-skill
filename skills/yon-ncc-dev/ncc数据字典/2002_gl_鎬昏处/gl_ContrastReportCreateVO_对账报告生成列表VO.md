# |<<

**对账报告生成列表VO (gl_ContrastReportCreateVO / nc.vo.gl.contrast.report.create.ContrastReportCreateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2378.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastreportcreate | 对账报告标识 | pk_contrastreportcreate | char(20) | √ | 主键 (UFID) |
| 2 | bselect | 选择 | bselect | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | rownum | 序号 | rownum | int |  | 整数 (Integer) |
| 4 | year | 年份 | year | varchar(50) |  | 字符串 (String) |
| 5 | month | 月份 | month | varchar(50) |  | 字符串 (String) |
| 6 | pk_contrastrule | 内部交易对账规则 | pk_contrastrule | varchar(20) |  | 内部交易规则 (ContrastRuleVO) |
| 7 | createstatus | 生成状态 | createstatus | varchar(50) |  | 报告生成状态 (createstatus) |  | 1=未生成; |