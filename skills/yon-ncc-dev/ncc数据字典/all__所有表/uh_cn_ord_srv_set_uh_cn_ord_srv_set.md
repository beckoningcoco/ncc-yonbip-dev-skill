# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12529.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordsrvset | pk_ordsrvset | pk_ordsrvset | char(20) | √ |
| 2 | dt_role_srvset | dt_role_srvset | dt_role_srvset | varchar2(50) |
| 3 | note | note | note | varchar2(256) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_ord | pk_ord | pk_ord | varchar2(20) |  |  | '~' |
| 6 | pk_ordsrv | pk_ordsrv | pk_ordsrv | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_role_srvset | pk_role_srvset | pk_role_srvset | varchar2(20) |  |  | '~' |
| 9 | pk_srvset | pk_srvset | pk_srvset | varchar2(20) |  |  | '~' |
| 10 | pk_srv_child | pk_srv_child | pk_srv_child | varchar2(20) |  |  | '~' |
| 11 | quan_med | quan_med | quan_med | number(14, 2) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |