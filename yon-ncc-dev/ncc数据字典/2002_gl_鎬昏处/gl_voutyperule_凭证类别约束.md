# |<<

**凭证类别约束 (gl_voutyperule / nc.vo.gl.vouchkrule.VouTypeRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2516.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voutyperule | 主键 | pk_voutyperule | char(20) | √ | 主键 (UFID) |
| 2 | pk_vouchertype | 凭证类别 | pk_vouchertype | varchar(20) |  | 凭证类别 (vouchertype) |
| 3 | unmultidorc | 不允许多借多贷 | unmultidorc | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | orintnotzero | 不允许借方或贷方合计为0 | orintnotzero | char(1) |  | 布尔类型 (UFBoolean) |