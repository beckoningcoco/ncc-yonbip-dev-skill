# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11712.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | pk_trantype | pk_trantype | char(20) | √ |
| 2 | baddmanualflag | baddmanualflag | baddmanualflag | char(1) |  |  | 'Y' |
| 3 | bautogatheringflag | bautogatheringflag | bautogatheringflag | char(1) |  |  | 'N' |
| 4 | bautovoucherflag | bautovoucherflag | bautovoucherflag | char(1) |  |  | 'N' |
| 5 | boffsetinvoiceflag | boffsetinvoiceflag | boffsetinvoiceflag | char(1) |  |  | 'Y' |
| 6 | boffsetorderflag | boffsetorderflag | boffsetorderflag | char(1) |  |  | 'Y' |
| 7 | bsubinvcustflag | bsubinvcustflag | bsubinvcustflag | char(1) |  |  | 'N' |
| 8 | bsubsaleorgflag | bsubsaleorgflag | bsubsaleorgflag | char(1) |  |  | 'N' |
| 9 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 10 | fpaymentflag | fpaymentflag | fpaymentflag | number(38, 0) |  |  | 1 |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |