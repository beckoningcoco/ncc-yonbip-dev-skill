# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10121.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_sub | pk_post_sub | pk_post_sub | char(20) | √ |
| 2 | indicode | indicode | indicode | varchar2(80) |
| 3 | isneed | isneed | isneed | char(1) |
| 4 | pk_capa | pk_capa | pk_capa | varchar2(20) |  |  | '~' |
| 5 | pk_capa_grade | pk_capa_grade | pk_capa_grade | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_indi_type | pk_indi_type | pk_indi_type | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_post | pk_post | pk_post | char(20) |
| 10 | scorestandard | scorestandard | scorestandard | varchar2(1000) |
| 11 | weight | weight | weight | number(16, 2) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |