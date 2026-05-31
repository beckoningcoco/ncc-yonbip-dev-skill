# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7962.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_extendconfig | pk_extendconfig | pk_extendconfig | varchar2(50) | √ |
| 2 | busitype | busitype | busitype | number(38, 0) | √ |  | 0 |
| 3 | busi_sys | busi_sys | busi_sys | varchar2(50) | √ |
| 4 | busi_tabcode | busi_tabcode | busi_tabcode | varchar2(50) | √ |
| 5 | busi_tabname | busi_tabname | busi_tabname | varchar2(300) | √ |
| 6 | busi_tabname2 | busi_tabname2 | busi_tabname2 | varchar2(300) |
| 7 | busi_tabname3 | busi_tabname3 | busi_tabname3 | varchar2(300) |
| 8 | busi_tabname4 | busi_tabname4 | busi_tabname4 | varchar2(300) |
| 9 | busi_tabname5 | busi_tabname5 | busi_tabname5 | varchar2(300) |
| 10 | busi_tabname6 | busi_tabname6 | busi_tabname6 | varchar2(300) |
| 11 | cardclass | cardclass | cardclass | varchar2(200) |
| 12 | cardlistenerclass | cardlistenerclass | cardlistenerclass | varchar2(110) |
| 13 | listclass | listclass | listclass | varchar2(200) |
| 14 | listlistenerclass | listlistenerclass | listlistenerclass | varchar2(110) |
| 15 | metadataclass | metadataclass | metadataclass | varchar2(100) |
| 16 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(50) | √ |  | '~' |
| 20 | queryclass | queryclass | queryclass | varchar2(200) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |