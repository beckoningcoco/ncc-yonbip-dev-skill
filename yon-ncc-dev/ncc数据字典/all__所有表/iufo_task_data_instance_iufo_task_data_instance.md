# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9713.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_data_instance | pk_data_instance | pk_data_instance | char(20) | √ |
| 2 | autodel | autodel | autodel | char(1) |
| 3 | businessdata | businessdata | businessdata | blob |
| 4 | data_instance | data_instance | data_instance | blob |
| 5 | instancetype | instancetype | instancetype | number(38, 0) |  |  | 0 |
| 6 | instance_period | instance_period | instance_period | number(38, 0) |
| 7 | name | name | name | varchar2(200) |
| 8 | owner | owner | owner | char(20) |
| 9 | pk_group | pk_group | pk_group | char(20) |
| 10 | pk_org | pk_org | pk_org | char(20) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | char(20) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | char(20) |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |