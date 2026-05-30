# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7826.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | pk_log | pk_log | char(20) | √ |
| 2 | errmsg | errmsg | errmsg | varchar2(400) |
| 3 | headpackageid | headpackageid | headpackageid | varchar2(50) |
| 4 | paypackageid | paypackageid | paypackageid | varchar2(30) |
| 5 | persontotal | persontotal | persontotal | number(38, 0) |
| 6 | retcode | retcode | retcode | varchar2(40) |
| 7 | senddate | senddate | senddate | char(19) |
| 8 | totalsum | totalsum | totalsum | number(28, 8) |
| 9 | tranflag | tranflag | tranflag | number(38, 0) |
| 10 | tranmsg | tranmsg | tranmsg | varchar2(400) |
| 11 | yurref | yurref | yurref | varchar2(30) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |