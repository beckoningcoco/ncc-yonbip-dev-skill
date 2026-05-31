# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7244.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvset | pk_srvset | pk_srvset | char(20) | √ |
| 2 | dt_role_srvset | dt_role_srvset | dt_role_srvset | varchar2(50) |
| 3 | dt_usage | dt_usage | dt_usage | varchar2(50) |
| 4 | dt_usegenote | dt_usegenote | dt_usegenote | varchar2(50) |
| 5 | flag_active | flag_active | flag_active | char(1) | √ |
| 6 | flag_edit | flag_edit | flag_edit | char(1) | √ |
| 7 | note | note | note | varchar2(256) |
| 8 | pk_freq | pk_freq | pk_freq | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_role_srvset | pk_role_srvset | pk_role_srvset | varchar2(20) |  |  | '~' |
| 12 | pk_srv | pk_srv | pk_srv | varchar2(20) |  |  | '~' |
| 13 | pk_srv_child | pk_srv_child | pk_srv_child | varchar2(20) | √ |  | '~' |
| 14 | pk_usage | pk_usage | pk_usage | varchar2(20) |  |  | '~' |
| 15 | pk_usegenote | pk_usegenote | pk_usegenote | varchar2(20) |  |  | '~' |
| 16 | quan_med | quan_med | quan_med | number(14, 2) | √ |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |