# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11096.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkstandard | pk_checkstandard | pk_checkstandard | char(20) | √ |
| 2 | bnewestversion | bnewestversion | bnewestversion | char(1) |
| 3 | bsamplebycheckitem | bsamplebycheckitem | bsamplebycheckitem | char(1) |
| 4 | bsealflag | bsealflag | bsealflag | char(1) |
| 5 | lastverionpk | lastverionpk | lastverionpk | varchar2(20) |
| 6 | pk_checkmode | pk_checkmode | pk_checkmode | varchar2(20) |  |  | '~' |
| 7 | pk_chkstd_origin | pk_chkstd_origin | pk_chkstd_origin | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_qualitylv | pk_qualitylv | pk_qualitylv | varchar2(20) |  |  | '~' |
| 11 | pk_standardclass | pk_standardclass | pk_standardclass | varchar2(20) |  |  | '~' |
| 12 | vchkstandardcode | vchkstandardcode | vchkstandardcode | varchar2(50) |
| 13 | vchkstandardname | vchkstandardname | vchkstandardname | varchar2(300) |
| 14 | vchkstandardname2 | vchkstandardname2 | vchkstandardname2 | varchar2(300) |
| 15 | vchkstandardname3 | vchkstandardname3 | vchkstandardname3 | varchar2(300) |
| 16 | vchkstandardname4 | vchkstandardname4 | vchkstandardname4 | varchar2(300) |
| 17 | vchkstandardname5 | vchkstandardname5 | vchkstandardname5 | varchar2(300) |
| 18 | vchkstandardname6 | vchkstandardname6 | vchkstandardname6 | varchar2(300) |
| 19 | version | version | version | varchar2(20) |
| 20 | vmemo | vmemo | vmemo | varchar2(181) |
| 21 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 22 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 23 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 24 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 25 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 26 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 27 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 28 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 29 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 30 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |