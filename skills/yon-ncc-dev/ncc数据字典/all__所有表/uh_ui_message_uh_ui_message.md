# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12813.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msg | pk_msg | pk_msg | char(20) | √ |
| 2 | extiredtime | extiredtime | extiredtime | char(19) |
| 3 | msg_content | msg_content | msg_content | varchar2(1000) |
| 4 | msg_gnid | msg_gnid | msg_gnid | varchar2(50) |
| 5 | msg_gnmc | msg_gnmc | msg_gnmc | varchar2(50) |
| 6 | msg_param | msg_param | msg_param | varchar2(500) |
| 7 | msg_type | msg_type | msg_type | varchar2(10) |
| 8 | msg_url | msg_url | msg_url | varchar2(200) |
| 9 | receiver_dept | receiver_dept | receiver_dept | varchar2(20) |  |  | '~' |
| 10 | receiver_role | receiver_role | receiver_role | varchar2(20) |  |  | '~' |
| 11 | sender | sender | sender | varchar2(20) |  |  | '~' |
| 12 | sender_dept | sender_dept | sender_dept | varchar2(20) |  |  | '~' |
| 13 | sendtime | sendtime | sendtime | char(19) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |