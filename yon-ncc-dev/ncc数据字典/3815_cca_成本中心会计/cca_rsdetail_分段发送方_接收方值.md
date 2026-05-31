# |<<

**分段发送方/接收方值 (cca_rsdetail / nc.vo.cca.rulescheme.allocruleset.RSDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1299.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ruledetail | 主键 | pk_ruledetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_allocruleset | 分摊规则设置主键 | pk_allocruleset | varchar(20) |  | 字符串 (String) |
| 3 | type | 详细信息类别 | type | int |  | 段方向分类 (rulesectiontypeenum) |  | 0=发送方; |