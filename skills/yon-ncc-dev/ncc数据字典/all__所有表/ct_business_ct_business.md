# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7734.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_business | pk_business | pk_business | char(20) | √ |
| 2 | bbracketorder | bbracketorder | bbracketorder | char(1) |  |  | 'N' |
| 3 | bshowpayterm | bshowpayterm | bshowpayterm | char(1) |  |  | 'N' |
| 4 | controltype | controltype | controltype | number(38, 0) |
| 5 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 6 | fpricepattern | fpricepattern | fpricepattern | number(38, 0) |  |  | 1 |
| 7 | ismustcontrol | ismustcontrol | ismustcontrol | number(38, 0) |
| 8 | memo | memo | memo | varchar2(181) |
| 9 | nbusitype | nbusitype | nbusitype | number(38, 0) |
| 10 | ndatactlstyle | ndatactlstyle | ndatactlstyle | number(38, 0) |
| 11 | ninvctlstyle | ninvctlstyle | ninvctlstyle | number(38, 0) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | rate | rate | rate | number(20, 8) |
| 14 | rec_or_pay | rec_or_pay | rec_or_pay | number(38, 0) |
| 15 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 16 | vtrantypename | vtrantypename | vtrantypename | varchar2(50) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |