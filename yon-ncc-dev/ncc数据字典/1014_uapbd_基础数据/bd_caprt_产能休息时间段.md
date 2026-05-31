# |<<

**产能休息时间段 (bd_caprt / nc.vo.bd.shift.CapRTVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/384.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_caprt | 产能休息时间段主键 | pk_caprt | varchar(50) | √ | 字符串 (String) |
| 2 | pk_shift | 班次主键 | pk_shift | varchar(20) |  | 班次 (bdshift) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 5 | timeid | 序号 | timeid | int |  | 整数 (Integer) |
| 6 | beginday | 开始日期 | beginday | int |  | 相对日期枚举 (reladateenum) |  | -1=前一日; |