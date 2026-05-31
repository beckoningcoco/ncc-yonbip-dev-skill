# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11735.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | pk_trantype | pk_trantype | char(20) | √ |
| 2 | bareamatrule | bareamatrule | bareamatrule | char(1) |
| 3 | bautocloseflag | bautocloseflag | bautocloseflag | char(1) |
| 4 | bbalatypematrule | bbalatypematrule | bbalatypematrule | char(1) |
| 5 | bchanmatrule | bchanmatrule | bchanmatrule | char(1) |
| 6 | bcurrtypematrule | bcurrtypematrule | bcurrtypematrule | char(1) |
| 7 | bcustmatrule | bcustmatrule | bcustmatrule | char(1) |
| 8 | bdeptmatrule | bdeptmatrule | bdeptmatrule | char(1) |
| 9 | bdiscounteditable | bdiscounteditable | bdiscounteditable | char(1) |
| 10 | bempmatrule | bempmatrule | bempmatrule | char(1) |
| 11 | bfailqteditable | bfailqteditable | bfailqteditable | char(1) |
| 12 | bmorerows | bmorerows | bmorerows | char(1) |  |  | 'N' |
| 13 | bpaytermmatrule | bpaytermmatrule | bpaytermmatrule | char(1) |
| 14 | bquallevelmatrule | bquallevelmatrule | bquallevelmatrule | char(1) |
| 15 | bquotypematrule | bquotypematrule | bquotypematrule | char(1) |
| 16 | bsendtypematrule | bsendtypematrule | bsendtypematrule | char(1) |
| 17 | bsuccqteditable | bsuccqteditable | bsuccqteditable | char(1) |
| 18 | bunitmatrule | bunitmatrule | bunitmatrule | char(1) |
| 19 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |
| 20 | fhistoryflag | fhistoryflag | fhistoryflag | varchar2(50) | √ |
| 21 | fmodifymny | fmodifymny | fmodifymny | number(38, 0) |
| 22 | fsourceflag | fsourceflag | fsourceflag | varchar2(50) | √ |
| 23 | iavgmonth | iavgmonth | iavgmonth | number(38, 0) |
| 24 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 25 | vmatchrule | vmatchrule | vmatchrule | varchar2(100) |
| 26 | vtrantype | vtrantype | vtrantype | varchar2(20) |  |  | '~' |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |