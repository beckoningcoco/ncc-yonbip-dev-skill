# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7242.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvris | pk_srvris | pk_srvris | char(20) | √ |
| 2 | dt_bodypart | dt_bodypart | dt_bodypart | varchar2(50) |
| 3 | dt_ristype | dt_ristype | dt_ristype | varchar2(50) |
| 4 | expert | expert | expert | varchar2(200) |
| 5 | flag_empty | flag_empty | flag_empty | varchar2(50) |
| 6 | note | note | note | varchar2(200) |
| 7 | pk_bodypart | pk_bodypart | pk_bodypart | varchar2(20) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |
| 10 | pk_ristype | pk_ristype | pk_ristype | varchar2(20) |
| 11 | pk_srv | pk_srv | pk_srv | varchar2(20) |  |  | '~' |
| 12 | work | work | work | varchar2(200) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |