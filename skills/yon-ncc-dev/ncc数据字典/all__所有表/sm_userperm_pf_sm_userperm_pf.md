# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11654.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_urperm_pf | pk_urperm_pf | pk_urperm_pf | varchar2(50) | √ |
| 2 | cuserid | cuserid | cuserid | varchar2(20) |  |  | '~' |
| 3 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 4 | dmakedate | dmakedate | dmakedate | char(19) |
| 5 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | vapproveid | vapproveid | vapproveid | varchar2(20) |  |  | '~' |
| 9 | vapprovenote | vapprovenote | vapprovenote | varchar2(768) |
| 10 | vbillno | vbillno | vbillno | varchar2(50) |
| 11 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 12 | voperatorid | voperatorid | voperatorid | varchar2(20) |  |  | '~' |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |