# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10080.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchertype | pk_vouchertype | pk_vouchertype | char(20) | √ |
| 2 | code | code | code | varchar2(200) |
| 3 | enablestatus | enablestatus | enablestatus | char(1) |
| 4 | isdefault | isdefault | isdefault | char(1) |
| 5 | ispreset | ispreset | ispreset | char(1) |
| 6 | name | name | name | varchar2(200) |
| 7 | name2 | name2 | name2 | varchar2(200) |
| 8 | name3 | name3 | name3 | varchar2(200) |
| 9 | name4 | name4 | name4 | varchar2(200) |
| 10 | name5 | name5 | name5 | varchar2(200) |
| 11 | name6 | name6 | name6 | varchar2(200) |
| 12 | pk_currency | pk_currency | pk_currency | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | remark | remark | remark | varchar2(200) |
| 16 | shortername | shortername | shortername | varchar2(100) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |