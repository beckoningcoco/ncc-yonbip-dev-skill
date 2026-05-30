# |<<

**会计期间方案映射详细信息 (bd_periodmappingdetail / nc.vo.bd.periodmapping.PeriodmappingdetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/924.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_periodmappingdetail | 主键 | pk_periodmappingdetail | char(20) | √ | 主键 (UFID) |
| 2 | targetperiodyear | 目标会计年度 | targetperiodyear | varchar(50) |  | 字符串 (String) |
| 3 | targetperiodmonth | 目标方案会计月 | targetperiodmonth | varchar(20) |  | 会计月份 (accperiodmonth) |
| 4 | sourcebeginperiodmth | 来源方案起始会计月 | sourcebeginperiodmth | varchar(20) |  | 会计月份 (accperiodmonth) |
| 5 | sourceendperiodmth | 来源方案截止会计月 | sourceendperiodmth | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | periodyear | 会计年度真实值 | periodyear | varchar(50) |  | 字符串 (String) |