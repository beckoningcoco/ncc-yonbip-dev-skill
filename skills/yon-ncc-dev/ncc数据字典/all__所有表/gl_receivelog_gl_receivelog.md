# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8534.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receivelog | pk_receivelog | pk_receivelog | char(20) | √ |
| 2 | message | message | message | varchar2(200) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | pk_resource | pk_resource | pk_resource | varchar2(20) |
| 6 | receiptercode | receiptercode | receiptercode | varchar2(20) |  |  | '~' |
| 7 | sendercode | sendercode | sendercode | varchar2(20) |  |  | '~' |
| 8 | taskid | taskid | taskid | varchar2(50) |
| 9 | transdata | transdata | transdata | varchar2(50) |
| 10 | transnum | transnum | transnum | number(38, 0) |
| 11 | transstate | transstate | transstate | varchar2(50) |
| 12 | transtime | transtime | transtime | char(19) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |