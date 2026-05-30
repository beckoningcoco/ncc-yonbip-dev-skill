# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6798.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cbsnode | pk_cbsnode | pk_cbsnode | char(20) | √ |
| 2 | assetclass | assetclass | assetclass | varchar2(50) |  |  | '~' |
| 3 | code | code | code | varchar2(50) |
| 4 | innercode | innercode | innercode | varchar2(50) |
| 5 | isalloc | isalloc | isalloc | char(1) |
| 6 | isleafnode | isleafnode | isleafnode | char(1) |
| 7 | memo | memo | memo | varchar2(200) |
| 8 | name | name | name | varchar2(300) |
| 9 | name2 | name2 | name2 | varchar2(300) |
| 10 | name3 | name3 | name3 | varchar2(300) |
| 11 | name4 | name4 | name4 | varchar2(300) |
| 12 | name5 | name5 | name5 | varchar2(300) |
| 13 | name6 | name6 | name6 | varchar2(300) |
| 14 | pk_father | pk_father | pk_father | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 18 | pk_projecttype | pk_projecttype | pk_projecttype | varchar2(20) |  |  | '~' |
| 19 | free1 | free1 | free1 | varchar2(101) |
| 20 | free2 | free2 | free2 | varchar2(101) |
| 21 | free3 | free3 | free3 | varchar2(101) |
| 22 | free4 | free4 | free4 | varchar2(101) |
| 23 | free5 | free5 | free5 | varchar2(101) |
| 24 | free6 | free6 | free6 | varchar2(101) |
| 25 | free7 | free7 | free7 | varchar2(101) |
| 26 | free8 | free8 | free8 | varchar2(101) |
| 27 | free9 | free9 | free9 | varchar2(101) |
| 28 | free10 | free10 | free10 | varchar2(101) |
| 29 | creationtime | creationtime | creationtime | char(19) |
| 30 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 33 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |