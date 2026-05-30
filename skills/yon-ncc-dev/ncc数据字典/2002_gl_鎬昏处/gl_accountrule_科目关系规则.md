# |<<

**科目关系规则 (gl_accountrule / nc.vo.gl.vouchkrule.AccountRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2340.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accountrule | 主键 | pk_accountrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_vouchertype | 凭证类别 | pk_vouchertype | varchar(20) |  | 凭证类别 (vouchertype) |
| 3 | selfaccorint | 本方科目方向 | selfaccorint | int |  | 科目方向 (Balanorient) |  | 0=借方; |