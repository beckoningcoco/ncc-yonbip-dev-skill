# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7236.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srv_opt | pk_srv_opt | pk_srv_opt | char(20) | √ |
| 2 | dt_anae | dt_anae | dt_anae | varchar2(50) |
| 3 | dt_cutclass | dt_cutclass | dt_cutclass | varchar2(50) |
| 4 | dt_opbody | dt_opbody | dt_opbody | varchar2(50) |
| 5 | dt_oppos | dt_oppos | dt_oppos | varchar2(50) |
| 6 | dt_pd | dt_pd | dt_pd | varchar2(50) |
| 7 | flag_drainage | flag_drainage | flag_drainage | char(1) |
| 8 | note | note | note | varchar2(256) |
| 9 | opclass | opclass | opclass | varchar2(20) | √ |
| 10 | opcode | opcode | opcode | varchar2(30) | √ |
| 11 | pdname | pdname | pdname | varchar2(50) |
| 12 | pk_anae | pk_anae | pk_anae | varchar2(20) |  |  | '~' |
| 13 | pk_cutclass | pk_cutclass | pk_cutclass | varchar2(20) |  |  | '~' |
| 14 | pk_diag_op | pk_diag_op | pk_diag_op | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_opbody | pk_opbody | pk_opbody | varchar2(20) |  |  | '~' |
| 17 | pk_oppos | pk_oppos | pk_oppos | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_pd | pk_pd | pk_pd | varchar2(20) |  |  | '~' |
| 20 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |