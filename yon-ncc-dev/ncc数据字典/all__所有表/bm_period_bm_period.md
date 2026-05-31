# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7357.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bm_period | pk_bm_period | pk_bm_period | char(20) | √ |
| 2 | caccperiod | caccperiod | caccperiod | char(2) |
| 3 | caccyear | caccyear | caccyear | char(4) |
| 4 | cenddate | cenddate | cenddate | char(10) |
| 5 | cstartdate | cstartdate | cstartdate | char(10) |
| 6 | period | period | period | char(2) |
| 7 | pk_periodscheme | pk_periodscheme | pk_periodscheme | varchar2(20) | √ |
| 8 | year | year | year | char(4) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |