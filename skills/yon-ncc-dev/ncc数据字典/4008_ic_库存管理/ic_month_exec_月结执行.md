# |<<

**月结执行 (ic_month_exec / nc.vo.ic.mobalance.entity.MonthExecVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2927.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | 集团主键 | pk_group | char(20) | √ | 组织_集团 (group) |
| 2 | dyearmonth | 年月份 | dyearmonth | varchar(7) | √ | 字符串 (String) |
| 3 | bonhandflag | 是否结存月 | bonhandflag | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 4 | bsign | 是否签字记录 | bsign | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 5 | pk_calbody | 库存组织 | pk_calbody | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |