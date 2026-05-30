# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10902.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billrelation | pk_billrelation | pk_billrelation | char(20) | √ |
| 2 | canpullbill | canpullbill | canpullbill | char(1) |  |  | 'N' |
| 3 | canpushbill | canpushbill | canpushbill | char(1) |  |  | 'Y' |
| 4 | destbilltype | destbilltype | destbilltype | varchar2(100) |
| 5 | dest_billcorp | dest_billcorp | dest_billcorp | varchar2(100) |
| 6 | dest_billnofield | dest_billnofield | dest_billnofield | varchar2(100) |
| 7 | dest_billtypefield | dest_billtypefield | dest_billtypefield | varchar2(100) |
| 8 | dest_maintablename | dest_maintablename | dest_maintablename | varchar2(100) |
| 9 | dest_maintableprimarykeyfield | dest_maintableprimarykeyfield | dest_maintableprimarykeyfield | varchar2(100) |
| 10 | dest_submetaid | dest_submetaid | dest_submetaid | varchar2(100) |
| 11 | dest_subpath | dest_subpath | dest_subpath | varchar2(100) |
| 12 | dest_subtableforeignkeyfiled | dest_subtableforeignkeyfiled | dest_subtableforeignkeyfiled | varchar2(100) |
| 13 | dest_subtablename | dest_subtablename | dest_subtablename | varchar2(100) |
| 14 | dest_transtypefield | dest_transtypefield | dest_transtypefield | varchar2(100) |
| 15 | dest_transtypepkfield | dest_transtypepkfield | dest_transtypepkfield | varchar2(100) |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |
| 17 | srcbilltype | srcbilltype | srcbilltype | varchar2(100) |
| 18 | src_businum | src_businum | src_businum | varchar2(100) |
| 19 | src_busistatus | src_busistatus | src_busistatus | varchar2(100) |
| 20 | src_mainpkfield | src_mainpkfield | src_mainpkfield | varchar2(100) |
| 21 | src_maintablename | src_maintablename | src_maintablename | varchar2(100) |
| 22 | src_numcontrol | src_numcontrol | src_numcontrol | char(1) |
| 23 | src_sourceidfield | src_sourceidfield | src_sourceidfield | varchar2(100) |
| 24 | src_sourcetypefield | src_sourcetypefield | src_sourcetypefield | varchar2(100) |
| 25 | src_statuscontrol | src_statuscontrol | src_statuscontrol | char(1) |
| 26 | src_subbusinum | src_subbusinum | src_subbusinum | varchar2(100) |
| 27 | src_submetaid | src_submetaid | src_submetaid | varchar2(100) |
| 28 | src_subnumcontrol | src_subnumcontrol | src_subnumcontrol | char(1) |
| 29 | src_subpath | src_subpath | src_subpath | varchar2(100) |
| 30 | src_subpkfield | src_subpkfield | src_subpkfield | varchar2(100) |
| 31 | src_subtablename | src_subtablename | src_subtablename | varchar2(100) |
| 32 | src_subusednum | src_subusednum | src_subusednum | varchar2(100) |
| 33 | src_usednum | src_usednum | src_usednum | varchar2(100) |
| 34 | def1 | def1 | def1 | varchar2(100) |
| 35 | def2 | def2 | def2 | varchar2(100) |
| 36 | def3 | def3 | def3 | varchar2(100) |
| 37 | def4 | def4 | def4 | varchar2(100) |
| 38 | def5 | def5 | def5 | varchar2(100) |
| 39 | def6 | def6 | def6 | varchar2(100) |
| 40 | def7 | def7 | def7 | varchar2(100) |
| 41 | def8 | def8 | def8 | varchar2(100) |
| 42 | def9 | def9 | def9 | varchar2(100) |
| 43 | def10 | def10 | def10 | varchar2(300) |
| 44 | def11 | def11 | def11 | varchar2(300) |
| 45 | def12 | def12 | def12 | varchar2(300) |
| 46 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 47 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |