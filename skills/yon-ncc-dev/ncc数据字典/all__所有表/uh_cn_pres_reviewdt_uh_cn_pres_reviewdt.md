# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12546.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnpresviewdt | pk_cnpresviewdt | pk_cnpresviewdt | char(20) | √ |
| 2 | desc_review | desc_review | desc_review | varchar2(50) |
| 3 | name_preview | name_preview | name_preview | varchar2(50) |
| 4 | pk_cnpresview | pk_cnpresview | pk_cnpresview | char(20) | √ |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_preview | pk_preview | pk_preview | varchar2(20) |  |  | '~' |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |