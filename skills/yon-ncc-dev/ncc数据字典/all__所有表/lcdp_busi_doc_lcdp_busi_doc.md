# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9747.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_doc | pk_doc | pk_doc | char(20) | √ |
| 2 | busilist | busilist | busilist | varchar2(1000) |
| 3 | code | code | code | varchar2(50) |
| 4 | doc_tablename | doc_tablename | doc_tablename | varchar2(50) |
| 5 | fulltablename | fulltablename | fulltablename | varchar2(50) |
| 6 | name | name | name | varchar2(200) |
| 7 | name2 | name2 | name2 | varchar2(200) |
| 8 | name3 | name3 | name3 | varchar2(200) |
| 9 | name4 | name4 | name4 | varchar2(200) |
| 10 | name5 | name5 | name5 | varchar2(200) |
| 11 | name6 | name6 | name6 | varchar2(200) |
| 12 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_metadata | pk_metadata | pk_metadata | varchar2(50) |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_parent | pk_parent | pk_parent | varchar2(20) |  |  | '~' |
| 17 | pubapp | pubapp | pubapp | char(1) |
| 18 | pubmeta | pubmeta | pubmeta | char(1) |
| 19 | pubstatus | pubstatus | pubstatus | varchar2(50) |
| 20 | version | version | version | number(38, 0) |
| 21 | creationtime | creationtime | creationtime | char(19) |
| 22 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 25 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |