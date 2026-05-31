# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7539.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |  | '~' |
| 2 | adjustrule | adjustrule | adjustrule | char(25) |
| 3 | djdl | djdl | djdl | varchar2(2) |
| 4 | djlxbm | djlxbm | djlxbm | varchar2(20) |  |  | '~' |
| 5 | djlxjc_remark | djlxjc_remark | djlxjc_remark | varchar2(50) |
| 6 | djlxmc_remark | djlxmc_remark | djlxmc_remark | varchar2(50) |
| 7 | djlxoid | djlxoid | djlxoid | char(20) | √ |
| 8 | dwbm | dwbm | dwbm | varchar2(20) |  |  | '~' |
| 9 | fcbz | fcbz | fcbz | char(1) |
| 10 | isautocombinsettle | isautocombinsettle | isautocombinsettle | char(1) |
| 11 | isbankrecive | isbankrecive | isbankrecive | char(1) |
| 12 | iscasign | iscasign | iscasign | char(1) |
| 13 | ischangedeptpsn | ischangedeptpsn | ischangedeptpsn | char(1) |
| 14 | iscommit | iscommit | iscommit | char(1) |
| 15 | iscorresp | iscorresp | iscorresp | char(1) |
| 16 | isdefault | isdefault | isdefault | char(1) |
| 17 | isfromweb | isfromweb | isfromweb | char(1) |
| 18 | isidvalidated | isidvalidated | isidvalidated | char(1) |
| 19 | isjr | isjr | isjr | char(1) |  |  | 'Y' |
| 20 | isloan | isloan | isloan | char(1) |
| 21 | ispreparenetbank | ispreparenetbank | ispreparenetbank | char(1) |
| 22 | isqr | isqr | isqr | char(1) |
| 23 | isself | isself | isself | char(1) |
| 24 | issettleshow | issettleshow | issettleshow | char(1) |
| 25 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 27 | scomment | scomment | scomment | varchar2(181) |
| 28 | sfbz | sfbz | sfbz | varchar2(2) |
| 29 | usesystem | usesystem | usesystem | varchar2(2) |
| 30 | verifyrule | verifyrule | verifyrule | char(25) |
| 31 | creationtime | creationtime | creationtime | char(19) |
| 32 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 33 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 34 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 35 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 36 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |