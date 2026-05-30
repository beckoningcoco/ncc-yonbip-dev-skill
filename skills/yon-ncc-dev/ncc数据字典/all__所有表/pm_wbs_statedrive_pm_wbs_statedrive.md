# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10737.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_status_drive | pk_status_drive | pk_status_drive | char(20) | √ |
| 2 | bill_type | bill_type | bill_type | varchar2(50) |
| 3 | memo | memo | memo | varchar2(50) |
| 4 | pk_drive_bill | pk_drive_bill | pk_drive_bill | varchar2(50) |  |  | '~' |
| 5 | pk_drive_status | pk_drive_status | pk_drive_status | number(38, 0) |
| 6 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 7 | pk_wbs | pk_wbs | pk_wbs | char(36) | √ |
| 8 | transi_type | transi_type | transi_type | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |