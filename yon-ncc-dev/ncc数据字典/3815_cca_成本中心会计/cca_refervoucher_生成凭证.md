# |<<

**生成凭证 (cca_refervoucher / nc.vo.cca.execrule.ReferVoucherVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1293.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_refervoucher | 主键 | pk_refervoucher | char(20) | √ | 主键 (UFID) |
| 2 | type | 类别 | type | varchar(50) |  | 字符串 (String) |
| 3 | pk_costvoucher | 成本凭证 | pk_costvoucher | varchar(20) |  | 成本凭证单 (costvoucher) |
| 4 | pk_voucher | 责任凭证 | pk_voucher | varchar(20) |  | 责任凭证单 (DutyVoucher) |