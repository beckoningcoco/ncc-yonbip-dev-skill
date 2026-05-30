# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12189.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | pk_trantype | pk_trantype | char(20) | √ |
| 2 | baskpriceflag | baskpriceflag | baskpriceflag | char(1) |
| 3 | bhintflag | bhintflag | bhintflag | char(1) |
| 4 | botreverseflag | botreverseflag | botreverseflag | char(1) |
| 5 | breverseflag | breverseflag | breverseflag | char(1) |
| 6 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |
| 7 | fmodetypeflag | fmodetypeflag | fmodetypeflag | number(38, 0) |  |  | 0 |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |