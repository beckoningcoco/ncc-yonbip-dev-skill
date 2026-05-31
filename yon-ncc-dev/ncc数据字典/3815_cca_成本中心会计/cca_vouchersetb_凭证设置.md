# |<<

**凭证设置 (cca_vouchersetb / nc.vo.cca.rulescheme.expenseaccrual.VoucherSetBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1308.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchersetb | 凭证设置主键 | pk_vouchersetb | char(20) | √ | 主键 (UFID) |
| 2 | pk_vouchertype | 计提方凭证类别 | pk_vouchertype | varchar(20) |  | 责任凭证类别 (vouchertype) |
| 3 | accrualvoucherabs | 计提方凭证摘要 | accrualvoucherabs | varchar(20) |  | 常用摘要 (summary) |
| 4 | pk_accrualsubject | 计提方入账科目 | pk_accrualsubject | varchar(20) |  | 会计科目 (accasoa) |
| 5 | pk_accrualasscount | 计提方辅助核算 | pk_accrualasscount | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 6 | accuraldire | 计提方入账方向 | accuraldire | int |  | 入账方向 (accountdirectenum) |  | 1=借; |