# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8536.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcilecf | pk_reconcilecf | pk_reconcilecf | char(20) | √ |
| 2 | pk_cashflow | pk_cashflow | pk_cashflow | char(20) |
| 3 | pk_corp | pk_corp | pk_corp | char(4) |
| 4 | pk_glbook | pk_glbook | pk_glbook | char(20) |
| 5 | pk_glorg | pk_glorg | pk_glorg | char(20) |
| 6 | pk_glorgbook | pk_glorgbook | pk_glorgbook | char(20) |
| 7 | pk_modelsetdetail | pk_modelsetdetail | pk_modelsetdetail | char(20) |
| 8 | reserve1 | reserve1 | reserve1 | char(1) |
| 9 | reserve2 | reserve2 | reserve2 | varchar2(60) |
| 10 | reserve3 | reserve3 | reserve3 | varchar2(60) |
| 11 | reserve4 | reserve4 | reserve4 | varchar2(60) |
| 12 | reserve5 | reserve5 | reserve5 | varchar2(60) |
| 13 | scale | scale | scale | number(20, 4) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |