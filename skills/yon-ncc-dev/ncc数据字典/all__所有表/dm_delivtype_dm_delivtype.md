# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7789.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | pk_trantype | pk_trantype | char(20) | √ |
| 2 | barfeeflag | barfeeflag | barfeeflag | char(1) |
| 3 | bcalculateapfeeflag | bcalculateapfeeflag | bcalculateapfeeflag | char(1) |
| 4 | bcalculatearfeeflag | bcalculatearfeeflag | bcalculatearfeeflag | char(1) |
| 5 | bcanselfmadeflag | bcanselfmadeflag | bcanselfmadeflag | char(1) |
| 6 | bcheckvolumnflag | bcheckvolumnflag | bcheckvolumnflag | char(1) |
| 7 | bcheckweightflag | bcheckweightflag | bcheckweightflag | char(1) |
| 8 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 9 | fallocatescopeflag | fallocatescopeflag | fallocatescopeflag | number(38, 0) |  |  | 0 |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |