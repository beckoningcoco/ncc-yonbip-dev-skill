# |<<

**内部交易规则辅助核算 (gl_contrastruleass / nc.vo.gl.contrast.rule.ContrastRuleAssVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2382.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastruleass | 内部交易规则辅助核算标识 | pk_contrastruleass | char(20) | √ | 主键 (UFID) |
| 2 | pk_contrastrule | 内部交易规则标识 | pk_contrastrule | char(20) |  | 主键 (UFID) |
| 3 | pk_checktype | 档案类别 | pk_checktype | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 4 | pk_checkvalue | 档案PK | pk_checkvalue | varchar(50) |  | 字符串 (String) |
| 5 | doccode | 档案编码 | doccode | varchar(200) |  | 字符串 (String) |
| 6 | docname | 档案名称 | docname | varchar(300) |  | 字符串 (String) |
| 7 | assrow | 设置行 | assrow | int |  | 整数 (Integer) |