# |<<

**会计期间档案 (bd_accperiod / nc.vo.bd.period.AccperiodVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/314.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accperiod | 会计年度主键 | pk_accperiod | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | periodyear | 会计年度 | periodyear | char(4) | √ | 字符串 (String) |
| 5 | begindate | 起始日期 | begindate | char(19) | √ | 日期 (UFDate) |
| 6 | enddate | 终止日期 | enddate | char(19) | √ | 日期 (UFDate) |
| 7 | periodnum | 会计期间个数 | periodnum | smallint | √ | 整数 (Integer) |
| 8 | islesstwelve | 期间个数小于12 | islesstwelve | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | quarternum | 会计季度个数 | quarternum | smallint | √ | 整数 (Integer) |
| 10 | halfyearnum | 会计半年个数 | halfyearnum | smallint | √ | 整数 (Integer) |
| 11 | isadjustable | 是否启用调整 | isadjustable | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_accperiodscheme | 期间方案主键 | pk_accperiodscheme | char(20) | √ | 会计期间方案 (accperiodscheme) |
| 13 | dataoriginflag | 分布式字段 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |