# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12517.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordoth | pk_ordoth | pk_ordoth | char(20) | √ |
| 2 | date_app | date_app | date_app | char(19) |
| 3 | date_confirm | date_confirm | date_confirm | char(19) |
| 4 | desc_diag | desc_diag | desc_diag | varchar2(256) |
| 5 | eu_status | eu_status | eu_status | number(38, 0) |
| 6 | flag_urgent | flag_urgent | flag_urgent | char(1) |
| 7 | note | note | note | varchar2(4000) |
| 8 | pk_diag | pk_diag | pk_diag | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_msp | pk_msp | pk_msp | varchar2(20) |  |  | '~' |
| 11 | pk_ord | pk_ord | pk_ord | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | purpose | purpose | purpose | varchar2(256) |
| 14 | ticketno | ticketno | ticketno | varchar2(50) |
| 15 | time_begin | time_begin | time_begin | char(8) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |