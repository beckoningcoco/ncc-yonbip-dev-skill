# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8781.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_research | pk_research | pk_research | char(20) | √ |
| 2 | pk_area | pk_area | pk_area | char(20) |
| 3 | pk_group | pk_group | pk_group | char(20) |
| 4 | pk_org | pk_org | pk_org | char(20) |
| 5 | pk_orgunit | pk_orgunit | pk_orgunit | char(20) |
| 6 | pk_rival | pk_rival | pk_rival | char(20) |
| 7 | pk_trade | pk_trade | pk_trade | char(20) |
| 8 | remark | remark | remark | varchar2(2048) |
| 9 | research_code | research_code | research_code | varchar2(28) |
| 10 | research_type | research_type | research_type | number(38, 0) | √ |  | 203 |
| 11 | research_year | research_year | research_year | char(4) | √ |
| 12 | creationtime | creationtime | creationtime | char(19) | √ |
| 13 | creator | creator | creator | char(20) | √ |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | char(20) |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |