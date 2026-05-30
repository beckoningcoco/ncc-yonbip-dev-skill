# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7187.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpap | pk_pdpap | pk_pdpap | char(20) | √ |
| 2 | eu_pdtype | eu_pdtype | eu_pdtype | number(38, 0) |
| 3 | flag_avtive | flag_avtive | flag_avtive | char(1) |
| 4 | flag_pp | flag_pp | flag_pp | char(1) |
| 5 | pdpap | pdpap | pdpap | number(14, 2) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pp_begin | pp_begin | pp_begin | number(14, 2) |
| 10 | pp_end | pp_end | pp_end | number(14, 2) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |