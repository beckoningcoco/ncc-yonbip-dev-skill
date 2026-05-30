# |<<

**月结计算方案 (ic_month_scheme / nc.vo.ic.mobalance.entity.MonthSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2932.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_month_scheme | 月结计算方案主键 | pk_month_scheme | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | timeinterval | 时间间隔 | timeinterval | int |  | 整数 (Integer) |