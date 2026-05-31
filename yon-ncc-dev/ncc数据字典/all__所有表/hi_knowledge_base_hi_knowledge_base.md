# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8631.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_knowledge_base | pk_knowledge_base | pk_knowledge_base | char(20) | √ |
| 2 | answer | answer | answer | clob |
| 3 | answer_type | answer_type | answer_type | number(38, 0) |
| 4 | fabulous_num | fabulous_num | fabulous_num | number(38, 0) |
| 5 | is_enable | is_enable | is_enable | char(1) |
| 6 | is_hot | is_hot | is_hot | char(1) | √ |
| 7 | label | label | label | varchar2(200) |
| 8 | link_url | link_url | link_url | varchar2(200) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | remark | remark | remark | varchar2(50) |
| 12 | title | title | title | varchar2(200) | √ |
| 13 | type | type | type | varchar2(20) | √ |
| 14 | visits_num | visits_num | visits_num | number(38, 0) |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |