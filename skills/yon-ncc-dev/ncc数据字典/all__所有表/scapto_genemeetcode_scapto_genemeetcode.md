# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11319.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_genemeetcode | pk_genemeetcode | pk_genemeetcode | char(20) | √ |
| 2 | imonth | imonth | imonth | number(38, 0) |
| 3 | iserailno | iserailno | iserailno | number(38, 0) |
| 4 | pk_decidemeettype | pk_decidemeettype | pk_decidemeettype | varchar2(50) |
| 5 | pk_group | pk_group | pk_group | char(20) | √ |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 8 | vyear | vyear | vyear | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |