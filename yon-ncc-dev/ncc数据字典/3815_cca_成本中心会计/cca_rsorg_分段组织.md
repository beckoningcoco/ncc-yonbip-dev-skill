# |<<

**分段组织 (cca_rsorg / nc.vo.cca.rulescheme.allocruleset.RSOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1301.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rsorg | 标识 | pk_rsorg | char(20) | √ | 主键 (UFID) |
| 2 | pk_allocruleset | 分摊规则设置主键 | pk_allocruleset | varchar(20) |  | 字符串 (String) |
| 3 | type | 分类 | type | int |  | 段方向分类 (rulesectiontypeenum) |  | 0=发送方; |