# |<<

**分布系统传输规则 (gl_distransrule / nc.vo.gl.voucher.distribution.DistransRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2409.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transrule | 传输规则ID | pk_transrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | srcsyscode | 来源系统编码 | srcsyscode | varchar(50) |  | 字符串 (String) |
| 4 | rulename | 规则名称 | rulename | varchar(50) |  | 字符串 (String) |
| 5 | transdatatype | 传输数据类型 | transdatatype | varchar(50) |  | 传输数据类型 (transdatatypeenum) |  | 1=凭证; |