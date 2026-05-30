# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10897.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billbusiness | pk_billbusiness | pk_billbusiness | char(20) | √ |
| 2 | backmsgflag | backmsgflag | backmsgflag | char(1) |
| 3 | forwardmsgflag | forwardmsgflag | forwardmsgflag | char(1) |
| 4 | jumpflag | jumpflag | jumpflag | char(1) |
| 5 | makebillflag | makebillflag | makebillflag | char(1) | √ |
| 6 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 7 | pk_businesstype | pk_businesstype | pk_businesstype | char(20) | √ |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | referbillflag | referbillflag | referbillflag | char(1) | √ |
| 10 | transtype | transtype | transtype | varchar2(20) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |