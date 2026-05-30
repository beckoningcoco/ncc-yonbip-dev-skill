# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8255.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_archivedcommonset | pk_archivedcommonset | pk_archivedcommonset | char(20) | √ |
| 2 | accbookfrequency | accbookfrequency | accbookfrequency | varchar2(50) |
| 3 | balancebookfrequency | balancebookfrequency | balancebookfrequency | varchar2(50) |
| 4 | code | code | code | varchar2(50) |
| 5 | dailybookfrequency | dailybookfrequency | dailybookfrequency | varchar2(50) |
| 6 | dailybookorderby | dailybookorderby | dailybookorderby | number(38, 0) |
| 7 | detailbookfrequency | detailbookfrequency | detailbookfrequency | varchar2(50) |
| 8 | detailbookorderby | detailbookorderby | detailbookorderby | number(38, 0) |
| 9 | detailisdownpage | detailisdownpage | detailisdownpage | char(1) |
| 10 | detailisprepage | detailisprepage | detailisprepage | char(1) |
| 11 | issumass | issumass | issumass | char(1) |
| 12 | name | name | name | varchar2(300) |
| 13 | pk_accperiod | pk_accperiod | pk_accperiod | varchar2(20) |  |  | '~' |
| 14 | pk_balancebooktemplate | pk_balancebooktemplate | pk_balancebooktemplate | varchar2(50) |
| 15 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 16 | pk_dailybooktemplate | pk_dailybooktemplate | pk_dailybooktemplate | varchar2(50) |  |  | '~' |
| 17 | pk_detailbooktemplate | pk_detailbooktemplate | pk_detailbooktemplate | varchar2(50) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) | √ |  | '~' |
| 21 | pk_threeaccbooktemplate | pk_threeaccbooktemplate | pk_threeaccbooktemplate | varchar2(50) |  |  | '~' |
| 22 | pk_vccomtemplate | pk_vccomtemplate | pk_vccomtemplate | varchar2(50) |  |  | '~' |
| 23 | pk_vcforgquantemplate | pk_vcforgquantemplate | pk_vcforgquantemplate | varchar2(50) |  |  | '~' |
| 24 | pk_vcforgtemplate | pk_vcforgtemplate | pk_vcforgtemplate | varchar2(50) |  |  | '~' |
| 25 | pk_vcquantemplate | pk_vcquantemplate | pk_vcquantemplate | varchar2(50) |  |  | '~' |
| 26 | subjlevel | subjlevel | subjlevel | varchar2(50) |
| 27 | threeaccbookfrequency | threeaccbookfrequency | threeaccbookfrequency | varchar2(50) |
| 28 | ufoe_frequency | ufoe_frequency | ufoe_frequency | varchar2(50) |
| 29 | creationtime | creationtime | creationtime | char(19) |
| 30 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 33 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |