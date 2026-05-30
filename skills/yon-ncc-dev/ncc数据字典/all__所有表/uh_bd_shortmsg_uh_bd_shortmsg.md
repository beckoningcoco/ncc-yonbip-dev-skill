# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12372.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_shortmsg | pk_shortmsg | pk_shortmsg | char(20) | √ |
| 2 | flag_send | flag_send | flag_send | char(1) |
| 3 | mobileno | mobileno | mobileno | varchar2(11) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_pati | pk_pati | pk_pati | varchar2(50) |  |  | '~' |
| 7 | sendmethod | sendmethod | sendmethod | number(38, 0) |
| 8 | smsinfo | smsinfo | smsinfo | varchar2(50) |
| 9 | smstype | smstype | smstype | number(38, 0) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |