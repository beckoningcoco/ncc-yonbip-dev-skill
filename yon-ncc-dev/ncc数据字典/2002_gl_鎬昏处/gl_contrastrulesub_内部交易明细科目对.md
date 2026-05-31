# |<<

**内部交易明细科目对 (gl_contrastrulesub / nc.vo.gl.contrast.rule.ContrastRuleSubjVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2384.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastrulesub | 内部交易规则科目标识 | pk_contrastrulesub | char(20) | √ | 主键 (UFID) |
| 2 | isself | 是否本方 | isself | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | pk_accasoa | 科目 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 4 | pk_contrastrule | 内部交易规则标识 | pk_contrastrule | char(20) |  | 主键 (UFID) |
| 5 | code | 编码 | code | varchar(20) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(20) |  | 字符串 (String) |