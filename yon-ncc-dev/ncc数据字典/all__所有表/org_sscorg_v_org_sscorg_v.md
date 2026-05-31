# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10308.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | pk_vid | pk_vid | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 1 |
| 5 | innercode | innercode | innercode | varchar2(200) |
| 6 | islastversion | islastversion | islastversion | char(1) |
| 7 | name | name | name | varchar2(300) |
| 8 | name2 | name2 | name2 | varchar2(300) |
| 9 | name3 | name3 | name3 | varchar2(300) |
| 10 | name4 | name4 | name4 | varchar2(300) |
| 11 | name5 | name5 | name5 | varchar2(300) |
| 12 | name6 | name6 | name6 | varchar2(300) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_sscorg | pk_sscorg | pk_sscorg | varchar2(20) | √ |
| 16 | ssc_busireg1 | ssc_busireg1 | ssc_busireg1 | char(1) |
| 17 | ssc_busireg2 | ssc_busireg2 | ssc_busireg2 | char(1) |
| 18 | ssc_busireg3 | ssc_busireg3 | ssc_busireg3 | char(1) |
| 19 | ssc_busireg4 | ssc_busireg4 | ssc_busireg4 | char(1) |
| 20 | ssc_busireg5 | ssc_busireg5 | ssc_busireg5 | char(1) |
| 21 | ssc_busireg6 | ssc_busireg6 | ssc_busireg6 | char(1) |
| 22 | ssc_busireg7 | ssc_busireg7 | ssc_busireg7 | char(1) |
| 23 | ssc_busireg8 | ssc_busireg8 | ssc_busireg8 | char(1) |
| 24 | ssc_busireg9 | ssc_busireg9 | ssc_busireg9 | char(1) |
| 25 | ssc_busireg10 | ssc_busireg10 | ssc_busireg10 | char(1) |
| 26 | ssc_busireg11 | ssc_busireg11 | ssc_busireg11 | char(1) |
| 27 | ssc_busireg12 | ssc_busireg12 | ssc_busireg12 | char(1) |
| 28 | ssc_busireg13 | ssc_busireg13 | ssc_busireg13 | char(1) |
| 29 | ssc_busireg14 | ssc_busireg14 | ssc_busireg14 | char(1) |
| 30 | ssc_busireg15 | ssc_busireg15 | ssc_busireg15 | char(1) |
| 31 | ssc_busiregname | ssc_busiregname | ssc_busiregname | varchar2(100) |
| 32 | venddate | venddate | venddate | char(19) |
| 33 | vname | vname | vname | varchar2(75) |
| 34 | vno | vno | vno | varchar2(50) |
| 35 | vstartdate | vstartdate | vstartdate | char(19) |
| 36 | creationtime | creationtime | creationtime | char(19) |
| 37 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 38 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 39 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 40 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 41 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |