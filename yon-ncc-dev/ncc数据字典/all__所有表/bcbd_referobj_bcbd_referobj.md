# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6655.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_referobj | pk_referobj | pk_referobj | char(20) | √ |
| 2 | ispredata | ispredata | ispredata | char(1) |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | name | name | name | varchar2(300) |
| 5 | name2 | name2 | name2 | varchar2(300) |
| 6 | name3 | name3 | name3 | varchar2(300) |
| 7 | name4 | name4 | name4 | varchar2(300) |
| 8 | name5 | name5 | name5 | varchar2(300) |
| 9 | name6 | name6 | name6 | varchar2(300) |
| 10 | pk_bartype | pk_bartype | pk_bartype | varchar2(20) |  |  | '~' |
| 11 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 12 | pk_referobjmd | pk_referobjmd | pk_referobjmd | varchar2(36) |  |  | '~' |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |