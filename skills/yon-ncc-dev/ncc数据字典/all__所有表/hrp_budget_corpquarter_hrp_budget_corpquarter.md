# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8760.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budget_corpquarter | pk_budget_corpquarter | pk_budget_corpquarter | char(20) | √ |
| 2 | corpyear | corpyear | corpyear | char(4) | √ |
| 3 | corp_version | corp_version | corp_version | number(38, 0) |
| 4 | datasource | datasource | datasource | number(38, 0) |
| 5 | isapproved | isapproved | isapproved | char(1) |
| 6 | isreleased | isreleased | isreleased | char(1) |
| 7 | pk_corp | pk_corp | pk_corp | char(20) | √ |
| 8 | pk_fathermember | pk_fathermember | pk_fathermember | char(20) |
| 9 | pk_fatherorg | pk_fatherorg | pk_fatherorg | char(20) |
| 10 | pk_group | pk_group | pk_group | char(20) | √ |
| 11 | pk_hrorg | pk_hrorg | pk_hrorg | char(20) |
| 12 | pk_org | pk_org | pk_org | char(20) | √ |
| 13 | pk_vid | pk_vid | pk_vid | char(20) |
| 14 | quarter | quarter | quarter | char(2) | √ |
| 15 | creationtime | creationtime | creationtime | char(19) | √ |
| 16 | creator | creator | creator | char(20) | √ |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | char(20) |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |