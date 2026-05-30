# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7352.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_loctrule_b | pk_loctrule_b | pk_loctrule_b | char(20) | √ |
| 2 | downlimit | downlimit | downlimit | number(31, 8) |
| 3 | effectiveyear | effectiveyear | effectiveyear | char(4) |
| 4 | enableorgbase | enableorgbase | enableorgbase | char(1) |
| 5 | endperiod | endperiod | endperiod | varchar2(20) |
| 6 | entdecimal | entdecimal | entdecimal | number(31, 8) |
| 7 | entpdownlimit | entpdownlimit | entpdownlimit | number(31, 8) |
| 8 | entpfixvalue | entpfixvalue | entpfixvalue | number(31, 8) |
| 9 | entpportion | entpportion | entpportion | number(31, 8) |
| 10 | entpremit | entpremit | entpremit | number(31, 8) |
| 11 | entpuplimit | entpuplimit | entpuplimit | number(31, 8) |
| 12 | entroundmethond | entroundmethond | entroundmethond | number(38, 0) |
| 13 | personaldecimal | personaldecimal | personaldecimal | number(31, 8) |
| 14 | personalround | personalround | personalround | number(38, 0) |
| 15 | personfixvalue | personfixvalue | personfixvalue | number(31, 8) |
| 16 | personportion | personportion | personportion | number(31, 8) |
| 17 | pk_bm_class | pk_bm_class | pk_bm_class | varchar2(20) | √ |
| 18 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 19 | pk_loctrule | pk_loctrule | pk_loctrule | varchar2(20) |
| 20 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 21 | roundmode | roundmode | roundmode | number(38, 0) |
| 22 | startperiod | startperiod | startperiod | varchar2(20) |
| 23 | uplimit | uplimit | uplimit | number(31, 8) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |