# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11053.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_writebacksetting | pk_writebacksetting | pk_writebacksetting | char(20) | √ |
| 2 | condition | condition | condition | blob |
| 3 | deleteaction | deleteaction | deleteaction | varchar2(50) |
| 4 | industrytype | industrytype | industrytype | varchar2(20) |  |  | '~' |
| 5 | localtype | localtype | localtype | varchar2(20) |  |  | '~' |
| 6 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |
| 7 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |
| 8 | pk_targetbilltype | pk_targetbilltype | pk_targetbilltype | varchar2(20) |
| 9 | writeaction | writeaction | writeaction | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |