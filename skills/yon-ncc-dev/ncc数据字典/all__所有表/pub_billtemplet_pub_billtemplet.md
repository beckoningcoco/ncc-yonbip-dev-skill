# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10904.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billtemplet | pk_billtemplet | pk_billtemplet | char(20) | √ |
| 2 | bill_templetcaption | bill_templetcaption | bill_templetcaption | varchar2(90) |
| 3 | bill_templetname | bill_templetname | bill_templetname | varchar2(60) |
| 4 | devorg | devorg | devorg | varchar2(20) |
| 5 | dividerproportion | dividerproportion | dividerproportion | varchar2(30) |
| 6 | funccode | funccode | funccode | varchar2(40) |
| 7 | layer | layer | layer | number(38, 0) |
| 8 | metadataclass | metadataclass | metadataclass | varchar2(100) |
| 9 | model_type | model_type | model_type | char(1) |
| 10 | modulecode | modulecode | modulecode | varchar2(10) |
| 11 | nodecode | nodecode | nodecode | varchar2(30) |
| 12 | options | options | options | varchar2(4000) |
| 13 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(10) |
| 14 | pk_corp | pk_corp | pk_corp | varchar2(20) |
| 15 | pk_org | pk_org | pk_org | char(20) |
| 16 | resid | resid | resid | varchar2(30) |
| 17 | shareflag | shareflag | shareflag | char(1) |
| 18 | validateformula | validateformula | validateformula | varchar2(1000) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |