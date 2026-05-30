# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12527.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordsrvpd | pk_ordsrvpd | pk_ordsrvpd | char(20) | √ |
| 2 | dt_dispmode | dt_dispmode | dt_dispmode | varchar2(50) |
| 3 | factor_cb | factor_cb | factor_cb | varchar2(50) |
| 4 | factor_mb | factor_mb | factor_mb | varchar2(50) |
| 5 | pk_dispmode | pk_dispmode | pk_dispmode | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_measdoc_base | pk_measdoc_base | pk_measdoc_base | varchar2(20) |  |  | '~' |
| 8 | pk_measdoc_cur | pk_measdoc_cur | pk_measdoc_cur | varchar2(20) |  |  | '~' |
| 9 | pk_ord | pk_ord | pk_ord | varchar2(20) |  |  | '~' |
| 10 | pk_ordsrv | pk_ordsrv | pk_ordsrv | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_pd | pk_pd | pk_pd | varchar2(20) |  |  | '~' |
| 13 | price_cur | price_cur | price_cur | number(14, 8) |
| 14 | quan_base | quan_base | quan_base | number(14, 2) |
| 15 | quan_bed_base | quan_bed_base | quan_bed_base | number(14, 2) |
| 16 | quan_cur | quan_cur | quan_cur | number(14, 2) |
| 17 | quan_exec_base | quan_exec_base | quan_exec_base | number(14, 2) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |