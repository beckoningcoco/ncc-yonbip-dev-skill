# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8238.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_business | pk_business | pk_business | char(20) | √ |
| 2 | bbracketorder | bbracketorder | bbracketorder | char(1) |  |  | 'N' |
| 3 | controltype | controltype | controltype | number(22, 0) |
| 4 | ctrantypeid | ctrantypeid | ctrantypeid | char(20) |  |  | '~' |
| 5 | fpricepattern | fpricepattern | fpricepattern | number(22, 0) |  |  | 1 |
| 6 | ismustcontrol | ismustcontrol | ismustcontrol | number(22, 0) |
| 7 | memo | memo | memo | varchar2(181) |
| 8 | nbusitype | nbusitype | nbusitype | number(22, 0) |
| 9 | ndatactlstyle | ndatactlstyle | ndatactlstyle | number(22, 0) |
| 10 | ninvctlstyle | ninvctlstyle | ninvctlstyle | number(22, 0) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | rate | rate | rate | number(28, 8) |
| 13 | rec_or_pay | rec_or_pay | rec_or_pay | number(22, 0) |
| 14 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 15 | vtrantypename | vtrantypename | vtrantypename | varchar2(50) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |