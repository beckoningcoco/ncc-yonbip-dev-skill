# |<<

**内部交易规则明细范围 (gl_contrastrulearea / nc.vo.gl.contrast.rule.ContrastRuleAreaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2381.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastrulearea | 内部交易规则明细范围标识 | pk_contrastrulearea | char(20) | √ | 主键 (UFID) |
| 2 | isself | 是否本方 | isself | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | pk_org | 单位 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_contrastrule | 内部交易规则标识 | pk_contrastrule | char(20) |  | 主键 (UFID) |
| 5 | setrow | 设置行 | setrow | int |  | 整数 (Integer) |
| 6 | regcode | 正则表达式编码 | regcode | varchar(40) |  | 字符串 (String) |