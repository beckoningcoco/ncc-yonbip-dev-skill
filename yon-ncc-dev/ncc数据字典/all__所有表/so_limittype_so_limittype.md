# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11703.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | climittypeid | climittypeid | climittypeid | char(20) | √ |
| 2 | bcontrolflag | bcontrolflag | bcontrolflag | char(1) |
| 3 | bcreditcheck | bcreditcheck | bcreditcheck | char(1) |
| 4 | bredbillflag | bredbillflag | bredbillflag | char(1) |
| 5 | bsubflag | bsubflag | bsubflag | char(1) |
| 6 | creditadd | creditadd | creditadd | char(1) |  |  | 'N' |
| 7 | creditcustomer | creditcustomer | creditcustomer | number(38, 0) |
| 8 | facclimitflag | facclimitflag | facclimitflag | number(38, 0) |
| 9 | fcalculateflag | fcalculateflag | fcalculateflag | number(38, 0) |
| 10 | fcreditflag | fcreditflag | fcreditflag | number(38, 0) |
| 11 | finneracclimitflag | finneracclimitflag | finneracclimitflag | number(38, 0) |
| 12 | fvoccupiedflag | fvoccupiedflag | fvoccupiedflag | number(38, 0) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | ratedateflag | ratedateflag | ratedateflag | number(38, 0) |  |  | 0 |
| 16 | vlimittypecode | vlimittypecode | vlimittypecode | varchar2(30) |
| 17 | vlimittypename | vlimittypename | vlimittypename | varchar2(45) |
| 18 | vlimittypename2 | vlimittypename2 | vlimittypename2 | varchar2(45) |
| 19 | vlimittypename3 | vlimittypename3 | vlimittypename3 | varchar2(45) |
| 20 | vlimittypename4 | vlimittypename4 | vlimittypename4 | varchar2(45) |
| 21 | vlimittypename5 | vlimittypename5 | vlimittypename5 | varchar2(45) |
| 22 | vlimittypename6 | vlimittypename6 | vlimittypename6 | varchar2(45) |
| 23 | vnote | vnote | vnote | varchar2(181) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |