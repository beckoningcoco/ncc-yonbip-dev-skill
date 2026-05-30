# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11625.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_roleperm_pf | pk_roleperm_pf | pk_roleperm_pf | char(20) | √ |
| 2 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 3 | dmakedate | dmakedate | dmakedate | char(19) |
| 4 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_role | pk_role | pk_role | varchar2(20) | √ |  | '~' |
| 8 | vapproveid | vapproveid | vapproveid | varchar2(20) |  |  | '~' |
| 9 | vapprovenote | vapprovenote | vapprovenote | varchar2(768) |
| 10 | vbillno | vbillno | vbillno | varchar2(50) |
| 11 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |  |  | -1 |
| 12 | voperatorid | voperatorid | voperatorid | varchar2(20) |  |  | '~' |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |