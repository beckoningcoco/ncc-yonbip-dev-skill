# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7699.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | errornum | errornum | errornum | number(38, 0) |
| 2 | iscal | iscal | iscal | char(1) |
| 3 | pk_month | pk_month | pk_month | varchar2(20) |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | pk_spcheckerror | pk_spcheckerror | pk_spcheckerror | char(20) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |