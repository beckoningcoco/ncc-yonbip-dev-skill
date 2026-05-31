# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7951.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | djlxoid | djlxoid | djlxoid | char(20) | √ |
| 2 | bxtype | bxtype | bxtype | number(38, 0) |
| 3 | bx_percentage | bx_percentage | bx_percentage | number(15, 8) |
| 4 | creatcashflows | creatcashflows | creatcashflows | char(1) |
| 5 | defcurrency | defcurrency | defcurrency | char(20) |
| 6 | djdl | djdl | djdl | varchar2(2) | √ |
| 7 | djlxbm | djlxbm | djlxbm | varchar2(20) | √ |
| 8 | djlxjc | djlxjc | djlxjc | varchar2(50) |
| 9 | djlxjc_remark | djlxjc_remark | djlxjc_remark | varchar2(50) |
| 10 | djlxmc | djlxmc | djlxmc | varchar2(50) | √ |
| 11 | djlxmc_remark | djlxmc_remark | djlxmc_remark | varchar2(50) |
| 12 | djmboid | djmboid | djmboid | char(20) |
| 13 | dwbm | dwbm | dwbm | char(20) | √ |
| 14 | fcbz | fcbz | fcbz | char(1) | √ |
| 15 | isautocombinse | isautocombinse | isautocombinse | char(1) |
| 16 | isbankrecive | isbankrecive | isbankrecive | char(1) |
| 17 | iscasign | iscasign | iscasign | char(1) |  |  | 'N' |
| 18 | ischangedeptpsn | ischangedeptpsn | ischangedeptpsn | char(1) |  |  | 'N' |
| 19 | iscommit | iscommit | iscommit | char(1) |  |  | 'N' |
| 20 | iscontrast | iscontrast | iscontrast | char(1) | √ |  | 'Y' |
| 21 | iscorresp | iscorresp | iscorresp | char(1) |
| 22 | isidvalidated | isidvalidated | isidvalidated | char(1) |
| 23 | isjszxzf | isjszxzf | isjszxzf | number(38, 0) |
| 24 | isloadtemplate | isloadtemplate | isloadtemplate | char(1) | √ |  | 'Y' |
| 25 | isloan | isloan | isloan | char(1) |
| 26 | ispreparenetbank | ispreparenetbank | ispreparenetbank | char(1) |
| 27 | isqr | isqr | isqr | char(1) |
| 28 | issettleshow | issettleshow | issettleshow | char(1) |
| 29 | issxbeforewszz | issxbeforewszz | issxbeforewszz | char(1) |
| 30 | is_mactrl | is_mactrl | is_mactrl | char(1) |  |  | 'N' |
| 31 | limitcheck | limitcheck | limitcheck | char(1) |
| 32 | manualsettle | manualsettle | manualsettle | char(1) |  |  | 'N' |
| 33 | matype | matype | matype | number(38, 0) |  |  | 1 |
| 34 | mjbz | mjbz | mjbz | char(1) | √ |
| 35 | parent_billtype | parent_billtype | parent_billtype | varchar2(50) |
| 36 | personalloan | personalloan | personalloan | char(1) |  |  | 'Y' |
| 37 | pk_group | pk_group | pk_group | char(20) |
| 38 | pk_org | pk_org | pk_org | char(20) |
| 39 | refonlyonce | refonlyonce | refonlyonce | char(1) |  |  | 'N' |
| 40 | reimbursement | reimbursement | reimbursement | char(1) |
| 41 | scomment | scomment | scomment | varchar2(100) |
| 42 | sfbz | sfbz | sfbz | varchar2(2) |  |  | '3' |
| 43 | usesystem | usesystem | usesystem | varchar2(2) |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |