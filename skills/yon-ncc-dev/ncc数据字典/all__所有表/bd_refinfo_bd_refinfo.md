# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7051.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_refinfo | pk_refinfo | pk_refinfo | char(20) | √ |
| 2 | code | code | code | varchar2(100) | √ |
| 3 | isneedpara | isneedpara | isneedpara | char(1) |
| 4 | isspecialref | isspecialref | isspecialref | char(1) |
| 5 | istreelazyload | istreelazyload | istreelazyload | char(1) | √ |  | 'Y' |
| 6 | layer | layer | layer | number(38, 0) |
| 7 | metadatanamespace | metadatanamespace | metadatanamespace | varchar2(100) |
| 8 | metadatatypename | metadatatypename | metadatatypename | varchar2(100) |
| 9 | mobilerefpath | mobilerefpath | mobilerefpath | varchar2(200) |
| 10 | modulename | modulename | modulename | varchar2(100) | √ |
| 11 | name | name | name | varchar2(300) | √ |
| 12 | para1 | para1 | para1 | varchar2(100) |
| 13 | para2 | para2 | para2 | varchar2(100) |
| 14 | para3 | para3 | para3 | varchar2(100) |
| 15 | pk_country | pk_country | pk_country | varchar2(20) |
| 16 | pk_industry | pk_industry | pk_industry | varchar2(20) |
| 17 | refclass | refclass | refclass | varchar2(200) |
| 18 | refpath | refpath | refpath | varchar2(200) |
| 19 | refsystem | refsystem | refsystem | varchar2(100) |
| 20 | reftype | reftype | reftype | number(38, 0) | √ |
| 21 | reserv1 | reserv1 | reserv1 | varchar2(100) |
| 22 | reserv2 | reserv2 | reserv2 | varchar2(100) |
| 23 | reserv3 | reserv3 | reserv3 | varchar2(100) |
| 24 | resid | resid | resid | varchar2(200) | √ |
| 25 | residpath | residpath | residpath | varchar2(100) |
| 26 | wherepart | wherepart | wherepart | varchar2(500) |
| 27 | workflowconditionuseunitorg | workflowconditionuseunitorg | workflowconditionuseunitorg | char(1) |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |