# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11702.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | climitlevelid | climitlevelid | climitlevelid | char(20) | √ |
| 2 | ccreditlevelid | ccreditlevelid | ccreditlevelid | varchar2(20) |  |  | '~' |
| 3 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 4 | climittypeid | climittypeid | climittypeid | varchar2(20) |  |  | '~' |
| 5 | dfromdate | dfromdate | dfromdate | char(19) |
| 6 | dtodate | dtodate | dtodate | char(19) |
| 7 | nlimitmny | nlimitmny | nlimitmny | number(28, 8) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |