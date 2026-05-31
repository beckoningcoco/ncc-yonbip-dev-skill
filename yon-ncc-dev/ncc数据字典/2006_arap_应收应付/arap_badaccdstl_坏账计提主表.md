# |<<

**坏账计提主表 (arap_badaccdstl / nc.vo.arap.badacc.BadAccDstlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/144.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_badaccdstl | 主键 | pk_badaccdstl | char(20) | √ | 主键 (UFID) |
| 2 | pk_dstlcase | 计提方案主表 | pk_dstlcase | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | dstlyr | 年度 | dstlyr | char(4) |  | 主键 (UFID) |
| 5 | duration | 期间 | duration | char(2) |  | 主键 (UFID) |
| 6 | lastyr | 最近计提年度 | lastyr | char(4) |  | 主键 (UFID) |
| 7 | lastdrt | 最近计提期间 | lastdrt | char(2) |  | 主键 (UFID) |
| 8 | distillor | 计提人 | distillor | varchar(20) |  | 用户 (user) |
| 9 | dstlmoneys | 计提金额 | dstlmoneys | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | premoney | 坏帐准备 | premoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | dstlmoney | 本次计提 | dstlmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | lastdistillor | 上次计提人 | lastdistillor | varchar(20) |  | 用户 (user) |
| 13 | lastdstlmoney | 上次计提金额 | lastdstlmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | dstldt | 计提日期 | dstldt | char(19) |  | 日期 (UFDate) |
| 15 | lastdstldt | 最近计提日期 | lastdstldt | char(19) |  | 日期 (UFDate) |