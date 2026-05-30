# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12335.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjresult | pk_adjresult | pk_adjresult | char(20) | √ |
| 2 | alone_id | alone_id | alone_id | varchar2(32) |
| 3 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 4 | investee | investee | investee | varchar2(20) |  |  | '~' |
| 5 | investor | investor | investor | varchar2(20) |  |  | '~' |
| 6 | ishasvouch | ishasvouch | ishasvouch | char(1) |
| 7 | pk_adjascheme | pk_adjascheme | pk_adjascheme | varchar2(20) |  |  | '~' |
| 8 | pk_hbscheme | pk_hbscheme | pk_hbscheme | varchar2(20) |  |  | '~' |
| 9 | pk_keygroup | pk_keygroup | pk_keygroup | varchar2(20) |  |  | '~' |
| 10 | pk_template | pk_template | pk_template | varchar2(20) |  |  | '~' |
| 11 | pk_vouch | pk_vouch | pk_vouch | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |