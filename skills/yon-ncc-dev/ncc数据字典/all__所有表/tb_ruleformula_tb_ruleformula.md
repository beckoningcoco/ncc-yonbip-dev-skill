# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12087.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | att | att | att | number(38, 0) |
| 3 | bigclass | bigclass | bigclass | varchar2(20) | √ |
| 4 | createdby | createdby | createdby | varchar2(20) |
| 5 | createddate | createddate | createddate | char(19) |
| 6 | description | description | description | varchar2(800) |
| 7 | exefullcontent | exefullcontent | exefullcontent | varchar2(2000) |
| 8 | fmlcontent | fmlcontent | fmlcontent | varchar2(2000) |
| 9 | fmloperator | fmloperator | fmloperator | varchar2(30) |
| 10 | fmltype | fmltype | fmltype | number(38, 0) |
| 11 | fullcontent | fullcontent | fullcontent | varchar2(2000) |
| 12 | fullcontentdest | fullcontentdest | fullcontentdest | varchar2(1000) |
| 13 | fulldest | fulldest | fulldest | varchar2(2000) |
| 14 | ifshared | ifshared | ifshared | number(38, 0) |
| 15 | impbypkdimdef | impbypkdimdef | impbypkdimdef | varchar2(20) |
| 16 | impbypkdimmember | impbypkdimmember | impbypkdimmember | varchar2(20) |
| 17 | isaccctrollflag | isaccctrollflag | isaccctrollflag | char(1) |
| 18 | ischart | ischart | ischart | char(1) |
| 19 | ispldeal | ispldeal | ispldeal | char(1) |
| 20 | modifiedby | modifiedby | modifiedby | varchar2(20) |
| 21 | modifieddate | modifieddate | modifieddate | char(19) |
| 22 | objname | objname | objname | varchar2(100) |
| 23 | pk_cube | pk_cube | pk_cube | varchar2(20) |
| 24 | pk_dest | pk_dest | pk_dest | varchar2(20) |
| 25 | pk_parent | pk_parent | pk_parent | varchar2(20) |
| 26 | pk_ruleclass | pk_ruleclass | pk_ruleclass | varchar2(20) | √ |
| 27 | priority | priority | priority | number(38, 0) |
| 28 | specialusage | specialusage | specialusage | char(1) |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |