# |<<

**模型规则 (tb_cuberule / nc.vo.mdm.cuberule.CubeRule)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5709.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | pk_busirule | 业务规则主键 | pk_busirule | char(20) |  | 字符串 (String) |
| 3 | rule_type | 规则类型 | rule_type | char(1) |  | 字符串 (String) |
| 4 | pk_cube | 模型主键 | pk_cube | char(50) |  | 字符串 (String) |
| 5 | orderindex | 排序号 | orderindex | int |  | 整数 (Integer) |