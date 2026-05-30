# |<<

**内部交易规则启用设置 (gl_contrastrulestartset / nc.vo.gl.contrast.rule.ContrastRuleStartSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2383.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastrulestartset | 内部交易规则启用设置标识 | pk_contrastrulestartset | char(20) | √ | 主键 (UFID) |
| 2 | pk_contrastrule | 内部交易规则标识 | pk_contrastrule | char(20) |  | 主键 (UFID) |
| 3 | arearow | 范围行 | arearow | int |  | 整数 (Integer) |
| 4 | pk_accountingbook | 财务核算帐簿标识 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 5 | startdate | 启用日期 | startdate | char(19) |  | 日期 (UFDate) |