# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6756.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balatype | pk_balatype | pk_balatype | char(20) | √ |
| 2 | cash | cash | cash | char(1) |
| 3 | code | code | code | varchar2(40) |
| 4 | consignpay | consignpay | consignpay | char(1) |  |  | 'N' |
| 5 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 6 | defaultflag | defaultflag | defaultflag | char(1) |
| 7 | directincome | directincome | directincome | char(1) |  |  | 'N' |
| 8 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 2 |
| 9 | ename | ename | ename | varchar2(200) |
| 10 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 11 | isretail | isretail | isretail | char(1) |  |  | 'N' |
| 12 | istickcred | istickcred | istickcred | char(1) |  |  | 'N' |
| 13 | name | name | name | varchar2(300) |
| 14 | name2 | name2 | name2 | varchar2(300) |
| 15 | name3 | name3 | name3 | varchar2(300) |
| 16 | name4 | name4 | name4 | varchar2(300) |
| 17 | name5 | name5 | name5 | varchar2(300) |
| 18 | name6 | name6 | name6 | varchar2(300) |
| 19 | netbankflag | netbankflag | netbankflag | char(1) |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |