# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9497.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkresult | pk_checkresult | pk_checkresult | varchar2(20) | √ |
| 2 | aloneid | aloneid | aloneid | varchar2(32) | √ |
| 3 | checkstate | checkstate | checkstate | number(38, 0) |
| 4 | checktime | checktime | checktime | varchar2(19) |
| 5 | repcheckperson | repcheckperson | repcheckperson | varchar2(20) |
| 6 | repid | repid | repid | varchar2(20) |
| 7 | repname | repname | repname | varchar2(200) |
| 8 | schemaname | schemaname | schemaname | varchar2(200) |
| 9 | schemepk | schemepk | schemepk | varchar2(20) |
| 10 | taskcheckperson | taskcheckperson | taskcheckperson | varchar2(20) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |