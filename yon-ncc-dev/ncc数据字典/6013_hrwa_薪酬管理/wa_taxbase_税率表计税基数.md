# |<<

**税率表计税基数 (wa_taxbase / nc.vo.wa.taxrate.TaxBaseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6359.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_taxbase | 税率表计税基数主键 | pk_wa_taxbase | char(20) | √ | 主键 (UFID) |
| 2 | code | 税率表编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 表名称 | name | varchar(100) |  | 多语文本 (MultiLangText) |
| 4 | ndebuctlowest | 最低扣除费用 | ndebuctlowest | decimal(31, 8) |  | 数值 (UFDouble) | 0 |
| 5 | ndebuctamount | 费用扣除 | ndebuctamount | decimal(31, 8) |  | 数值 (UFDouble) | 0 |
| 6 | nfixrate | 固定税率 | nfixrate | decimal(9, 6) |  | 数值 (UFDouble) | 0 |
| 7 | ndebuctrate | 扣除费用比例 | ndebuctrate | decimal(9, 6) |  | 数值 (UFDouble) | 0 |
| 8 | itbltype | 表类型 | itbltype | int |  | 税率表类型 (taxTableTypeEnum) | 0 | 0=工资薪金所得扣税; |