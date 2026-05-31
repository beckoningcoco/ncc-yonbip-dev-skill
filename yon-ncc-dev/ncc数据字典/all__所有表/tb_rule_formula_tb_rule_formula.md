# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12089.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | att | att | att | number(38, 0) |
| 3 | bigclass | bigclass | bigclass | varchar2(20) | √ |
| 4 | createdby | createdby | createdby | varchar2(20) |
| 5 | createddate | createddate | createddate | char(19) |
| 6 | description | description | description | varchar2(800) |
| 7 | exefullcontent | exefullcontent | exefullcontent | blob |
| 8 | fmlcontent | fmlcontent | fmlcontent | blob |
| 9 | fmloperator | fmloperator | fmloperator | varchar2(30) |
| 10 | fmltype | fmltype | fmltype | number(38, 0) |
| 11 | fullcontent | fullcontent | fullcontent | blob |
| 12 | fullcontentdest | fullcontentdest | fullcontentdest | varchar2(1000) |
| 13 | fulldest | fulldest | fulldest | varchar2(2000) |
| 14 | ifshared | ifshared | ifshared | number(38, 0) |
| 15 | impbypkdimdef | impbypkdimdef | impbypkdimdef | varchar2(20) |
| 16 | impbypkdimmember | impbypkdimmember | impbypkdimmember | varchar2(20) |
| 17 | isaccctrollflag | isaccctrollflag | isaccctrollflag | varchar2(30) |
| 18 | ischart | ischart | ischart | char(1) |
| 19 | ispldeal | ispldeal | ispldeal | char(1) |
| 20 | mcol | mcol | mcol | varchar2(20) |
| 21 | measure | measure | measure | blob |
| 22 | modifiedby | modifiedby | modifiedby | varchar2(20) |
| 23 | modifieddate | modifieddate | modifieddate | char(19) |
| 24 | mrow | mrow | mrow | varchar2(20) |
| 25 | objname | objname | objname | varchar2(100) |
| 26 | pk_cube | pk_cube | pk_cube | varchar2(20) |
| 27 | pk_dest | pk_dest | pk_dest | varchar2(20) |
| 28 | pk_parent | pk_parent | pk_parent | varchar2(20) |
| 29 | pk_ruleclass | pk_ruleclass | pk_ruleclass | varchar2(20) | √ |
| 30 | pk_sheet | pk_sheet | pk_sheet | varchar2(20) |  |  | '~' |
| 31 | priority | priority | priority | number(38, 0) |
| 32 | specialusage | specialusage | specialusage | char(1) |
| 33 | def1 | def1 | def1 | varchar2(100) |
| 34 | def2 | def2 | def2 | varchar2(100) |
| 35 | def3 | def3 | def3 | varchar2(100) |
| 36 | def4 | def4 | def4 | varchar2(100) |
| 37 | def5 | def5 | def5 | varchar2(100) |
| 38 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 39 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |