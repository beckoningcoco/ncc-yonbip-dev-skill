# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9699.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskapprove | pk_taskapprove | pk_taskapprove | char(20) | √ |
| 2 | alone_id | alone_id | alone_id | varchar2(32) |
| 3 | approvemode | approvemode | approvemode | number(38, 0) |  |  | 0 |
| 4 | dapprovedate | dapprovedate | dapprovedate | char(19) |
| 5 | flowtype | flowtype | flowtype | number(38, 0) |  |  | 0 |
| 6 | pk_approveflowpk | pk_approveflowpk | pk_approveflowpk | varchar2(50) |
| 7 | pk_keygroup | pk_keygroup | pk_keygroup | varchar2(50) |
| 8 | pk_org | pk_org | pk_org | varchar2(50) |
| 9 | pk_report | pk_report | pk_report | blob |
| 10 | pk_rms | pk_rms | pk_rms | varchar2(50) |
| 11 | pk_task | pk_task | pk_task | varchar2(50) |
| 12 | vapproveid | vapproveid | vapproveid | varchar2(20) |  |  | '~' |
| 13 | vapprovenote | vapprovenote | vapprovenote | varchar2(50) |
| 14 | vbillno | vbillno | vbillno | varchar2(1024) |
| 15 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 16 | voperatorid | voperatorid | voperatorid | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |