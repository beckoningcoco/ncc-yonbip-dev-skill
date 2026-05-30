# |<<

**转换规则明细 (bc_sendrule_b / nc.vo.bcsi.entity.BcsiRuleBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/246.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule_b | 明细主键 | pk_rule_b | char(20) | √ | 主键 (UFID) |
| 2 | vsendfiled | NC单据字段 | vsendfiled | varchar(50) |  | 字符串 (String) |
| 3 | vsendfiledname | NC单据字段名称 | vsendfiledname | varchar(100) |  | 字符串 (String) |
| 4 | fvoplace | NC字段位置 | fvoplace | varchar(50) |  | Evoplace (Evoplace) |  | 1=表头; |