# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9644.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_map_id | pk_map_id | pk_map_id | char(20) | √ |
| 2 | iufo_pk | iufo_pk | iufo_pk | varchar2(64) |
| 3 | jiuqi_code | jiuqi_code | jiuqi_code | varchar2(64) |
| 4 | jiuqi_name | jiuqi_name | jiuqi_name | varchar2(200) |
| 5 | mapvo_type | mapvo_type | mapvo_type | varchar2(50) |
| 6 | map_type | map_type | map_type | number(38, 0) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |