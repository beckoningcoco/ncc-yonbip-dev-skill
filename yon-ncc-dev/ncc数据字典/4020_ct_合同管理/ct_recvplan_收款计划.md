# |<<

**收款计划 (ct_recvplan / nc.vo.ct.saledaily.entity.RecvPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1673.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_recvplan | 收款计划主键 | pk_ct_recvplan | char(20) | √ | 主键 (UFID) |
| 2 | iaccounttermno | 收款期 | iaccounttermno | int |  | 整数 (Integer) |
| 3 | dbegindate | 账期起算日 | dbegindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 4 | denddate | 账期到期日 | denddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 5 | dinsideenddate | 内控到期日期 | dinsideenddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 6 | nrate | 收款比例（%） | nrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | norigmny | 金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ntotalorigmny | 总收款金额 | ntotalorigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | bpreflag | 预收标记 | bpreflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | feffdatetype | 起效依据 | feffdatetype | varchar(20) |  | 收款时点 (incomeperiod) |
| 11 | iitermdays | 账期天数 | iitermdays | int |  | 整数 (Integer) |
| 12 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |