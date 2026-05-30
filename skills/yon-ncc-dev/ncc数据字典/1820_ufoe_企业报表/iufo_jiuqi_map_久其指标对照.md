# |<<

**久其指标对照 (iufo_jiuqi_map / nc.vo.iufo.jiuqi.NetMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3465.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_map_id | 对照关系主键 | pk_map_id | char(20) | √ | 主键 (UFID) |
| 2 | jiuqi_name | 久其指标名称 | jiuqi_name | varchar(200) |  | 字符串 (String) |
| 3 | jiuqi_code | 久其指标编码 | jiuqi_code | varchar(64) |  | 字符串 (String) |
| 4 | iufo_pk | IUFO指标主键 | iufo_pk | varchar(64) |  | 字符串 (String) |
| 5 | map_type | 对照关系类型 | map_type | int |  | 对照关系类型 (netmaptype) |  | 1=单位关系对照; |