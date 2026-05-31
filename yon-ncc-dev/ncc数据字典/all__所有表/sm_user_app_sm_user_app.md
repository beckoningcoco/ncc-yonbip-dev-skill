# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11656.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_user_app | pk_user_app | pk_user_app | char(20) | √ |
| 2 | cuserid | cuserid | cuserid | varchar2(20) |  |  | '~' |
| 3 | has_power | has_power | has_power | varchar2(50) |
| 4 | pk_appregister | pk_appregister | pk_appregister | varchar2(50) |
| 5 | position | position | position | varchar2(50) |
| 6 | creationtime | creationtime | creationtime | char(19) |
| 7 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 10 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |