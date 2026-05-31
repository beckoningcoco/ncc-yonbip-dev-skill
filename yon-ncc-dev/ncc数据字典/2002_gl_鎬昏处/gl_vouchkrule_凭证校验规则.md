# |<<

**凭证校验规则 (gl_vouchkrule / nc.vo.gl.vouchkrule.VoucherCheckRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2512.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchkrule | 主键 | pk_vouchkrule | char(20) | √ | 主键 (UFID) |
| 2 | code | 规则编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 规则名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | accountrule | 科目关系 | accountrule | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | cashaccrule | 现金银行科目控制 | cashaccrule | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | voukindrule | 凭证类别约束 | voukindrule | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | accbalancerule | 科目余额控制 | accbalancerule | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 字符串 (String) |
| 9 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 字符串 (String) |
| 10 | remark | 备注 | remark | varchar(200) |  | 备注 (Memo) |
| 11 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |