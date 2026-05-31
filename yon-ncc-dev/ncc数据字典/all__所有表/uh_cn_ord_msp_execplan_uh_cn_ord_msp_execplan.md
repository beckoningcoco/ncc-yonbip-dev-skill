# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12518.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordothplan | pk_ordothplan | pk_ordothplan | char(20) | √ |
| 2 | date_canc | date_canc | date_canc | char(19) |
| 3 | date_confirm | date_confirm | date_confirm | char(19) |
| 4 | date_exec | date_exec | date_exec | char(19) |
| 5 | desc_diag | desc_diag | desc_diag | varchar2(50) |
| 6 | flag_canc | flag_canc | flag_canc | char(1) |
| 7 | flag_exec | flag_exec | flag_exec | char(1) |
| 8 | name_psn_canc | name_psn_canc | name_psn_canc | varchar2(50) |
| 9 | note | note | note | varchar2(256) |
| 10 | pk_diag | pk_diag | pk_diag | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_ord | pk_ord | pk_ord | varchar2(20) |  |  | '~' |
| 13 | pk_ordoth | pk_ordoth | pk_ordoth | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_psn_canc | pk_psn_canc | pk_psn_canc | varchar2(20) |  |  | '~' |
| 16 | sortno | sortno | sortno | number(38, 0) |
| 17 | ticketno | ticketno | ticketno | number(38, 0) |
| 18 | time_begin | time_begin | time_begin | char(8) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |