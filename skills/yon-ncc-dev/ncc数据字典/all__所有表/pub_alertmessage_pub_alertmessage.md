# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10855.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alertmessage | pk_alertmessage | pk_alertmessage | char(20) | √ |
| 2 | accountpk | accountpk | accountpk | varchar2(30) |
| 3 | alertname | alertname | alertname | varchar2(1024) |
| 4 | belong_system | belong_system | belong_system | varchar2(20) |
| 5 | createdate | createdate | createdate | char(19) |
| 6 | createtime | createtime | createtime | char(8) |
| 7 | curlang | curlang | curlang | varchar2(20) |
| 8 | filecontent | filecontent | filecontent | blob |
| 9 | filename | filename | filename | varchar2(80) |
| 10 | groupid | groupid | groupid | varchar2(20) |  |  | '~' |
| 11 | implementtype | implementtype | implementtype | number(38, 0) |
| 12 | isnew | isnew | isnew | char(1) |
| 13 | istiming | istiming | istiming | char(1) |
| 14 | message | message | message | varchar2(256) |
| 15 | pk_alertregistry | pk_alertregistry | pk_alertregistry | char(20) |  |  | '~' |
| 16 | pk_message | pk_message | pk_message | char(20) |
| 17 | priority | priority | priority | number(38, 0) |
| 18 | receiverid | receiverid | receiverid | varchar2(30) |
| 19 | receivername | receivername | receivername | varchar2(50) |
| 20 | senddate | senddate | senddate | char(19) |
| 21 | sendmethod | sendmethod | sendmethod | number(38, 0) |
| 22 | sendtime | sendtime | sendtime | char(8) |
| 23 | sentdate | sentdate | sentdate | char(19) |
| 24 | senttime | senttime | senttime | char(8) |
| 25 | triggermethod | triggermethod | triggermethod | number(38, 0) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |