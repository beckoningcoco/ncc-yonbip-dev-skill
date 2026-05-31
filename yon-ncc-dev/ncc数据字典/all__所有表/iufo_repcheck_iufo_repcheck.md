# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9673.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repcheck | pk_repcheck | pk_repcheck | varchar2(20) | √ |
| 2 | aloneid | aloneid | aloneid | varchar2(32) | √ |
| 3 | checkperson | checkperson | checkperson | varchar2(20) |
| 4 | checkstate | checkstate | checkstate | number(38, 0) |
| 5 | checktime | checktime | checktime | varchar2(19) |
| 6 | repid | repid | repid | varchar2(20) |
| 7 | repname | repname | repname | varchar2(200) |
| 8 | taskcheckperson | taskcheckperson | taskcheckperson | varchar2(20) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |