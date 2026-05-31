# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6967.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_linkman | pk_linkman | pk_linkman | char(20) | √ |
| 2 | address | address | address | varchar2(300) |
| 3 | anniversary | anniversary | anniversary | char(19) |
| 4 | birthday | birthday | birthday | char(19) |
| 5 | cell | cell | cell | varchar2(200) |
| 6 | code | code | code | varchar2(40) |
| 7 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 8 | email | email | email | varchar2(200) |
| 9 | fax | fax | fax | varchar2(200) |
| 10 | isdefault | isdefault | isdefault | char(1) |
| 11 | memo | memo | memo | varchar2(300) |
| 12 | name | name | name | varchar2(300) |
| 13 | name2 | name2 | name2 | varchar2(200) |
| 14 | name3 | name3 | name3 | varchar2(200) |
| 15 | phone | phone | phone | varchar2(200) |
| 16 | postcode | postcode | postcode | varchar2(200) |
| 17 | sex | sex | sex | number(38, 0) |
| 18 | vjob | vjob | vjob | varchar2(300) |
| 19 | webaddress | webaddress | webaddress | varchar2(200) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |