# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7183.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdcate | pk_pdcate | pk_pdcate | char(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | dt_pdtype | dt_pdtype | dt_pdtype | varchar2(50) |
| 4 | eu_pdoutmode | eu_pdoutmode | eu_pdoutmode | number(38, 0) |
| 5 | eu_pricemode | eu_pricemode | eu_pricemode | number(38, 0) |
| 6 | flag_pati | flag_pati | flag_pati | char(1) |
| 7 | mnecode | mnecode | mnecode | varchar2(50) | √ |
| 8 | name | name | name | varchar2(200) | √ |
| 9 | name2 | name2 | name2 | varchar2(200) |
| 10 | name3 | name3 | name3 | varchar2(200) |
| 11 | name4 | name4 | name4 | varchar2(200) |
| 12 | name5 | name5 | name5 | varchar2(200) |
| 13 | name6 | name6 | name6 | varchar2(200) |
| 14 | pk_father | pk_father | pk_father | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |