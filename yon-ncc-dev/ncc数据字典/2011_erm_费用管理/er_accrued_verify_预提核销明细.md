# |<<

**预提核销明细 (er_accrued_verify / nc.vo.erm.accruedexpense.AccruedVerifyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1873.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accrued_verify | 唯一标识 | pk_accrued_verify | char(20) | √ | 主键 (UFID) |
| 2 | pk_accrued_detail | 预提明细行 | pk_accrued_detail | varchar(20) | √ | 预提明细 (accrued_detail) |
| 3 | pk_bxd | 报销单 | pk_bxd | varchar(20) | √ | 报销单 (bxzb) |
| 4 | verify_amount | 核销金额 | verify_amount | decimal(28, 8) | √ | 数值 (UFDouble) |
| 5 | org_verify_amount | 组织本币核销金额 | org_verify_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | group_verify_amount | 集团本币核销金额 | group_verify_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | global_verify_amount | 全局本币核销金额 | global_verify_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | verify_man | 核销人 | verify_man | char(20) | √ | 用户 (user) |
| 9 | verify_date | 核销日期 | verify_date | char(19) | √ | 日期 (UFDate) |
| 10 | effectstatus | 生效状态 | effectstatus | int |  | 生效标志 (effectstatus) |  | 0=未生效; |