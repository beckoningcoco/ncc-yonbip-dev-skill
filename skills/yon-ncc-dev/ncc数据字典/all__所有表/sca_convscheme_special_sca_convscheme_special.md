# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11402.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | specialmatid | specialmatid | specialmatid | char(20) | √ |
| 2 | ccosttypeid | ccosttypeid | ccosttypeid | varchar2(20) |  |  | '~' |
| 3 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |  |  | '~' |
| 4 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 5 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 6 | cmatpricecoefficient | cmatpricecoefficient | cmatpricecoefficient | number(28, 8) |
| 7 | cproductorid | cproductorid | cproductorid | varchar2(20) |  |  | '~' |
| 8 | cprojectid | cprojectid | cprojectid | varchar2(20) |  |  | '~' |
| 9 | cvendorid | cvendorid | cvendorid | varchar2(20) |  |  | '~' |
| 10 | materialhashkey | materialhashkey | materialhashkey | number(38, 0) |
| 11 | materialinfo | materialinfo | materialinfo | varchar2(1450) |
| 12 | pk_convscheme | pk_convscheme | pk_convscheme | char(20) |
| 13 | vmatpricesource | vmatpricesource | vmatpricesource | number(38, 0) |  |  | 1 |
| 14 | vbfree1 | vbfree1 | vbfree1 | varchar2(101) |  |  | '~' |
| 15 | vbfree2 | vbfree2 | vbfree2 | varchar2(101) |  |  | '~' |
| 16 | vbfree3 | vbfree3 | vbfree3 | varchar2(101) |  |  | '~' |
| 17 | vbfree4 | vbfree4 | vbfree4 | varchar2(101) |  |  | '~' |
| 18 | vbfree5 | vbfree5 | vbfree5 | varchar2(101) |  |  | '~' |
| 19 | vbfree6 | vbfree6 | vbfree6 | varchar2(101) |  |  | '~' |
| 20 | vbfree7 | vbfree7 | vbfree7 | varchar2(101) |  |  | '~' |
| 21 | vbfree8 | vbfree8 | vbfree8 | varchar2(101) |  |  | '~' |
| 22 | vbfree9 | vbfree9 | vbfree9 | varchar2(101) |  |  | '~' |
| 23 | vbfree10 | vbfree10 | vbfree10 | varchar2(101) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |