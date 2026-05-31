# |<<

**展期版本 (icdmc_extinfo_v / nc.vo.icdmc.icdmc.financepay.version.ExtInfoVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3038.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version_b | 主键 | pk_version_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_iextinfo_b | 子表pk | pk_iextinfo_b | char(20) |  | 主键 (UFID) |
| 3 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 4 | pk_rate | 展期利率 | pk_rate | varchar(20) |  | 利率编码 (fi_ratecode) |
| 5 | extmny | 展期金额 | extmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | olcextmny | 展期组织本币金额 | olcextmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | glcextmny | 展期集团本币金额 | glcextmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | gllcextmny | 展期全局本币金额 | gllcextmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | extbegindate | 展期开始日期 | extbegindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 10 | extenddate | 展期结束日期 | extenddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 11 | floatscale | 浮动比例 | floatscale | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | floatpoint | 浮动点数 | floatpoint | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 14 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |