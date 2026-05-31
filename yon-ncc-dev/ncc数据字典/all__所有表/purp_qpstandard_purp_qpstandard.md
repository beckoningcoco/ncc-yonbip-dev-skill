# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11068.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_qpstandard | pk_qpstandard | pk_qpstandard | char(20) | √ |
| 2 | blatest | blatest | blatest | char(1) |
| 3 | bseal | bseal | bseal | char(1) |
| 4 | dinvaliddate | dinvaliddate | dinvaliddate | varchar2(19) |
| 5 | dvaliddate | dvaliddate | dvaliddate | varchar2(19) |
| 6 | faccumtype | faccumtype | faccumtype | number(38, 0) |
| 7 | fstandardtype | fstandardtype | fstandardtype | number(38, 0) |
| 8 | fvaluetype | fvaluetype | fvaluetype | number(38, 0) |
| 9 | norgtype | norgtype | norgtype | number(38, 0) |
| 10 | nversion | nversion | nversion | number(38, 0) |
| 11 | pk_checkitem | pk_checkitem | pk_checkitem | varchar2(20) |  |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_qpstandardbase | pk_qpstandardbase | pk_qpstandardbase | char(20) |
| 16 | vbaselowlmt | vbaselowlmt | vbaselowlmt | varchar2(46) |
| 17 | vbaseuplmt | vbaseuplmt | vbaseuplmt | varchar2(46) |
| 18 | vmemo | vmemo | vmemo | varchar2(181) |
| 19 | vstandardcode | vstandardcode | vstandardcode | varchar2(46) |
| 20 | vstandardname | vstandardname | vstandardname | varchar2(300) |
| 21 | vstandardname2 | vstandardname2 | vstandardname2 | varchar2(300) |
| 22 | vstandardname3 | vstandardname3 | vstandardname3 | varchar2(300) |
| 23 | vstandardname4 | vstandardname4 | vstandardname4 | varchar2(300) |
| 24 | vstandardname5 | vstandardname5 | vstandardname5 | varchar2(300) |
| 25 | vstandardname6 | vstandardname6 | vstandardname6 | varchar2(300) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |