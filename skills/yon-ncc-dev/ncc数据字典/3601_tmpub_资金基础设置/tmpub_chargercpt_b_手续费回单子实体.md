# |<<

**手续费回单子实体 (tmpub_chargercpt_b / nc.vo.tmpub.chargercpt.ChargeRcptBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5757.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_chargercpt_b | 手续费回单子表主键 | pk_chargercpt_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_chargercpt_h | 手续费回单主表主键 | pk_chargercpt_h | varchar(20) |  | 手续费回单 (chargercpt_h) |
| 3 | busino | 业务号 | busino | varchar(20) |  | 开证登记 (lcm_openregister) |
| 4 | busino4view | 显示用业务号 | busino4view | varchar(50) |  | 字符串 (String) |
| 5 | chargeitem | 费用项目 | chargeitem | varchar(20) |  | 手续费项目档案 (chargerecord) |
| 6 | amount | 金额 | amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | olcamount | 组织本币金额 | olcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | glcamount | 集团本币金额 | glcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | gllcamount | 全局本币金额 | gllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 14 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 15 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 16 | pk_bearorg | 承担部门 | pk_bearorg | varchar(20) |  | 组织_部门 (dept) |
| 17 | pk_planitem | 计划项目 | pk_planitem | varchar(20) |  | 资金计划项目 (fundplan) |
| 18 | summary | 摘要 | summary | varchar(181) |  | 字符串 (String) |
| 19 | remark | 备注 | remark | varchar(181) |  | 字符串 (String) |
| 20 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |