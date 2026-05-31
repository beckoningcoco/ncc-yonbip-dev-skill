# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6676.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stepstatus | pk_stepstatus | pk_stepstatus | char(20) | √ |
| 2 | curren | curren | curren | varchar2(50) |
| 3 | otherdim | otherdim | otherdim | varchar2(1000) |
| 4 | pk_hbscheme | pk_hbscheme | pk_hbscheme | varchar2(50) |
| 5 | pk_mvtype | pk_mvtype | pk_mvtype | varchar2(50) |
| 6 | pk_scope | pk_scope | pk_scope | varchar2(50) |
| 7 | uniqkey | uniqkey | uniqkey | varchar2(100) |
| 8 | version | version | version | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |