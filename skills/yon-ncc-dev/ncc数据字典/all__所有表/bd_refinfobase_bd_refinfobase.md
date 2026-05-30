# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7052.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_refinfo | pk_refinfo | pk_refinfo | char(20) | √ |
| 2 | code | code | code | varchar2(100) | √ |
| 3 | isneedpara | isneedpara | isneedpara | char(1) |
| 4 | isspecialref | isspecialref | isspecialref | char(1) |
| 5 | layer | layer | layer | number(38, 0) |
| 6 | metadatatypename | metadatatypename | metadatatypename | varchar2(100) |
| 7 | modulename | modulename | modulename | varchar2(100) | √ |
| 8 | name | name | name | varchar2(300) | √ |
| 9 | para1 | para1 | para1 | varchar2(100) |
| 10 | para2 | para2 | para2 | varchar2(100) |
| 11 | para3 | para3 | para3 | varchar2(100) |
| 12 | pk_country | pk_country | pk_country | varchar2(20) |
| 13 | pk_industry | pk_industry | pk_industry | varchar2(20) |
| 14 | refclass | refclass | refclass | varchar2(200) |
| 15 | refsystem | refsystem | refsystem | varchar2(100) |
| 16 | reftype | reftype | reftype | number(38, 0) | √ |
| 17 | reserv1 | reserv1 | reserv1 | varchar2(100) |
| 18 | reserv2 | reserv2 | reserv2 | varchar2(100) |
| 19 | reserv3 | reserv3 | reserv3 | varchar2(100) |
| 20 | resid | resid | resid | varchar2(200) | √ |
| 21 | residpath | residpath | residpath | varchar2(100) |
| 22 | wherepart | wherepart | wherepart | varchar2(500) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |