# |<<

**坏账计提辅表 (arap_badaccdstl_b / nc.vo.arap.badacc.BadAccDstlDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/145.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_badaccdstl_b | 主键 | pk_badaccdstl_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_badaccdstl | 坏帐计提主表 | pk_badaccdstl | char(20) |  | 主键 (UFID) |
| 3 | pk_dstlcase_b | 坏帐计提方案辅表 | pk_dstlcase_b | char(20) |  | 主键 (UFID) |
| 4 | pk_dstlcase_b_b | 坏帐计提方案辅辅表 | pk_dstlcase_b_b | char(20) |  | 主键 (UFID) |
| 5 | percnt | 计提比率 | percnt | decimal(9, 6) |  | 数值 (UFDouble) |
| 6 | rcvmoeny | 应收账款总额 | rcvmoeny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | premoney | 坏账准备 | premoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | leftmoney | 本期余额 | leftmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | preleftmoney | 坏账准备余额 | preleftmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | dstlmoney | 本次计提 | dstlmoney | decimal(28, 8) |  | 数值 (UFDouble) |