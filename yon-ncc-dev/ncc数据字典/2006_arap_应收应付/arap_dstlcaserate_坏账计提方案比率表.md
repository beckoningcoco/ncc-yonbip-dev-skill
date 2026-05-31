# |<<

**坏账计提方案比率表 (arap_dstlcaserate / nc.vo.arap.badacc.DstlCaseRateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/179.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dstlcaserate | 坏帐计提子方案比率主键 | pk_dstlcaserate | char(20) | √ | 主键 (UFID) |
| 2 | pk_dstlcase | 坏帐计提方案主键 | pk_dstlcase | char(20) |  | 主键 (UFID) |
| 3 | pk_dstlcase_b | 坏帐计提子方案主键 | pk_dstlcase_b | char(20) |  | 主键 (UFID) |
| 4 | pk_dstlcase_b_b | 坏帐计提子方案辅表主键 | pk_dstlcase_b_b | char(20) |  | 主键 (UFID) |
| 5 | dstlyear | 会计年度 | dstlyear | char(4) |  | 主键 (UFID) |
| 6 | dstldrt | 会计期间 | dstldrt | varchar(2) |  | 字符串 (String) |
| 7 | percnt | 计提百分比 | percnt | decimal(9, 6) |  | 数值 (UFDouble) |
| 8 | isdstled | 是否计提 | isdstled | char(1) |  | 布尔类型 (UFBoolean) |