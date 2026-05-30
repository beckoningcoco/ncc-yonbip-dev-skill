# |<<

**转换xml配置 (bc_sendrule_m / nc.vo.bcsi.entity.BcsiRuleMVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/247.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule_m | 发送xml主键 | pk_rule_m | char(20) | √ | 主键 (UFID) |
| 2 | vsendpoint | 发送扩展点 | vsendpoint | varchar(181) |  | 字符串 (String) |
| 3 | vnote | 发送扩展点说明 | vnote | varchar(181) |  | 字符串 (String) |
| 4 | vxml | 发送xml名称 | vxml | varchar(50) |  | 字符串 (String) |