# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8488.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distranslog | pk_distranslog | pk_distranslog | char(20) | √ |
| 2 | busitransflag | busitransflag | busitransflag | char(1) |
| 3 | busits | busits | busits | char(19) |
| 4 | lasttransts | lasttransts | lasttransts | char(19) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_resource | pk_resource | pk_resource | varchar2(20) |
| 8 | receiptercode | receiptercode | receiptercode | varchar2(20) |  |  | '~' |
| 9 | receivemessage | receivemessage | receivemessage | varchar2(200) |
| 10 | resourcestate | resourcestate | resourcestate | varchar2(50) |  |  | '~' |
| 11 | sendercode | sendercode | sendercode | varchar2(20) |  |  | '~' |
| 12 | taskid | taskid | taskid | varchar2(50) |
| 13 | transdata | transdata | transdata | varchar2(50) |  |  | '~' |
| 14 | transnum | transnum | transnum | number(38, 0) |  |  | 0 |
| 15 | transstate | transstate | transstate | varchar2(50) |  |  | '~' |
| 16 | transtime | transtime | transtime | char(19) |
| 17 | free1 | free1 | free1 | varchar2(100) |
| 18 | free2 | free2 | free2 | varchar2(100) |
| 19 | free3 | free3 | free3 | varchar2(100) |
| 20 | free4 | free4 | free4 | varchar2(100) |
| 21 | free5 | free5 | free5 | varchar2(100) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |