# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7796.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tariffdef_b | pk_tariffdef_b | pk_tariffdef_b | char(20) | √ |
| 2 | bbshowflag | bbshowflag | bbshowflag | char(1) |
| 3 | bhshowflag | bhshowflag | bhshowflag | char(1) |
| 4 | fdataitemflag | fdataitemflag | fdataitemflag | varchar2(20) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_tariffdef | pk_tariffdef | pk_tariffdef | char(20) | √ |
| 8 | vshowname | vshowname | vshowname | varchar2(200) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |