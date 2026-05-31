# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7351.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dataround | pk_dataround | pk_dataround | char(20) | √ |
| 2 | cperiod | cperiod | cperiod | varchar2(2) |
| 3 | cyear | cyear | cyear | varchar2(4) |
| 4 | notes | notes | notes | varchar2(50) |
| 5 | pk_bm_class | pk_bm_class | pk_bm_class | varchar2(20) | √ |  | '~' |
| 6 | pk_classitem | pk_classitem | pk_classitem | varchar2(20) | √ |  | '~' |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |
| 8 | pk_loctrule | pk_loctrule | pk_loctrule | varchar2(20) | √ |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |
| 10 | round_type | round_type | round_type | number(38, 0) | √ |
| 11 | to_next | to_next | to_next | char(1) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |